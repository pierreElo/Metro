
package metro;

import java.util.HashMap;

public class Metro {

    private HashMap<Integer,Ligne> tabLignes;

    public Metro() {
        tabLignes = new HashMap<Integer, Ligne>();
    }
    
    public void ajouterLigne(Ligne l){
        tabLignes.put(l.getId(), l);
    }
}
