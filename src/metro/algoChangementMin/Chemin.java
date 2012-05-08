
package metro.algoChangementMin;

import java.util.ArrayList;
import java.util.List;
import metro.Station;

public class Chemin {
    private int coutDistance;
    
    //liste de toutes les stations stockées 
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
    
    //Affiche un chemin
    public void afficherChemin() {
        if ((this.parcours == null) || (this.parcours.isEmpty())) {
            System.out.print("Itinéraire impossible.\n");
        } else {
            for (int i = 0; i < this.parcours.size(); i++) {
                Station station = this.parcours.get(i);
                if(i<this.parcours.size()-1)
                    System.out.print(station.getNom() + ", ");
                else
                    System.out.println(station.getNom());
            }
        }
    }
}
