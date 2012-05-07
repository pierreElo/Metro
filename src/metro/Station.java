package metro;

/*
 * Classe représentant une station
 */
public class Station {

    //Identifiant de la station
    private int id;

    //Nom de la station
    private String nom;
    
    //Temps d'arrêt à la station
    private int tempsArret;
    
    //Booléen indiquant si un incident s'est produit à la station ou non
    private boolean incident;
    
    //Coordonnées de la station
    private int x;
    private int y;

    public Station(int id, String nom, int x, int y, int tempsArret) {
        this.id = id;
        this.nom = nom;
        this.incident = false;
        this.x = x;
        this.y = y;
        this.tempsArret = tempsArret;
    }
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public boolean getIncident() {
        return incident;
    }

    public boolean isIncident() {
        return incident;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTempsArret() {
        return tempsArret;
    }
    
    public void setIncident(boolean incident){
        this.incident=incident;
    }
    
    
}
