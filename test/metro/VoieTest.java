package metro;

import junit.framework.TestCase;

/**
 *
 * @author Mithrin
 */
public class VoieTest extends TestCase{

    public void testContientStation(){
        Station station1 = new Station(1, "La Défense", 10, 20, 5);
        Station station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        Station station3 = new Station(3, "Toto", 4, 4, 1);
        Voie voie1 = new Voie(1, station1, station2, 10);
        assertEquals(false, voie1.contientStation(station3));
        assertEquals(true, voie1.contientStation(station1));
    }
    
    public void testStationO(){
        Station station1 = new Station(1, "La Défense", 10, 20, 5);
        Station station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        Voie voie1 = new Voie(1, station1, station2, 10);
        assertEquals(station1.getId(), voie1.retourneStationO(station2).getId());
        assertEquals(station2.getId(), voie1.retourneStationO(station1).getId());
    }
}
