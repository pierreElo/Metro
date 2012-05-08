package metro;

import java.util.HashMap;
import java.util.Map;

public class ListeUtilisateurs {

    private HashMap<String, Utilisateur> listeUtilisateurs;

    public ListeUtilisateurs() {
        listeUtilisateurs = new HashMap<String, Utilisateur>();
    }

    public void ajouterUtilisateur(Utilisateur u) {
        if (u != null) {
            listeUtilisateurs.put(u.getLogin(), u);
        }
    }

    public boolean contientEnregistrement(String login, String password) {
        boolean contient = false;
        if (listeUtilisateurs.get(login) != null) {
            if (password.equals(password)) {
                contient = true;
            }
        }
        return contient;
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
