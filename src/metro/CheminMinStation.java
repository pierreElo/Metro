
package metro;

import java.util.ArrayList;
import java.util.List;

/**
 *Algorithme de recherche du chemin passant par le moins de stations
 * @author Elodie 
 */

public class CheminMinStation{
    private final Metro metro;
    private ArrayList <Chemin> cheminsPossibles;
    private static ArrayList <Voie> voies;

    public CheminMinStation(Metro metro) {
        this.metro = metro;
        this.cheminsPossibles = new ArrayList();
    }

    public ArrayList<Chemin> getCheminsPossibles() {
        return cheminsPossibles;
    }
    
    public static ArrayList<Voie> getVoies() {
        return voies;
    }

    public void setCheminsPossibles(ArrayList<Chemin> cheminsPossibles) {
        this.cheminsPossibles = cheminsPossibles;
    }

    public static void setVoies(ArrayList<Voie> voies) {
        CheminMinStation.voies = voies;
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
               // voisins.add(this.getMetro().getAllVoie().get(i).getStationAmont());
            }
            else if (this.getMetro().getAllVoie().get(i).getStationAmont().equals(station)) {
                voisins.add(this.getMetro().getAllVoie().get(i).getStationAval());
            }
        }
        
        return voisins;
    }
    
        //Cette méthode n'a rien à faire dans le main
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
    
    
    public Chemin algoRecherche(Station stationActuelle, Station arrivee){
        
        Chemin ch;
        List<Station> voisins = new ArrayList();
        
        // tant qu'on est pas arrivée
        if(stationActuelle!=arrivee){
            //si c'est le premier appel on met le station de depart en chemin
            if(cheminsPossibles.size()==0){
                ch = new Chemin(0);
                List<Station> liste = ch.getParcours();
                liste.add(stationActuelle);
                ch.setParcours(liste);
                cheminsPossibles.add(ch);
            }
            else
                ch=cheminsPossibles.get(0);
    
            //on recupère les voisines de la stations traitée
            voisins = getVoisins(stationActuelle);
 
            //pour chaque voisin on créé le nouveau chemin correspondant
            for(int i=0; i<voisins.size(); i++){ 
                Chemin nouveauCh = new Chemin(0);
                
                //on recupère l'ancien chemin
                for(int j=0; j<ch.getParcours().size();j++){
                    nouveauCh.getParcours().add(ch.getParcours().get(j));
                }   

                //augmente le cout de 1
                nouveauCh.setCoutDistance(ch.getCoutDistance()+1);
                
                //ajout de la station voisine;
                nouveauCh.getParcours().add(voisins.get(i));

                //ajoute le nouveau chemin ds la listes des chemins possibles
                cheminsPossibles.add(nouveauCh);

            }
            // on supprime le premier chemin, celui qui vient d'être traité
            cheminsPossibles.remove(0); 
            //on rappelle l'algo sur le chemin suivant
            algoRecherche(cheminsPossibles.get(0).getParcours().get(cheminsPossibles.get(0).getParcours().size()-1),arrivee);
        }
        
        return cheminsPossibles.get(0);        
    }
    
}
