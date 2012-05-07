package metro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import metro.dijkstra.AlgorithmeDijkstra;
import metro.dijkstra.Tache;

/**
 *
 * @author David Rouyer
 */
public class Main {

    //Cette méthode n'a rien à faire dans le main
    //affiche un chemin
    public static void afficherChemin(List<Station> liste) {
        if ((liste == null) || (liste.isEmpty())) {
            System.out.print("Itinéraire impossible.\n");
        } else {
            for (Station station : liste) {
                if (station != null) {
                    System.out.print(station.getNom() + ", ");
                }
            }
        }
    }

    //Cette méthode n'a rien à faire dans le main
    //affiche la liste de tous les chemins
    public static void afficherListesChemins(List<Chemin> liste) {
        System.out.println("\nListe chemins : ");
        if ((liste == null) || (liste.isEmpty())) {
            System.out.print("vide.\n");
        } else {
            for (Chemin ch : liste) {
                if (ch != null) {
                    System.out.print("     " + ch.getCoutDistance() + ", ");
                    Main.afficherChemin(ch.getParcours());
                    System.out.println("");
                }
            }
        }
    }

    public static void main(String[] args) {
        Metro metro = new Metro();
        Utilisateur user = new Utilisateur("Patator", "password");
        Scanner sc = new Scanner(System.in);
        Chemin chemin = new Chemin(0);
        Station depart;
        Station arrivee;
        CheminMinStation algoMin = new CheminMinStation(metro);

        Ligne ligne1 = new Ligne(1, "Ligne 1");
        Station station1 = new Station(1, "La Défense", 10, 20, 5);
        Station station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        Station station3 = new Station(3, "Gare de Lyon", 10, -15, 8);
        Station station4 = new Station(4, "Château de Vincennes", 0, 20, 7);
        Voie voie1 = new Voie(1, station1, station2, 20);
        Voie voie2 = new Voie(2, station2, station3, 15);
        Voie voie3 = new Voie(3, station3, station4, 30);
        ligne1.ajouterVoie(voie1);
        ligne1.ajouterVoie(voie2);
        ligne1.ajouterVoie(voie3);
        metro.ajouterLigne(ligne1);

        Ligne ligne2 = new Ligne(2, "Ligne 2");
        Station station5 = new Station(5, "Porte Dauphine", 20, 20, 1);
        Station station6 = new Station(6, "Charles de Gaulle - Étoile", 25, 30, 7);
        Station station7 = new Station(7, "Place de Clichy", 30, 25, 3);
        Station station8 = new Station(8, "Jaurès", 30, 20, 8);
        Station station9 = new Station(9, "Belleville", 30, 30, 8);
        Station station10 = new Station(10, "Nation", 30, 40, 2);
        Voie voie4 = new Voie(4, station5, station6, 16);
        Voie voie5 = new Voie(5, station6, station7, 30);
        Voie voie6 = new Voie(6, station7, station8, 22);
        Voie voie7 = new Voie(7, station8, station9, 17);
        Voie voie8 = new Voie(8, station9, station10, 19);
        ligne2.ajouterVoie(voie4);
        ligne2.ajouterVoie(voie5);
        ligne2.ajouterVoie(voie6);
        ligne2.ajouterVoie(voie7);
        ligne2.ajouterVoie(voie8);
        metro.ajouterLigne(ligne2);

        Ligne ligne3 = new Ligne(3, "ligne 3");
        Station station11 = new Station(11, "Gambetta", 50, 50, 4);
        Station station12 = new Station(12, "Bécon", 50, 55, 6);
        Station station13 = new Station(13, "Saint-Lazare", 55, 50, 1);
        Station station14 = new Station(14, "Opéra", 60, 30, 8);
        Voie voie9 = new Voie(9, station1, station11, 3);
        Voie voie10 = new Voie(10, station11, station12, 3);
        Voie voie11 = new Voie(11, station12, station13, 4);
        Voie voie12 = new Voie(12, station13, station14, 5);
        Voie voie13 = new Voie(13, station14, station4, 6);
        ligne3.ajouterVoie(voie9);
        ligne3.ajouterVoie(voie10);
        ligne3.ajouterVoie(voie11);
        ligne3.ajouterVoie(voie12);
        ligne3.ajouterVoie(voie13);
        metro.ajouterLigne(ligne3);

        /*for (Map.Entry<Integer, Ligne> en : metro.getTabLignes().entrySet()) {
            Ligne ligne = en.getValue();
            System.out.println(ligne.getNom());
        }*/

        System.out.println("Welcome to Paris!");

        metro.afficherTabLignes();
        metro.afficherDetailsLignes();

        user.emplacementCourant();

        //a refaire selon les coordonnées entrées
        depart = station1;
        arrivee = station2;

        //chemin=CheminMinStation.algoRecherche(depart, arrivee);
        //afficherChemin(chemin);
        
        user.stationPlusProche(metro);
        //user.troisPlusProches(metro);

        Station dep = station1;
        Station arr = station4;
        System.out.println("Dijkstra");
        AlgorithmeDijkstra a = new AlgorithmeDijkstra(dep, arr, metro);
        ArrayList<Tache> res = a.resoudre();
        for (int i = 0; i < res.size(); i++) {
            Tache tache = res.get(i);
            System.out.println(tache.getTache().getNom());
        }
    }
}
