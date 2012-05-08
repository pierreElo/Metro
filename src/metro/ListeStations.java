
package metro;

import java.util.HashMap;
import java.util.Map;

public class ListeStations {
    
    private HashMap<Integer,Station> listeStations;

    public ListeStations() {
        listeStations = new HashMap<Integer, Station>();
    }
      
    public void ajouterStation(Station s){
        if (s!=null){
            listeStations.put(s.getId(), s);
        }
    }

    public boolean contientStation(Station s){
        if(listeStations.containsValue(s) == true){
            return true;
        }
        else return false;
    }
    
    public Station getStation(int id){
        return listeStations.get(id);
    }
    
    public void afficherListeStations(){
        System.out.println("\n\nListe des stations : ");
        
        //Boucle sur le champ clé de la HashMap
        for(Map.Entry<Integer,Station> entry : listeStations.entrySet()){
            Integer cle = entry.getKey();
            
            //Recupere la valeur pour la cle en cours, et ecrit le couple
            String val = entry.getValue().getNom().toString();
            System.out.println(cle+" - "+val);
        }
    }

}
