/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Anne
 */
public class UtilisateurTest {
    
    public UtilisateurTest() {
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
     * Test of getLogin method, of class Utilisateur.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Utilisateur instance = null;
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Utilisateur.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Utilisateur instance = null;
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Utilisateur.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Utilisateur instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Utilisateur.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Utilisateur instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmplX method, of class Utilisateur.
     */
    @Test
    public void testGetEmplX() {
        System.out.println("getEmplX");
        Utilisateur instance = null;
        int expResult = 0;
        int result = instance.getEmplX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmplX method, of class Utilisateur.
     */
    @Test
    public void testSetEmplX() {
        System.out.println("setEmplX");
        int x = 0;
        Utilisateur instance = null;
        instance.setEmplX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmplY method, of class Utilisateur.
     */
    @Test
    public void testGetEmplY() {
        System.out.println("getEmplY");
        Utilisateur instance = null;
        int expResult = 0;
        int result = instance.getEmplY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmplY method, of class Utilisateur.
     */
    @Test
    public void testSetEmplY() {
        System.out.println("setEmplY");
        int y = 0;
        Utilisateur instance = null;
        instance.setEmplY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Inscription method, of class Utilisateur.
     */
    @Test
    public void testInscription() {
        System.out.println("Inscription");
        Utilisateur instance = null;
        instance.Inscription();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Connexion method, of class Utilisateur.
     */
    @Test
    public void testConnexion() {
        System.out.println("Connexion");
        Utilisateur instance = null;
        instance.Connexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Deconnexion method, of class Utilisateur.
     */
    @Test
    public void testDeconnexion() {
        System.out.println("Deconnexion");
        Utilisateur instance = null;
        instance.Deconnexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emplacementCourant method, of class Utilisateur.
     */
    @Test
    public void testEmplacementCourant() {
        System.out.println("emplacementCourant");
        Utilisateur instance = null;
        instance.emplacementCourant();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stationPlusProche method, of class Utilisateur.
     */
    @Test
    public void testStationsPlusProches() {
        System.out.println("stationsPlusProches");
        Metro m = null;
        Utilisateur instance = null;
        instance.stationsPlusProches(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
