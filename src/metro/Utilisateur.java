package metro;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Utilisateur {

    
    private String login;
    private String password;
    private Set<Utilisateur> listeUtilisateurs;
    
    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
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
    
    public void Inscription(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre login : ");
        String login = sc.nextLine();
        System.out.println("Veuillez entrer votre mot de passe : ");
        String mdp = sc.nextLine();
        Utilisateur u = new Utilisateur(login, mdp);
        listeUtilisateurs.add(u);
        if(listeUtilisateurs.add(u) == false)
         System.out.println("Inscription échouée");
        else 
         System.out.println("Inscription réussie");
    }
    
    public void Connexion(){
        Utilisateur setlog;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre login : ");
        String login = sc.nextLine();
        System.out.println("Veuillez entrer votre mot de passe : ");
        String mdp = sc.nextLine();
        System.out.println("le chemin min est : ");
        
    }
    
    public void Deconnexion(){
        
    }
    
}
