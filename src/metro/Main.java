package metro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import metro.algoChangementMin.Chemin;
import metro.algoChangementMin.CheminMinStation;
import metro.dijkstra.AlgorithmeDijkstra;
import metro.dijkstra.Tache;

/**
 *
 * @author David Rouyer
 */
public class Main {

    //Cette methode n'a rien a faire dans le main
    //affiche un chemin
    public static void afficherChemin(List<Station> liste) {
        if ((liste == null) || (liste.isEmpty())) {
            System.out.print("Itineraire impossible.\n");
        } else {
            for (Station station : liste) {
                if (station != null) {
                    System.out.print(station.getNom() + ", ");
                }
            }
        }
    }

    //Cette methode n'a rien a faire dans le main
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
        ListeUtilisateurs listeUsers = new ListeUtilisateurs();
        Utilisateur user2 = new Utilisateur("user2", "password",1);
        Utilisateur user = new Utilisateur("user", "password",0);
        listeUsers.ajouterUtilisateur(user);
        listeUsers.ajouterUtilisateur(user2);
        listeUsers.afficherListeUsers();
        Scanner sc = new Scanner(System.in);
        Chemin chemin = new Chemin(0);
        Station depart;
        Station arrivee;
        CheminMinStation algoMin = new CheminMinStation(metro);
        ListeStations listeStations = new ListeStations();
        
        Ligne ligne1 = new Ligne(1, "Ligne 1");
        Station station1 = new Station(1, "La Defense", 10, 20, 5);
        Station station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        Station station3 = new Station(3, "Gare de Lyon", 10, -15, 8);
        Station station4 = new Station(4, "Chateau de Vincennes", 0, 20, 7);
        listeStations.ajouterStation(station1);
        listeStations.ajouterStation(station2);
        listeStations.ajouterStation(station3);
        listeStations.ajouterStation(station4);
        Voie voie1 = new Voie(1, station1, station2, 20);
        Voie voie2 = new Voie(2, station2, station3, 15);
        Voie voie3 = new Voie(3, station3, station4, 30);
        ligne1.ajouterVoie(voie1);
        ligne1.ajouterVoie(voie2);
        ligne1.ajouterVoie(voie3);
        metro.ajouterLigne(ligne1);

        Ligne ligne2 = new Ligne(2, "Ligne 2");
        Station station5 = new Station(5, "Porte Dauphine", 20, 20, 1);
        Station station6 = new Station(6, "Charles de Gaulle - Etoile", 25, 30, 7);
        Station station7 = new Station(7, "Place de Clichy", 30, 25, 3);
        Station station8 = new Station(8, "Jaures", 30, 20, 8);
        Station station9 = new Station(9, "Belleville", 30, 30, 8);
        Station station10 = new Station(10, "Nation", 30, 40, 2);
        listeStations.ajouterStation(station5);
        listeStations.ajouterStation(station6);
        listeStations.ajouterStation(station7);
        listeStations.ajouterStation(station8);
        listeStations.ajouterStation(station9);
        listeStations.ajouterStation(station10);
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
        Station station12 = new Station(12, "Bacon", 50, 55, 6);
        Station station13 = new Station(13, "Saint-Lazare", 55, 50, 1);
        Station station14 = new Station(14, "Opera", 60, 30, 8);
        listeStations.ajouterStation(station11);
        listeStations.ajouterStation(station12);
        listeStations.ajouterStation(station13);
        listeStations.ajouterStation(station14);
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

        System.out.println("\n\nQue souhaitez vous faire ? (Veuillez entrer le numéro correspondant)");
        System.out.println("[1]: INSCRIPTION           ");
        System.out.println("[2]: CONNEXION             ");
        int selection = sc.nextInt();


            switch(selection){
                case 1:
                    System.out.println("[1]: INSCRIPTION\n");
                    System.out.println("Veuillez entrer votre login : ");
                    sc.nextLine();
                    String login = sc.nextLine();
                    System.out.println("Veuillez entrer votre mot de passe : ");
                    sc.nextLine();
                    String mdp = sc.nextLine();
                    sc.nextLine();
                    Utilisateur u = new Utilisateur(login,mdp);
                    u.Inscription(listeUsers,login,mdp);
                    listeUsers.afficherListeUsers();
                   
                break;

                case 2:
                    System.out.println("[2]: CONNEXION\n");
                    System.out.println("Veuillez entrer votre login : ");
                    sc.nextLine();
                    String login2 = sc.nextLine();
                    System.out.println("Veuillez entrer votre mot de passe : ");
                    sc.nextLine();
                    String mdp2 = sc.nextLine();
                    Utilisateur u2 = new Utilisateur(login2,mdp2);
                    u2.Connexion(listeUsers);
                    System.out.print("Vous préférez le chemin : "+u2.getPreferenceChemin());
                 break;
                 case 6:
                    System.out.println("Merci et à Bientot");
                 break;
                 default : System.out.print("mauvais choix");
            }
        


         
        metro.afficherTabLignes();
        metro.afficherDetailsLignes();
        listeStations.afficherListeStations();

        user.emplacementCourant();

        //a refaire selon les coordonn√©es entr√©es
        depart = station1;
        arrivee = station2;

        //chemin=CheminMinStation.algoRecherche(depart, arrivee);
        //afficherChemin(chemin);
        
        System.out.println("3 stations les plus proches : ");
        ArrayList<Station> stations = user.listeStations(metro);
        user.stationsPlusProches(metro,stations,1);

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
