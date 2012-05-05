package metro;

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
        assertEquals(voie1,ligne1.getListeVoies().get(0));
    }
}
