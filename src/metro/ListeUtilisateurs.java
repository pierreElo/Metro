package metro;

import java.util.HashMap;
import java.util.Map;

public class ListeUtilisateurs {
    
    private HashMap<String,Utilisateur> listeUtilisateurs;
    private int id = 1;

    public ListeUtilisateurs() {
        listeUtilisateurs = new HashMap<String, Utilisateur>();
    }
 
    public void ajouterUtilisateur(Utilisateur u){
        if (u!=null){
        listeUtilisateurs.put(u.getLogin(), u);
        this.id++;
        }
    }

    public HashMap<String, Utilisateur> getListeUtilisateurs() {
        return listeUtilisateurs;
    }

    public void setListeUtilisateurs(HashMap<String, Utilisateur> listeUtilisateurs) {
        this.listeUtilisateurs = listeUtilisateurs;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean contientEnregistrement(String login, String password){
        
       if(listeUtilisateurs.get(login) != null){ // vérifie si le login existe dans la liste d'utilisateurs
          if (password.equals(password)){
               return true;
           }
           if (!password.equals(password)){
               return false;
           }
       }
       return false;
    }

    public void afficherListeUsers() {
        System.out.println("\n\nListe des utilisateurs : ");

        //Boucle sur le champ clé de la HashMap
        for (Map.Entry<String, Utilisateur> entry : listeUtilisateurs.entrySet()) {
            String cle = entry.getKey();

            //Recupere la valeur pour la cle en cours, et ecrit le couple
            String val = entry.getValue().getLogin().toString();
            System.out.println(cle + " - " + val);
        }
    }
}
