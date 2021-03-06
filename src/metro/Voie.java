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
    //Temps de parcours entre les deux stations
    private int tempsParcours;
    //Booléen indiquant si un incident s'est produit sur la voie ou non
    private boolean incident;

    public Voie(int id, Station stationAmont, Station stationAval, int tempsParcours) {
        this.id = id;
        this.stationAmont = stationAmont;
        this.stationAval = stationAval;
        this.tempsParcours = tempsParcours;
        this.incident = false;
    }
    
    public int getId() {
        return id;
    }

    public Station getStationAmont() {
        return stationAmont;
    }

    public Station getStationAval() {
        return stationAval;
    }
    
    public boolean getIncident(){
        return incident;
    }

    public int getTempsParcours() {
        return tempsParcours;
    }

    public void setIncident(boolean incident) {
        this.incident = incident;
    }
    
    public boolean contientStation(Station s){
        boolean trouve = this.stationAmont.getId()==s.getId()||this.stationAval.getId()==s.getId() ? true : false;
        return trouve; 
    }
    
    public Station retourneStationO(Station s){
        if(this.stationAmont.getId()==s.getId())
            return this.stationAval;
        else
            return this.stationAmont;
    }
}
