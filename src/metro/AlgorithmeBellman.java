package metro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import metro.Tache;

/**
 *
booléen Bellman_Ford(G, s) 
   initialisation (G, s)  // les poids de tous les sommets sont mis à +infini 
                           // le poids du sommet initial à 0
   pour i=1 jusqu'à Nombre de sommets -1 faire
    |    pour chaque arc (u, v) du graphe faire
    |     |  paux := poids(u) + poids(arc(u, v)); 
    |     |  si paux < poids(v) alors
    |     |    |  pred(v) := u; 
    |     |    |  poids(v) := paux; 
   pour chaque arc (u, v) du graphe faire
    |   si poids(u) + poids(arc(u, v)) < poids(v) alors
    |     retourner faux  // il existe un cycle absorbant
   retourner vrai 
 */
public class AlgorithmeBellman {
    
    private Station stationDepart;
    private Station stationArrivee;
    private Metro metro;
    ArrayList<Tache> taches;

    public AlgorithmeBellman(Station stationDepart, Station stationArrivee, Metro metro) {
        this.stationDepart = stationDepart;
        this.stationArrivee = stationArrivee;
        this.metro = metro;
        taches = new ArrayList<Tache>();
    }
    
    public void resoudre(){
        Tache depart = new Tache(stationDepart);
        taches.add(depart);
        construireListeTaches(depart);
        for (int i = 0; i < taches.size(); i++) {
            Tache tache = taches.get(i);
            System.out.println(tache.getTache().getId());
            Iterator it = tache.getSuccesseurs().iterator();
            while (it.hasNext()) {
                Tache t = (Tache)it.next();
                System.out.println("Successeurs : "+t.getTache().getId());
            }
        }
    }
    
    public void construireListeTaches(Tache t){
        for (Map.Entry<Integer, Ligne> entry : metro.getTabLignes().entrySet()) {
            Ligne ligne = entry.getValue();
            ArrayList<Voie> v = ligne.contientStation(t.getTache());
            for (int i = 0; i < v.size(); i++) {
                Voie voie = v.get(i);
                Tache tache = new Tache(voie.retourneStationO(t.getTache()));
                if(!estTache(tache)){
                    tache.ajouterPredecesseur(t);
                    taches.add(tache);
                    t.ajouterSuccesseur(tache);
                    if(tache.getTache().getId()!=stationArrivee.getId()){
                        construireListeTaches(tache);   
                    }
                }
            }
        }
    }
    
    public boolean estTache(Tache t){
        boolean trouve = false;
        for (int i = 0; i < taches.size(); i++) {
            Tache tache = taches.get(i);
            if(tache.getTache().getId()==t.getTache().getId()){
                trouve = true;
                break;
            }
        }
        return trouve;
    }
}
