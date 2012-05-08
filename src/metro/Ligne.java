package metro;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/*
 * Classe représentant une ligne. Une ligne est composée de plusieurs voies.
 */
public class Ligne {

    //Identifiant de la ligne
    private int id;
    //Nom de la ligne
    private String nom;
    //Liste des voies, dans leur ordre d'apparition
    private ArrayList<Voie> listeVoies;
    //Créer une rame toutes les 5 mintes
    private Timer ramesTimer;
    //Liste des rames
    private ArrayList<Rame> listeRames;

    public Ligne(int id, String nom) {
        this.id = id;
        this.nom = nom;
        listeVoies = new ArrayList<Voie>();
        listeRames = new ArrayList<Rame>();
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListeVoies(ArrayList<Voie> listeVoies) {
        this.listeVoies = listeVoies;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Voie> getListeVoies() {
        return listeVoies;
    }

    public void ajouterVoie(Voie v) {
        listeVoies.add(v);
    }

    public Voie getVoie(int i) {
        return listeVoies.get(i);
    }
    
    public void ajouterRame(Rame r){
        listeRames.add(r);
    }
    
    public void supprimerRame(Rame r){
        listeRames.remove(r);
    }

    public boolean contientStationB(Station s) {
        boolean trouve = false;
        for (int i = 0; i < listeVoies.size(); i++) {
            Voie voie = listeVoies.get(i);
            if (voie.contientStation(s)) {
                trouve = true;
                break;
            }
        }
        return trouve;
    }
    
    public Ligne getLigne(){
        return this;
    }
    
    public ArrayList<Rame> getListeRames(){
        return listeRames;
    }

    /*
     * @return l'emplacement de la voie sur laquelle la station a été trouvée
     */
    public ArrayList<Voie> contientStation(Station s) {
        ArrayList<Voie> voies = new ArrayList<Voie>();
        for (int i = 0; i < listeVoies.size(); i++) {
            Voie voie = listeVoies.get(i);
            if (voie.contientStation(s)) {
                voies.add(voie);
            }
        }
        return voies;
    }

    /*
     * Emplacement de la voie sur la liste des voies
     */
    private int emplacementVoie(Voie v) {
        int trouve = -1;
        for (int i = 0; i < listeVoies.size(); i++) {
            Voie voie = listeVoies.get(i);
            if (voie.getId() == v.getId()) {
                trouve = i;
            }
        }
        return trouve;
    }

    public Voie voieSuivante(Voie v) {
        Voie trouve = null;
        int indice = emplacementVoie(v);
        if (indice != -1 && indice < listeVoies.size() - 1) {
            trouve = listeVoies.get(indice + 1);
        }
        return trouve;
    }

    public Voie voiePrecedente(Voie v) {
        Voie trouve = null;
        int indice = emplacementVoie(v);
        if (indice != -1 && indice > 0) {
            trouve = listeVoies.get(indice - 1);
        }
        return trouve;
    }
    
    public void creerRame(){
        ramesTimer = new Timer();
        ramesTimer.scheduleAtFixedRate(new CreationRame(), 0, 300000);
    }
    
    class CreationRame extends TimerTask{

        @Override
        public void run() {
            ajouterRame(new Rame(getLigne()));
        }
    }
}
