package metro;

/*
 * Classe représentant une voie. Une voie est composée d'une station en amont et en aval.
 */
public class Voie {

    //Identifiant de la voie
    private int id;
    //Station en amont
    private Station stationAmont;
    //Station en aval
    private Station stationAval;
    //temsp d'arret a la station
    private int tempsArret;
    //Booléen indiquant si un incident s'est produit sur la voie ou non
    private boolean incident;

    public Voie(int id, Station stationAmont, Station stationAval) {
        this.id = id;
        this.stationAmont = stationAmont;
        this.stationAval = stationAval;
    }

    public Station getStationAmont() {
        return stationAmont;
    }

    public Station getStationAval() {
        return stationAval;
    }

    public int getId() {
        return id;
    }
    
    public boolean getIncident(){
        return incident;
    }

    public void setIncident(boolean incident) {
        this.incident = incident;
    }
}
