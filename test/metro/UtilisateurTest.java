/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import java.util.ArrayList;
import java.util.Set;
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
     * Test of isEstAdmin method, of class Utilisateur.
     */
    @Test
    public void testIsEstAdmin() {
        System.out.println("isEstAdmin");
        Utilisateur instance = null;
        boolean expResult = false;
        boolean result = instance.isEstAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeUtilisateurs method, of class Utilisateur.
     */
    @Test
    public void testGetListeUtilisateurs() {
        System.out.println("getListeUtilisateurs");
        Utilisateur instance = null;
        Set expResult = null;
        Set result = instance.getListeUtilisateurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUser method, of class Utilisateur.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Utilisateur instance = null;
        int expResult = 0;
        int result = instance.getIdUser();
        assertEquals(expResult, result);
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
        instance.setIdUser(idUser);
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
        Station s = null;
        Utilisateur instance = null;
        instance.ajouterStation(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of setEstAdmin method, of class Utilisateur.
     */
    @Test
    public void testSetEstAdmin() {
        System.out.println("setEstAdmin");
        boolean estAdmin = false;
        Utilisateur instance = null;
        instance.setEstAdmin(estAdmin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeUtilisateurs method, of class Utilisateur.
     */
    @Test
    public void testSetListeUtilisateurs() {
        System.out.println("setListeUtilisateurs");
        Set<Utilisateur> listeUtilisateurs = null;
        Utilisateur instance = null;
        instance.setListeUtilisateurs(listeUtilisateurs);
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
        ListeUtilisateurs l = new ListeUtilisateurs();
        Utilisateur u = new Utilisateur("toto","mdp",1);
        u.Inscription(l,"toto","mdp",1);
        assertEquals(l.getListeUtilisateurs().size(),1);
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
     * Test of listeStations method, of class Utilisateur.
     */
    @Test
    public void testListeStations() {
        System.out.println("listeStations");
        Metro m = null;
        Utilisateur instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.listeStations(m);
        assertEquals(expResult, result);
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
        int nbPassages = 0;
        Utilisateur instance = null;
        instance.stationsPlusProches(m, s, nbPassages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valeurDistance method, of class Utilisateur.
     */
    @Test
    public void testValeurDistance() {
        System.out.println("valeurDistance");
        int x = 0;
        int y = 0;
        Utilisateur instance = null;
        int expResult = 0;
        int result = instance.valeurDistance(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
