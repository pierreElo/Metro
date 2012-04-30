
package metro;

import java.util.*;


public class Chemin {
    private int coutDistance;
    //liste de tous les chemins stockés
    private List <Station> parcours;

    public Chemin(int coutDistance) {
        this.coutDistance = coutDistance;
        parcours= new ArrayList();
    }

    public int getCoutDistance() {
        return coutDistance;
    }

    public List<Station> getParcours() {
        return parcours;
    }

    public void setCoutDistance(int coutDistance) {
        this.coutDistance = coutDistance;
    }

    public void setParcours(List<Station> parcours) {
        this.parcours = parcours;
    }

    
    
}
