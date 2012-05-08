
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author lily277
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
     * Test of getIdUser method, of class Utilisateur.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Utilisateur instance = null;
        int expResult = 0;

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUser method, of class Utilisateur.
     */
    @Test
    public void testSetIdUser() {
        System.out.println("setIdUser");
        int idUser = 0;
        Utilisateur instance = null;
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeStations method, of class Utilisateur.
     */
    @Test
    public void testGetListeStations() {
        System.out.println("getListeStations");
        Utilisateur instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getListeStations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterStation method, of class Utilisateur.
     */
    @Test
    public void testAjouterStation() {
        System.out.println("ajouterStation");
        Station station1 = new Station(1, "La Défense", 10, 20, 5);
        Station station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        Utilisateur toto = new Utilisateur("toto","pass", false);
        toto.ajouterStation(station1);
        
    }

    /**
     * Test of setListeStations method, of class Utilisateur.
     */
    @Test
    public void testSetListeStations() {
        System.out.println("setListeStations");
        ArrayList<Station> listeStations = null;
        Utilisateur instance = null;
        instance.setListeStations(listeStations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of getPreferenceChemin method, of class Utilisateur.
     */
    @Test
    public void testGetPreferenceChemin() {
        System.out.println("getPreferenceChemin");
        Utilisateur instance = null;
        int expResult = 0;
        int result = instance.getPreferenceChemin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreferenceChemin method, of class Utilisateur.
     */
    @Test
    public void testSetPreferenceChemin() {
        System.out.println("setPreferenceChemin");
        int preferenceChemin = 0;
        Utilisateur instance = null;
        instance.setPreferenceChemin(preferenceChemin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Inscription method, of class Utilisateur.
     */
    @Test
    public void testInscription() {
        System.out.println("Inscription");
        ListeUtilisateurs l = null;
        Utilisateur instance = null;

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AjoutPreferenceStations method, of class Utilisateur.
     */
    @Test
    public void testAjoutPreferenceStations() {
        System.out.println("AjoutPreferenceStations");
        Utilisateur u = null;
        Station s = null;
        Utilisateur instance = null;
        instance.AjoutPreferenceStations(u, s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Connexion method, of class Utilisateur.
     */
    @Test
    public void testConnexion() {
        System.out.println("Connexion");
        Utilisateur u = null;
        ListeUtilisateurs l = null;
        Utilisateur instance = null;
        instance.Connexion(l);
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
        //instance.emplacementCourant();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stationsPlusProches method, of class Utilisateur.
     */
    @Test
    public void testStationsPlusProches() {
        System.out.println("stationsPlusProches");
        Metro m = null;
        ArrayList<Station> s = null;
        Utilisateur instance = null;
        //instance.stationsPlusProches(m,s,1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

