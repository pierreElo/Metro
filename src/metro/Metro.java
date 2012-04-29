
package metro;

import java.util.Iterator;
import java.util.*;
import java.util.Map.Entry;

public class Metro {

    private HashMap<Integer,Ligne> tabLignes;

    public Metro() {
        tabLignes = new HashMap<Integer, Ligne>();
    }

    public HashMap<Integer, Ligne> getLignes() {
        return tabLignes;
    }
    
    public HashMap getTabLignes(){
        return this.tabLignes;
    }
    
    public void ajouterLigne(Ligne l){
        tabLignes.put(l.getId(), l);
    }
        
    /**
     * Affiche seulement la liste des lignes, sans les details
     */
    public void afficherTabLignes(){
        System.out.println("\n\nListe des lignes : ");
        
        //Boucle sur le champ clé de la HashMap
        for(Entry<Integer,Ligne> entry : tabLignes.entrySet()){
            Integer cle = entry.getKey();
            
            //Recupere la valeur pour la cle en cours, et ecrit le couple
            String val = entry.getValue().getNom().toString();
            System.out.println(cle+" - "+val);
        }
    }
    
    /**
     * Affiche la liste des lignes avec leurs stations.
     * Meme boucle de base que afficherTabLignes
     */
    public void afficherDetailsLignes(){
        System.out.println("\n\nListe des lignes avec leurs stations : ");
        ArrayList<Voie> v = new ArrayList<Voie>();
        
        for(Entry<Integer,Ligne> entry : tabLignes.entrySet()){
            Integer cle = entry.getKey();
            String val = entry.getValue().getNom().toString();
            System.out.println(cle+" - "+val+" : ");
            
            Ligne l = entry.getValue();
            v = l.getListeVoies();
            
            for(int i=0 ; i<v.size() ; i++){
                System.out.println((String)(v.get(i).getStationAmont().getNom())+" -> "+(String)(v.get(i).getStationAval().getNom()));
            }
            System.out.println("");
        }
    }
    
}
