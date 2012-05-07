package metro.dijkstra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import metro.Ligne;
import metro.Metro;
import metro.Station;
import metro.Voie;

/**
 * Dijkstra(G,Poids,sdeb) Initialisation(G,sdeb) Q := ensemble de tous les nœuds
 * tant que Q n'est pas un ensemble vide faire s1 := Trouve_min(Q) Q := Q privé
 * de s1 pour chaque nœud s2 voisin de s1 faire maj_distances(s1,s2)
 */
public class AlgorithmeDijkstra {

    private Station stationDepart;
    private Station stationArrivee;
    private Metro metro;
    ArrayList<Tache> taches;

    public AlgorithmeDijkstra(Station stationDepart, Station stationArrivee, Metro metro) {
        this.stationDepart = stationDepart;
        this.stationArrivee = stationArrivee;
        this.metro = metro;
        taches = new ArrayList<Tache>();
    }

    public ArrayList<Tache> resoudre() {
        Tache depart = new Tache(stationDepart, 0);
        taches.add(depart);
        construireListeTaches(depart);
        poidsPredecesseurs(this.getTacheStation(stationArrivee));
        ArrayList<Tache> cheminPlusCourt = new ArrayList<Tache>();
        cheminPlusCourt = cheminLePlusCourt();
        return cheminPlusCourt;
    }

    public int poidsPredecesseurs(Tache t) {
        int poids = 0;
        if(t!=null){
        if (t.getTache().getId() != stationDepart.getId()) {
            Iterator i = t.getPredecesseurs().iterator();
            while (i.hasNext()) {
                Tache tmp = (Tache) i.next();
                tmp.setPoids(poidsPredecesseurs(tmp));
                Voie v = tmp.getArc(t);
                int nouveauPoids = tmp.getPoids() + v.getTempsParcours() + t.getTache().getTempsArret();
                if (t.getTache().getId() == stationArrivee.getId()) {
                    nouveauPoids = tmp.getPoids() + v.getTempsParcours();
                }
                if (tmp.getTache().getId() == stationDepart.getId()) {
                    nouveauPoids = v.getTempsParcours() + t.getTache().getTempsArret();
                }
                if (t.getPoids() == -1 || (t.getPoids() != -1 && t.getPoids() > nouveauPoids)) {
                    t.setPoids(nouveauPoids);
                    poids = nouveauPoids;
                }
            }
        } else {
            poids = t.getTache().getTempsArret();
        }
        }
        return poids;
    }

    /*
     * A lancer après la fonction poidsPredecesseurs
     */
    public ArrayList<Tache> cheminLePlusCourt() {
        ArrayList<Tache> chemin = new ArrayList<Tache>();
        Tache arrivee = getTacheStation(stationArrivee);
        if(arrivee!=null){
            predecesseurPlusTot(arrivee, chemin);
            chemin.add(arrivee);
        }
        return chemin;
    }

    public void predecesseurPlusTot(Tache t, ArrayList<Tache> chemin) {
        Iterator i = t.getPredecesseurs().iterator();
        Tache plusTot = null;
        int min = -1;
        while (i.hasNext()) {
            Tache tmp = (Tache) i.next();
            if (min == -1 || tmp.getPoids() < min) {
                min = tmp.getPoids();
                plusTot = tmp;
            }
        }
        if (plusTot != null) {
            predecesseurPlusTot(plusTot, chemin);
            chemin.add(plusTot);
        }
    }

    public void construireListeTaches(Tache tacheCourante) {
        for (Map.Entry<Integer, Ligne> entry : metro.getTabLignes().entrySet()) {
            Ligne ligne = entry.getValue();
            if (ligne.contientStationB(stationDepart) && ligne.contientStationB(stationArrivee) && !stationDepart.getIncident() && !stationArrivee.getIncident()) {
                lireTacheSuivante(ligne, tacheCourante);
            }
        }
    }

    public void lireTacheSuivante(Ligne ligne, Tache tacheCourante) {
        ArrayList<Voie> test;
        test = ligne.contientStation(tacheCourante.getTache());
        for (int i = 0; i < test.size(); i++) {
            Voie voie = test.get(i);
            if (!voie.getIncident()) {
                Station s = voie.retourneStationO(tacheCourante.getTache());
                if (!s.getIncident()) {
                    Tache tacheSuivante = this.getTacheStation(s);
                    if (tacheSuivante == null) {
                        tacheSuivante = new Tache(s);
                    }
                    /*
                     * Si la tâche n'est pas dans le tableau des tâches, on
                     * l'ajoute
                     */
                    if (!estTache(tacheSuivante)) {
                        taches.add(tacheSuivante);
                    }
                    /*
                     * Si les tâches ne sont pas liées, on les lie
                     */
                    if (!tacheSuivante.contientSuccesseur(tacheCourante)) {
                        tacheSuivante.ajouterPredecesseur(tacheCourante);
                        tacheCourante.ajouterSuccesseur(tacheSuivante);
                        tacheCourante.ajouterArc(voie);
                        /*
                         * On boucle tant que l'on est pas arrivé
                         */
                        if (tacheSuivante.getTache().getId() != stationArrivee.getId()) {
                            lireTacheSuivante(ligne, tacheSuivante);
                        }
                    }
                }
            }
        }
    }

    public boolean estTache(Tache t) {
        boolean trouve = false;
        for (int i = 0; i < taches.size(); i++) {
            Tache tache = taches.get(i);
            if (tache.getTache().getId() == t.getTache().getId()) {
                trouve = true;
                break;
            }
        }
        return trouve;
    }

    public Tache getTacheStation(Station s) {
        Tache t = null;
        for (int i = 0; i < taches.size(); i++) {
            Tache tache = taches.get(i);
            if (tache.getTache().getId() == s.getId()) {
                t = tache;
            }
        }
        return t;
    }
}
