/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author lily277
 */
public class ListeUtilisateursTest {
    
    public ListeUtilisateursTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ajouterUtilisateur method, of class ListeUtilisateurs.
     */
    @Test
    public void testAjouterUtilisateur() {
        System.out.println("ajouterUtilisateur");
        Utilisateur u = new Utilisateur("toto","pass",false);
        Utilisateur u2 = new Utilisateur("toto","pass",1);
        ListeUtilisateurs instance = new ListeUtilisateurs();
        instance.ajouterUtilisateur(u);
        instance.ajouterUtilisateur(u2);
    }

    /**
     * Test of contientUtilisateur method, of class ListeUtilisateurs.
     */
    @Test
    public void testContientEnregistrement() {
        System.out.println("contientUtilisateur");
        Utilisateur u1 = new Utilisateur("toto","pass",false);
        Utilisateur u2 = new Utilisateur("titi","pass2",false);
        ListeUtilisateurs l = new ListeUtilisateurs();
        l.ajouterUtilisateur(u1);
        boolean expResult = false;
        assertEquals(l.contientEnregistrement("tota","pass"), false);
        assertEquals(l.contientEnregistrement("toto","pass"), true);
    }
}
