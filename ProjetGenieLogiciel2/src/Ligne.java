
import java.util.ArrayList;





public class Ligne {
    
    private String nom;
    private ArrayList<Station> listeStations;
    
    public Ligne(String nom){
        this.nom=nom;
        //arraylist ?
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
}
