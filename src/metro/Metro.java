
package metro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Metro {

    private HashMap<Integer,Ligne> tabLignes;

    
    public Metro() {
        this.tabLignes = new HashMap<Integer, Ligne>();
    }


    public void ajouterLigne(Ligne l){
        tabLignes.put(l.getId(), l);
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
            System.out.println(valeur.getNom());
            
            for (int j=0 ; j<this.tabLignes.get(cle).getListeVoies().size(); j++) {
            System.out.println(this.tabLignes.get(cle).getListeVoies().get(j).getId());
                v.add(this.tabLignes.get(cle).getListeVoies().get(j));
            }
        }
        return v;
 }
}
