/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Administrateur
 */
public class MetroTest {
    private Metro metro;
    private Station station1;
    private Station station2;
    private Station station3;
    private Station station4;
    private Station station5;
    private Station station6;
    private Ligne ligne1;
    private Ligne ligne2;
    private Ligne ligne3;
    private Voie voie1;
    private Voie voie2;
    private Voie voie3;
    private Voie voie4;
    private Voie voie5;
    private Voie voie6;
    
    public MetroTest() {
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        metro = new Metro();
        station1 = new Station(1, "La Défense", 0, -15, 5);
        station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        station3 = new Station(3, "Gare de Lyon", 0, 10, 1);
        station4 = new Station(4, "Château de Vincennes", 0, 20, 3);
        station5 = new Station(5, "Porte Dauphine", -20, 0, 4);
        station6 = new Station(6, "Charles de Gaulle - Étoile", 20, 0, 1);
        
        ligne1 = new Ligne(1, "Ligne 1");
        voie1 = new Voie(1, station1, station2, 6);
        voie2 = new Voie(2, station2, station3, 8);
        voie3 = new Voie(3, station3, station4, 4);
        ligne1.ajouterVoie(voie1);
        ligne1.ajouterVoie(voie2);
        ligne1.ajouterVoie(voie3);
        
        ligne2 = new Ligne(2, "Ligne 2");
        voie4 = new Voie(4, station3, station5, 2);
        ligne2.ajouterVoie(voie4);
        
        ligne3 = new Ligne(3, "Ligne 3");
        voie5 = new Voie(5, station1, station6, 3);
        voie6 = new Voie(6, station6, station4, 1);
        ligne3.ajouterVoie(voie5);
        ligne3.ajouterVoie(voie6);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test de la méthode ajouterLigne de la classe Metro
     */
    @Test
    public void testAjouterLigne() {
        //ajout d'une ligne
        metro.ajouterLigne(ligne1);
        
        Iterator<Integer> it = metro.getTabLignes().keySet().iterator();
        Integer cle = it.next();
        Ligne valeur = metro.getTabLignes().get(cle);
        
        assertEquals(metro.getTabLignes().size(),1);
        assertEquals(valeur.getNom(),"Ligne 1");
        assertEquals(valeur.getListeVoies().get(0).getId(),1);
        
        //si j'ajoute 2 fois la même ligne
        metro.ajouterLigne(ligne1);
        assertEquals(metro.getTabLignes().size(),1);
        assertEquals(valeur.getNom(),"Ligne 1");
        assertEquals(valeur.getListeVoies().get(0).getId(),1);
        
        //ajout de null
        metro.ajouterLigne(null);
        assertEquals(metro.getTabLignes().size(),1);
        assertEquals(valeur.getNom(),"Ligne 1");
        assertEquals(valeur.getListeVoies().get(0).getId(),1);
        
        //ajout d'une deuxième ligne
        metro.ajouterLigne(ligne2);
        assertEquals(metro.getTabLignes().size(),2);
        assertEquals(valeur.getNom(),"Ligne 1");
        assertEquals(valeur.getListeVoies().get(0).getId(),1);
        
    }


    /**
     * Test de la méthode getVoies de la classe Metro
     */
    @Test
    public void testGetVoies() {
        List<Voie> voies = new ArrayList();
        metro.ajouterLigne(ligne1);
      
        //verfie le nombre d'éléments dans le liste contenant toutes les voies
        assertEquals(metro.getAllVoie().size(),3);
        
         //verification des éléments contenu dans la liste
         assertEquals(metro.getAllVoie().get(0).getStationAmont().getId(),1);
         assertEquals(metro.getAllVoie().get(1).getStationAmont().getId(),2);     
         
         metro.ajouterLigne(ligne2);
         metro.ajouterLigne(ligne3);
         
         //verfie le nombre d'éléments dans le liste contenant toute les voies
         assertEquals(metro.getAllVoie().size(),6);
         
        //verification des éléments contenu dans la liste
         assertEquals(metro.getAllVoie().get(5).getStationAmont().getId(),6);
    }
}
