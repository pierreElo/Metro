package metro;

import java.util.HashMap;

public class ListeUtilisateurs {
    
    private HashMap<Integer,Utilisateur> listeUtilisateurs;

    public ListeUtilisateurs() {
        listeUtilisateurs = new HashMap<Integer, Utilisateur>();
    }
      
    public void ajouterUtilisateur(Utilisateur u){
    listeUtilisateurs.put(u.getIdUser(), u);
    }    
}