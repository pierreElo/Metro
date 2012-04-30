package metro;

/*
 * Classe représentant une station
 */
public class Station {

    //Identifiant de la station
    private int id;
    //Nom de la station
    private String nom;
    // temps d'arret
    private int temps;
    //Booléen indiquant si un incident s'est produit à la station ou non
    private boolean incident;
    //Coordonnées de la station
    private int x;
    private int y;

    public Station(int id, String nom, int x, int y) {
        this.id = id;
        this.nom = nom;
        this.incident = false;
        this.x = x;
        this.y = y;
    }

    public String getNom() {
        return nom;
    }

    public boolean getIncident() {
        return incident;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isIncident() {
        return incident;
    }

    public int getTemps() {
        return temps;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }

    public void setIncident(boolean incident) {
        this.incident = incident;
    }
}
