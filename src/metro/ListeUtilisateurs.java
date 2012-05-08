package metro;

import java.util.HashMap;
import java.util.Map;

public class ListeUtilisateurs {
    
    private HashMap<Integer,Utilisateur> listeUtilisateurs;

    public ListeUtilisateurs() {
        listeUtilisateurs = new HashMap<Integer, Utilisateur>();
    }
      
    public void ajouterUtilisateur(Utilisateur u){
    listeUtilisateurs.put(u.getIdUser(), u);
    }

    public boolean contientUtilisateur(Utilisateur u){
        if(listeUtilisateurs.containsValue(u) == true){
            return true;
        }
        else return false;
    }
    
            public void afficherListeUsers(){
        System.out.println("\n\nListe des utilisateurs : ");
        
        //Boucle sur le champ clé de la HashMap
        for(Map.Entry<Integer,Utilisateur> entry : listeUtilisateurs.entrySet()){
            Integer cle = entry.getKey();
            
            //Recupere la valeur pour la cle en cours, et ecrit le couple
            String val = entry.getValue().getLogin().toString();
            System.out.println(cle+" - "+val);
        }
    }

}
