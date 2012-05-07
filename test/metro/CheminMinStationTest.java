
package metro;


import metro.algoChangementMin.Chemin;
import metro.algoChangementMin.CheminMinStation;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class CheminMinStationTest {
    private Metro metro;
    private CheminMinStation algoMin; 
    private CheminMinStation algoMin2; 
    private CheminMinStation algoMin3; 
    private CheminMinStation algoMin4; 
    private Station station1;
    private Station station2;
    private Station station3;
    private Station station4;
    private Station station5;
    private Station station6;
    private Ligne ligne1;
    private Ligne ligne2;
    private Ligne ligne3;
    private Ligne ligne4;
    private Voie voie1;
    private Voie voie2;
    private Voie voie3;
    private Voie voie4;
    private Voie voie5;
    private Voie voie6;
    private Voie voie7;         
    private Chemin chemin;
    private Chemin chemin2;
    private Chemin chemin3;
    private Chemin chemin4;
    
    public CheminMinStationTest() {
        
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
        algoMin = new CheminMinStation(metro); 
        algoMin2 = new CheminMinStation(metro);
        algoMin3 = new CheminMinStation(metro);
        algoMin4 = new CheminMinStation(metro);
        
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
        
        ligne4 = new Ligne(4, "Ligne 4");
        voie7 = new Voie(7, station1, station3, 2);
        ligne4.ajouterVoie(voie7);
        
        metro.ajouterLigne(ligne1);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Teste le methode qui récupère les stations voisines d'une station donnée
     */
    @Test
    public void testGetVoisins() {
        algoMin.getMetro();
        
        //recherche des stations voisines de la station 1 ayant que la première ligne
        assertEquals(algoMin.getVoisins(station1).size(), 1);
        assertEquals(algoMin.getVoisins(station1).get(0).getId(),2);
        
        metro.ajouterLigne(ligne2);
        metro.ajouterLigne(ligne3);
        
        //recherche des stations voisines de la station 1 ayant trois lignes
        assertEquals(algoMin.getVoisins(station1).size(), 2);
        assertEquals(algoMin.getVoisins(station1).get(0).getId(),2);
        assertEquals(algoMin.getVoisins(station1).get(1).getId(),6);

        
    }
    
    /**
     * Teste la méhode qui retourne le chemin avec le moins de changement
     */
     @Test
    public void testAlgoRecherche(){
        metro.ajouterLigne(ligne2);
        metro.ajouterLigne(ligne3);

        //teste si la station voulue est voisine
        chemin=algoMin.algoRecherche(station1, station2);       
        assertEquals(chemin.getParcours().size(),2);
        assertEquals(chemin.getCoutDistance(),1);
        assertEquals(chemin.getParcours().get(0).getId(),1);
        assertEquals(chemin.getParcours().get(1).getId(),2);
        
        //teste si la station voulue n'est pas voisine mais un chemin possible
        chemin2=algoMin2.algoRecherche(station1, station3);
        assertEquals(chemin2.getParcours().size(),3);
        assertEquals(chemin2.getCoutDistance(),2);
        assertEquals(chemin2.getParcours().get(0).getId(),1);
        assertEquals(chemin2.getParcours().get(1).getId(),2);
        assertEquals(chemin2.getParcours().get(2).getId(),3);
        
        //teste si la station recherchée n'est pas voisine avec plusieurs chemins possibles
        metro.ajouterLigne(ligne4);
        chemin3=algoMin3.algoRecherche(station1, station3);
        assertEquals(chemin3.getParcours().size(),2);
        assertEquals(chemin3.getCoutDistance(),1);
        assertEquals(chemin3.getParcours().get(0).getId(),1);
        assertEquals(chemin3.getParcours().get(1).getId(),3);
        
        //teste avec un incident sur une voie
        voie7.setIncident(true);
        chemin3=algoMin3.algoRecherche(station1, station3);
        assertEquals(chemin3.getParcours().size(),3);
        assertEquals(chemin3.getCoutDistance(),2);
        assertEquals(chemin3.getParcours().get(0).getId(),1);
        assertEquals(chemin3.getParcours().get(1).getId(),2);
        assertEquals(chemin3.getParcours().get(2).getId(),3);
        
        //teste avec un incident sur une station 
        station6.setIncident(true);
        chemin4=algoMin4.algoRecherche(station1, station4);
        assertEquals(chemin4.getParcours().size(),4);
        assertEquals(chemin4.getCoutDistance(),3);
        assertEquals(chemin4.getParcours().get(0).getId(),1);
        assertEquals(chemin4.getParcours().get(1).getId(),2);
        assertEquals(chemin4.getParcours().get(2).getId(),3);
        assertEquals(chemin4.getParcours().get(3).getId(),4);
     /*   
        //teste si aucune solution
        voie3.setIncident(true);
        chemin4=algoMin4.algoRecherche(station1, station4);
     //   assertEquals(chemin4,null);
      */  

    }
    
}
