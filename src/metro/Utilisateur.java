package metro;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;


public class Utilisateur {

    private int idUser;
    private String login;
    private String password;
    private int preferenceChemin; // 0=chemin le + rapide 1= chemin avec le moins de changements
    private ArrayList<Station> listeStations;

    
    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public ArrayList<Station> getListeStations() {
        return listeStations;
    }

    public void setListeStations(ArrayList<Station> listeStations) {
        this.listeStations = listeStations;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPreferenceChemin() {
        return preferenceChemin;
    }

    public void setPreferenceChemin(int preferenceChemin) {
        this.preferenceChemin = preferenceChemin;
    }


    
    
    
    public void Inscription(Utilisateur u, ListeUtilisateurs l){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre login : \n");
        String login = sc.nextLine();
        u.login=login;
        System.out.println("Veuillez entrer votre mot de passe : \n");
        String mdp = sc.nextLine();
        u.password=mdp;
        System.out.println("Veuillez choisir vos préférences : ");
        System.out.println("Tapez 1 si vous souhaitez le chemin le plus rapide \n");
        System.out.println("Tapez 0 si vous souhaitez le moins de changements possibles \n");
        int choix = sc.nextInt();
        u.preferenceChemin=choix;
        System.out.println("Quelle(s) station(s) souhaitez-vous ajouter à vos préférences ? \n");
        
        l.ajouterUtilisateur(u);
        System.out.println("Inscription réussie");
        
    }
    
    public void Connexion(){
        Utilisateur setlog;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre login : ");
        String login = sc.nextLine();
        System.out.println("Veuillez entrer votre mot de passe : ");
        String mdp = sc.nextLine();
        
    }
    
    public void Deconnexion(){
        
    }
    
}
