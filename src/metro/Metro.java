
package metro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Metro {

    private HashMap<Integer,Ligne> tabLignes;
    
    public Metro() {
        this.tabLignes = new HashMap<Integer, Ligne>();
    }

    public void ajouterLigne(Ligne l){
        if (l!=null){
            tabLignes.put(l.getId(), l);
        }
    }

    public HashMap<Integer, Ligne> getTabLignes() {
        return tabLignes;
    }

    public void setTabLignes(HashMap<Integer, Ligne> tabLignes) {
        this.tabLignes = tabLignes;
    }
    
    public List<Voie> getAllVoie (){
        List<Voie> v = new ArrayList<Voie>();
        
        for (Iterator<Integer> it = tabLignes.keySet().iterator(); it.hasNext();) {
            Integer cle = it.next();
            Ligne valeur = tabLignes.get(cle);
            
            for (int j=0 ; j<this.tabLignes.get(cle).getListeVoies().size(); j++) {
                v.add(this.tabLignes.get(cle).getListeVoies().get(j));
            }
        }
        return v;
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
                System.out.println((String)(v.get(i).getStationAmont().getNom())+" -> "+(String)(v.get(i).getStationAval().getNom())+" | Temps de parcours : "+v.get(i).getTempsParcours()+"min.");
            }
            System.out.println("");
        }
    }

}
