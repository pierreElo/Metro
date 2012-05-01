package metro;

import java.util.ArrayList;

/*
 * Classe représentant une ligne. Une ligne est composée de plusieurs voies.
 */
public class Ligne {

    //Identifiant de la ligne
    private int id;
    //Nom de la ligne
    private String nom;
    //Liste des stations
    private ArrayList<Voie> listeVoies;
    
    public Ligne(int id, String nom) {
        this.id = id;
        this.nom = nom;
        listeVoies = new ArrayList<Voie>();
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

    public void ajouterVoie(Voie v){
        listeVoies.add(v);
    }
}
