
package metro;

import java.util.ArrayList;

/**
 *Algorithme de recherche du chemin passant par le moins de stations
 * @author Elodie 
 */

public class CheminMinStation{
    //private static Station stationActuelle;
    //private int coutDistance;
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
    
    public Metro getMetro() {
        return metro;
    }
    
    /**
     * méthode qui retourne une liste des stations voisines d'une station donnée
     * @param station
     * @return 
     */
    public ArrayList<Station> getVoisins(Station station){  
        
        ArrayList<Station> voisins = new ArrayList();  
        
        for(int i=0; i<this.getMetro().getAllVoie().size(); i++){ 
            if(this.getMetro().getAllVoie().get(i).getStationAval().equals(station)){
                voisins.add(this.getMetro().getAllVoie().get(i).getStationAmont());
            }
            else if (this.getMetro().getAllVoie().get(i).getStationAmont().equals(station)) {
                voisins.add(this.getMetro().getAllVoie().get(i).getStationAval());
            }
        }
        
        return voisins;
    }
    
    
}
