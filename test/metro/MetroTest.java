package metro;

import junit.framework.TestCase;

/**
 *
 * @author Mithrin
 */
public class MetroTest extends TestCase{
    
    public void testInsert(){
        Metro metro = new Metro();
        Ligne ligne1 = new Ligne(1, "Ligne 1");
        metro.ajouterLigne(ligne1);
        assertEquals(ligne1,metro.getLignes().get(1));
    }
}
