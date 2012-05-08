package metro;

import java.util.ArrayList;
import junit.framework.TestCase;
import metro.dijkstra.AlgorithmeDijkstra;
import metro.dijkstra.Tache;

/**
 *
 * @author Mithrin
 */
public class DijkstraTest extends TestCase {

    public void testDijkstra() {
        Metro metro = new Metro();

        Station station1 = new Station(1, "La Défense", 10, 20, 5);
        Station station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        Station station3 = new Station(3, "Gare de Lyon", 10, -15, 2);
        Station station4 = new Station(4, "Château de Vincennes", 0, 20, 6);
        Station station5 = new Station(5, "Gambetta", 10, 20, 3);
        Station station6 = new Station(6, "Bécon", 10, 5, 4);
        Station station7 = new Station(7, "Saint-Lazare", 10, -15, 1);
        Station station8 = new Station(8, "Opéra", 0, 20, 2);
        Station station9 = new Station(9, "Place de Clichy", 0, 0, 4);
        Station station10 = new Station(10, "Nation", 1, 0, 4);

        Ligne ligne1 = new Ligne(1, "Ligne 1");
        Voie voie1 = new Voie(1, station1, station3, 20);
        Voie voie2 = new Voie(2, station3, station6, 15);
        Voie voie3 = new Voie(3, station6, station9, 30);
        Voie voie4 = new Voie(4, station9, station10, 1);
        ligne1.ajouterVoie(voie1);
        ligne1.ajouterVoie(voie2);
        ligne1.ajouterVoie(voie3);
        ligne1.ajouterVoie(voie4);
        metro.ajouterLigne(ligne1);

        Ligne ligne2 = new Ligne(2, "Ligne 2");
        Voie voie5 = new Voie(5, station1, station3, 20);
        Voie voie6 = new Voie(6, station3, station7, 15);
        Voie voie7 = new Voie(7, station7, station9, 30);
        Voie voie8 = new Voie(8, station9, station10, 1);
        ligne2.ajouterVoie(voie5);
        ligne2.ajouterVoie(voie6);
        ligne2.ajouterVoie(voie7);
        ligne2.ajouterVoie(voie8);
        metro.ajouterLigne(ligne2);

        Ligne ligne3 = new Ligne(3, "Ligne 3");
        Voie voie9 = new Voie(9, station1, station4, 20);
        Voie voie10 = new Voie(10, station4, station6, 15);
        Voie voie11 = new Voie(11, station6, station9, 30);
        Voie voie12 = new Voie(12, station9, station10, 1);
        ligne3.ajouterVoie(voie9);
        ligne3.ajouterVoie(voie10);
        ligne3.ajouterVoie(voie11);
        ligne3.ajouterVoie(voie12);
        metro.ajouterLigne(ligne3);

        Ligne ligne4 = new Ligne(4, "Ligne 4");
        Voie voie13 = new Voie(13, station2, station4, 20);
        Voie voie14 = new Voie(14, station4, station6, 15);
        Voie voie15 = new Voie(15, station6, station9, 30);
        Voie voie16 = new Voie(16, station9, station10, 1);
        ligne4.ajouterVoie(voie13);
        ligne4.ajouterVoie(voie14);
        ligne4.ajouterVoie(voie15);
        ligne4.ajouterVoie(voie16);
        metro.ajouterLigne(ligne4);

        Ligne ligne5 = new Ligne(5, "Ligne 5");
        Voie voie17 = new Voie(17, station1, station4, 20);
        Voie voie18 = new Voie(18, station4, station8, 15);
        Voie voie19 = new Voie(19, station8, station10, 1);
        ligne5.ajouterVoie(voie17);
        ligne5.ajouterVoie(voie18);
        ligne5.ajouterVoie(voie19);
        metro.ajouterLigne(ligne5);

        Ligne ligne6 = new Ligne(6, "Ligne 6");
        Voie voie20 = new Voie(20, station2, station5, 20);
        Voie voie21 = new Voie(21, station5, station7, 15);
        Voie voie22 = new Voie(22, station7, station9, 30);
        Voie voie23 = new Voie(23, station9, station10, 1);
        ligne6.ajouterVoie(voie20);
        ligne6.ajouterVoie(voie21);
        ligne6.ajouterVoie(voie22);
        ligne6.ajouterVoie(voie23);
        metro.ajouterLigne(ligne6);

        Ligne ligne7 = new Ligne(7, "Ligne 7");
        Voie voie24 = new Voie(24, station1, station5, 20);
        Voie voie25 = new Voie(25, station5, station7, 15);
        Voie voie26 = new Voie(26, station7, station9, 30);
        Voie voie27 = new Voie(27, station9, station10, 1);
        ligne7.ajouterVoie(voie24);
        ligne7.ajouterVoie(voie25);
        ligne7.ajouterVoie(voie26);
        ligne7.ajouterVoie(voie27);
        metro.ajouterLigne(ligne7);

        AlgorithmeDijkstra dijkstra = new AlgorithmeDijkstra(station1, station10, metro);
        ArrayList<Tache> res = dijkstra.resoudre();
        Tache t1 = res.get(0);
        assertEquals(1, t1.getTache().getId());
        Tache t2 = res.get(1);
        assertEquals(4, t2.getTache().getId());
        Tache t3 = res.get(2);
        assertEquals(8, t3.getTache().getId());
        Tache t4 = res.get(3);
        assertEquals(10, t4.getTache().getId());
        
        Station station11 = new Station(11, "Nation", 99, 99, 4);
        AlgorithmeDijkstra dijkstra2 = new AlgorithmeDijkstra(station1, station11, metro);
        ArrayList<Tache> res2 = dijkstra2.resoudre();
        assertEquals(0, res2.size());
    }
    
    public void testDijkstraAvecIncident(){
                Metro metro = new Metro();

        Station station1 = new Station(1, "La Défense", 10, 20, 5);
        Station station2 = new Station(2, "Porte Maillot", 10, 5, 2);
        Station station3 = new Station(3, "Gare de Lyon", 10, -15, 2);
        Station station4 = new Station(4, "Château de Vincennes", 0, 20, 6);
        Station station5 = new Station(5, "Gambetta", 10, 20, 3);
        Station station6 = new Station(6, "Bécon", 10, 5, 4);
        Station station7 = new Station(7, "Saint-Lazare", 10, -15, 1);
        Station station8 = new Station(8, "Opéra", 0, 20, 2);
        Station station9 = new Station(9, "Place de Clichy", 0, 0, 4);
        Station station10 = new Station(10, "Nation", 1, 0, 4);

        Ligne ligne1 = new Ligne(1, "Ligne 1");
        Voie voie1 = new Voie(1, station1, station3, 20);
        Voie voie2 = new Voie(2, station3, station6, 15);
        Voie voie3 = new Voie(3, station6, station9, 30);
        Voie voie4 = new Voie(4, station9, station10, 1);
        ligne1.ajouterVoie(voie1);
        ligne1.ajouterVoie(voie2);
        ligne1.ajouterVoie(voie3);
        ligne1.ajouterVoie(voie4);
        metro.ajouterLigne(ligne1);

        Ligne ligne2 = new Ligne(2, "Ligne 2");
        Voie voie5 = new Voie(5, station1, station3, 20);
        Voie voie6 = new Voie(6, station3, station7, 15);
        Voie voie7 = new Voie(7, station7, station9, 30);
        Voie voie8 = new Voie(8, station9, station10, 1);
        ligne2.ajouterVoie(voie5);
        ligne2.ajouterVoie(voie6);
        ligne2.ajouterVoie(voie7);
        ligne2.ajouterVoie(voie8);
        metro.ajouterLigne(ligne2);

        Ligne ligne3 = new Ligne(3, "Ligne 3");
        Voie voie9 = new Voie(9, station1, station4, 20);
        Voie voie10 = new Voie(10, station4, station6, 15);
        Voie voie11 = new Voie(11, station6, station9, 30);
        Voie voie12 = new Voie(12, station9, station10, 1);
        ligne3.ajouterVoie(voie9);
        ligne3.ajouterVoie(voie10);
        ligne3.ajouterVoie(voie11);
        ligne3.ajouterVoie(voie12);
        metro.ajouterLigne(ligne3);

        Ligne ligne4 = new Ligne(4, "Ligne 4");
        Voie voie13 = new Voie(13, station2, station4, 20);
        Voie voie14 = new Voie(14, station4, station6, 15);
        Voie voie15 = new Voie(15, station6, station9, 30);
        Voie voie16 = new Voie(16, station9, station10, 1);
        ligne4.ajouterVoie(voie13);
        ligne4.ajouterVoie(voie14);
        ligne4.ajouterVoie(voie15);
        ligne4.ajouterVoie(voie16);
        metro.ajouterLigne(ligne4);

        Ligne ligne5 = new Ligne(5, "Ligne 5");
        Voie voie17 = new Voie(17, station1, station4, 20);
        Voie voie18 = new Voie(18, station4, station8, 15);
        Voie voie19 = new Voie(19, station8, station10, 1);
        ligne5.ajouterVoie(voie17);
        ligne5.ajouterVoie(voie18);
        ligne5.ajouterVoie(voie19);
        metro.ajouterLigne(ligne5);

        Ligne ligne6 = new Ligne(6, "Ligne 6");
        Voie voie20 = new Voie(20, station2, station5, 20);
        Voie voie21 = new Voie(21, station5, station7, 15);
        Voie voie22 = new Voie(22, station7, station9, 30);
        Voie voie23 = new Voie(23, station9, station10, 1);
        ligne6.ajouterVoie(voie20);
        ligne6.ajouterVoie(voie21);
        ligne6.ajouterVoie(voie22);
        ligne6.ajouterVoie(voie23);
        metro.ajouterLigne(ligne6);

        Ligne ligne7 = new Ligne(7, "Ligne 7");
        Voie voie24 = new Voie(24, station1, station5, 20);
        Voie voie25 = new Voie(25, station5, station7, 15);
        Voie voie26 = new Voie(26, station7, station9, 30);
        Voie voie27 = new Voie(27, station9, station10, 1);
        ligne7.ajouterVoie(voie24);
        ligne7.ajouterVoie(voie25);
        ligne7.ajouterVoie(voie26);
        ligne7.ajouterVoie(voie27);
        metro.ajouterLigne(ligne7);

        station7.setIncident(true);
        voie17.setIncident(true);
        AlgorithmeDijkstra dijkstra = new AlgorithmeDijkstra(station1, station10, metro);
        ArrayList<Tache> res = dijkstra.resoudre();
        Tache t1 = res.get(0);
        assertEquals(1, t1.getTache().getId());
        Tache t2 = res.get(1);
        assertEquals(3, t2.getTache().getId());
        Tache t3 = res.get(2);
        assertEquals(6, t3.getTache().getId());
        Tache t4 = res.get(3);
        assertEquals(9, t4.getTache().getId());
        Tache t5 = res.get(4);
        assertEquals(10, t5.getTache().getId());
        
        station1.setIncident(true);
        AlgorithmeDijkstra dijkstra2 = new AlgorithmeDijkstra(station1, station10, metro);
        ArrayList<Tache> res2 = dijkstra2.resoudre();
        assertEquals(0, res2.size());
        
        station1.setIncident(false);
        station10.setIncident(true);
        AlgorithmeDijkstra dijkstra3 = new AlgorithmeDijkstra(station1, station10, metro);
        ArrayList<Tache> res3 = dijkstra3.resoudre();
        assertEquals(0, res3.size());
    }
}
