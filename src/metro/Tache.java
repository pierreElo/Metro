package metro;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Classe utilisée pour l'algorithme de Bellman
 */
public class Tache {

    private Station tache;
    private HashSet<Tache> predecesseurs;
    private HashSet<Tache> successeurs;
    private boolean marque = false;

    public Tache(Station tache) {
        this.tache = tache;
        predecesseurs = new HashSet<Tache>();
        successeurs = new HashSet<Tache>();
    }
    
    public void ajouterPredecesseur(Tache t){
        predecesseurs.add(t);
    }
    
    public void ajouterSuccesseur(Tache t){
        successeurs.add(t);
    }

    public HashSet<Tache> getSuccesseurs() {
        return successeurs;
    }

    public Station getTache() {
        return tache;
    }
}
