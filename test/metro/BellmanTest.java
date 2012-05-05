package metro;

import junit.framework.TestCase;

/**
 *
 * @author Mithrin
 */
public class BellmanTest extends TestCase{
    
    public void testBellman(){
        Metro metro = new Metro();
        
        Ligne ligne1 = new Ligne(1, "Ligne 1");
        Station station1 = new Station(1, "La Défense", 10, 20, 5);
        Station station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        Station station3 = new Station(3, "Gare de Lyon", 10, -15, 8);
        Station station4 = new Station(4, "Château de Vincennes", 0, 20, 7);
        Voie voie1 = new Voie(1, station1, station2, 20);
        Voie voie2 = new Voie(2, station2, station3, 15);
        Voie voie3 = new Voie(3, station3, station4, 30);
        ligne1.ajouterVoie(voie1);
        ligne1.ajouterVoie(voie2);
        ligne1.ajouterVoie(voie3);
        metro.ajouterLigne(ligne1);
        
        Ligne ligne3 = new Ligne(3, "ligne 3");
        Station station11 = new Station(11, "Gambetta", 50, 50, 4);
        Station station12 = new Station(12, "Bécon", 50, 55, 6);
        Station station13 = new Station(13, "Saint-Lazare", 55, 50, 1);
        Station station14 = new Station(14, "Opéra", 60, 30, 8);
        Voie voie9 = new Voie(9, station1, station11, 3);
        Voie voie10 = new Voie(10, station11, station12, 3);
        Voie voie11 = new Voie(11, station12, station13, 4);
        Voie voie12 = new Voie(12, station13, station14, 5);
        Voie voie13 = new Voie(13, station14, station4, 6);
        ligne3.ajouterVoie(voie9);
        ligne3.ajouterVoie(voie10);
        ligne3.ajouterVoie(voie11);
        ligne3.ajouterVoie(voie12);
        ligne3.ajouterVoie(voie13);
        metro.ajouterLigne(ligne3);
        
        AlgorithmeBellman bellman = new AlgorithmeBellman(station1, station4, metro);
        //Résoudre
        //Test station unreachable
    }
}
