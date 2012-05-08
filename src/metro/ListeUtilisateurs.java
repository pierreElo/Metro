package metro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ListeUtilisateurs {
    
    private HashMap<String,Utilisateur> listeUtilisateurs;

    public ListeUtilisateurs() {
        listeUtilisateurs = new HashMap<String, Utilisateur>();
    }
      
    public void ajouterUtilisateur(Utilisateur u){
        if (u!=null){
    listeUtilisateurs.put(u.getLogin(), u);
        }
    }

    public boolean contientUtilisateur(Utilisateur u){
        if(listeUtilisateurs.containsValue(u) == true){
            return true;
        }
        else return false;
    }

    public boolean contientEnregistrement(String login, String password){
        
       boolean contient = false;
       Iterator<Map.Entry<String,Utilisateur>> itr = listeUtilisateurs.entrySet().iterator();

        //Boucle sur le champ clé de la HashMap
        for(Map.Entry<String,Utilisateur> entry : listeUtilisateurs.entrySet()){
            String cle = entry.getKey();
            System.out.println("Vo");
            //Recupere la valeur pour la cle en cours
            String login2 = entry.getValue().getLogin().toString();
            String mdp = entry.getValue().getPassword().toString();
            
            //Verifie si le login et le password sont les mêmes que ceux de l'enregistrement
            if (login2.equals(login) && mdp.equals(password)){
                
                System.out.println(cle+" - "+login);
                contient = true;
            }
        }
       return contient;
    }    
    
    public void afficherListeUsers(){
        System.out.println("\n\nListe des utilisateurs : ");
        
        //Boucle sur le champ clé de la HashMap
        for(Map.Entry<String,Utilisateur> entry : listeUtilisateurs.entrySet()){
            String cle = entry.getKey();
            
            //Recupere la valeur pour la cle en cours, et ecrit le couple
            String val = entry.getValue().getLogin().toString();
            System.out.println(cle+" - "+val);
        }
    }

}
