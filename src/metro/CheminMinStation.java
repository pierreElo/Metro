
package metro;

import java.util.ArrayList;

/**
 *
 * @author Elodie 
 */

public class CheminMinStation{
  //  private static Station stationActuelle;
//  private int coutDistance;
    //liste de tous les chemins stockés
    private final Metro metro;
    private static ArrayList <Chemin> cheminsPossibles;
    private static ArrayList <Voie> voies;
    private static int coutTotal;

    public CheminMinStation(Metro metro) {
        this.metro = metro;
        this.cheminsPossibles = new ArrayList();
        this.coutTotal=0;
    }
    
    public static ArrayList<Station> getVoisins(Station station){
        System.out.println("get voisins");
        System.out.println(voies.size());
        ArrayList<Station> voisins = new ArrayList();
        for(int i=0; i<voies.size(); i++){
            System.out.println("for");
            if(voies.get(i).getStationAval().equals(station)){
                System.out.println("1");
                voisins.add(voies.get(i).getStationAval());
            }
            else if (voies.get(i).getStationAmont().equals(station)) {
                System.out.println("2");
                voisins.add(voies.get(i).getStationAmont());
            }
        }
        return voisins;
    }
}
