package metro;

import java.util.*;


/**
 *
 * @author David Rouyer
 */


public class Main {
    
    
    //affiche un chemin
    public static void afficherChemin(List<Station> liste){
        if((liste==null)||(liste.size()==0)){
            System.out.print("Itinéraire impossible.\n");
        }
        else{
                for(Station station : liste){
                    if(station!=null){
                        System.out.print(station.getNom()+", ");
                    }
                }
            }  
    }
    
    //affiche la liste de tous les chemins
    public static void afficherListesChemins(List<Chemin> liste){
         System.out.println("\nListe chemins : ");
        if((liste==null) || (liste.size()==0)){
            System.out.print("vide.\n");
        }
        else{
                for(Chemin ch : liste){
                    if(ch!=null){
                        System.out.print("     " + ch.getCoutDistance()+", ");
                        Main.afficherChemin(ch.getParcours());
                        System.out.println("");
                    }
                }
        }
    }
    
 
    public static void main(String[] args) {
        Metro metro = new Metro();
        Scanner sc = new Scanner(System.in);
        Chemin chemin = new Chemin(0);
        Station depart;
        Station arrivee;
       // CheminMinStation algoMin = new CheminMinStation(metro);
        
        /*
        Ligne ligne1 = new Ligne(1, "Ligne 1");
        Station station1 = new Station(1, "La Défense", 10, 20);
        Station station2 = new Station(2, "Porte Maillot", 10, 5);
        Station station3 = new Station(3, "Gare de Lyon", 10, -15);
        Station station4 = new Station(4, "Château de Vincennes", 0, 20);
        Voie voie1 = new Voie(1, station1, station2);
        Voie voie2 = new Voie(2, station2, station3);
        Voie voie3 = new Voie(3, station3, station4);
        ligne1.ajouterVoie(voie1);
        ligne1.ajouterVoie(voie2);
        ligne1.ajouterVoie(voie3);
        metro.ajouterLigne(ligne1);

        Ligne ligne2 = new Ligne(2, "Ligne 2");
        Station station5 = new Station(5, "Porte Dauphine", 20, 20);
        Station station6 = new Station(6, "Charles de Gaulle - Étoile", 25, 30);
        Station station7 = new Station(7, "Place de Clichy", 30, 25);
        Station station8 = new Station(8, "Jaurès", 30, 20);
        Station station9 = new Station(9, "Belleville", 30, 30);
        Station station10 = new Station(10, "Nation", 30, 40);
        Voie voie4 = new Voie(4, station5, station6);
        Voie voie5 = new Voie(5, station6, station7);
        Voie voie6 = new Voie(6, station7, station8);
        Voie voie7 = new Voie(7, station8, station9);
        Voie voie8 = new Voie(8, station9, station10);
        metro.ajouterLigne(ligne2);

        //Ligne ligne3 = new Ligne(3, "ligne3");
        */
        
        Ligne ligne1 = new Ligne(1, "Ligne 1");
        Station station1 = new Station(1, "La Défense", 0, -15);
        Station station2 = new Station(2, "Porte Maillot", 0, 0);
        Station station3 = new Station(3, "Gare de Lyon", 0, 10);
        Station station4 = new Station(4, "Château de Vincennes", 0, 20);
        Voie voie1 = new Voie(1, station1, station2);
        Voie voie2 = new Voie(2, station2, station3);
        Voie voie3 = new Voie(3, station3, station4);
        ligne1.ajouterVoie(voie1);
        ligne1.ajouterVoie(voie2);
        ligne1.ajouterVoie(voie3);
        metro.ajouterLigne(ligne1);
        
        Ligne ligne2 = new Ligne(2, "Ligne 2");
        Station station5 = new Station(5, "Porte Dauphine", -20, 0);
        Voie voie4 = new Voie(4, station3, station5);
        ligne2.ajouterVoie(voie4);
        metro.ajouterLigne(ligne2);
        
        Ligne ligne3 = new Ligne(3, "Ligne 3");
        Station station6 = new Station(6, "Charles de Gaulle - Étoile", 20, 0);
        Voie voie5 = new Voie(5, station1, station6);
        Voie voie6 = new Voie(6, station6, station4);
        ligne3.ajouterVoie(voie5);
        ligne3.ajouterVoie(voie6);
        metro.ajouterLigne(ligne3);
        
        Ligne ligne4 = new Ligne(4, "Ligne 4");
        Voie voie7 = new Voie(7, station1, station5);
        ligne4.ajouterVoie(voie7);
        metro.ajouterLigne(ligne4);
      
        System.out.println("Welcome to Paris !");
        
        //a refaire selon les coordonnées entrées
      //  System.out.println("entrer le depart : ");
        depart=station1;
       // depart=sc.nextInt();
      //  System.out.println("entrer l'arrivée : ");
        //arrivee=sc.nextInt();
        arrivee=station2;
      //  metro.initialiserListeVoies();
       System.out.println( "taille : " + metro.getAllVoie().size());
        
     //   chemin=CheminMinStation.algoRecherche(depart, arrivee);
      //  afficherChemin(chemin);
            
        
        
    }
}
