package metro.dijkstra;

import java.util.HashSet;
import java.util.Iterator;
import metro.Station;
import metro.Voie;

/**
 * Classe utilisée pour l'algorithme de Dijkstra
 */
public class Tache {

    private Station tache;
    private HashSet<Tache> predecesseurs;
    private HashSet<Tache> successeurs;
    private HashSet<Voie> arcs;
    private int poids;

    public Tache(Station tache) {
        this.tache = tache;
        this.predecesseurs = new HashSet<Tache>();
        this.successeurs = new HashSet<Tache>();
        this.arcs = new HashSet<Voie>();
        this.poids = -1;
    }

    public Tache(Station tache, int poids) {
        this.tache = tache;
        this.predecesseurs = new HashSet<Tache>();
        this.successeurs = new HashSet<Tache>();
        this.arcs = new HashSet<Voie>();
        this.poids = poids;
    }

    public void ajouterPredecesseur(Tache t) {
        predecesseurs.add(t);
    }

    public void ajouterSuccesseur(Tache t) {
        successeurs.add(t);
    }

    public void ajouterArc(Voie v) {
        arcs.add(v);
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public HashSet<Tache> getPredecesseurs() {
        return predecesseurs;
    }

    public HashSet<Tache> getSuccesseurs() {
        return successeurs;
    }

    public Station getTache() {
        return tache;
    }

    public int getPoids() {
        return poids;
    }

    public HashSet<Voie> getArcs() {
        return arcs;
    }

    public boolean contientSuccesseur(Tache test) {
        boolean trouve = false;
        Iterator i = this.successeurs.iterator();
        while (i.hasNext() && !trouve) {
            Tache tmp = (Tache) i.next();
            if (tmp.getTache().getId() == test.getTache().getId()) {
                trouve = true;
            }
        }
        return trouve;
    }

    public Voie getArc(Tache t) {
        Voie v = null;
        Iterator i = this.arcs.iterator();
        while (i.hasNext() && v == null) {
            Voie tmp = (Voie) i.next();
            if (tmp.getStationAmont().getId() == t.getTache().getId() || tmp.getStationAval().getId() == t.getTache().getId()) {
                v = tmp;
            }
        }
        return v;
    }
}