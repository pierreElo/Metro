package metro;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Mithrin
 */
public class LigneTest extends TestCase{

    public void testInsert(){
        Ligne ligne1 = new Ligne(1, "Ligne 1");
        Station station1 = new Station(1, "La Défense", 10, 20, 5);
        Station station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        Voie voie1 = new Voie(1, station1, station2, 10);
        ligne1.ajouterVoie(voie1);
        assertEquals(1,ligne1.getListeVoies().get(0).getId());
    }
    
    public void testContientStation(){
        Ligne ligne2 = new Ligne(2, "Ligne 2");
        Station station1 = new Station(1, "Charles de Gaulle - Étoile", 25, 30, 7);
        Station station2 = new Station(2, "Place de Clichy", 30, 25, 3);
        Station station3 = new Station(3, "Jaurès", 30, 20, 8);
        Voie voie1 = new Voie(1, station1, station2, 30);
        Voie voie2 = new Voie(2, station2, station3, 22);
        ligne2.ajouterVoie(voie1);
        ligne2.ajouterVoie(voie2);
        ArrayList<Voie> v = ligne2.contientStation(station2);
        assertEquals(1,v.get(0).getId());
        assertEquals(2, v.get(1).getId());
    }
}
