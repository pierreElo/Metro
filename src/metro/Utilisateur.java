package metro;

import java.util.*;


public class Utilisateur {

    
    private String login;
    private String password;
    private Set<Utilisateur> listeUtilisateurs;
    private int emplX;
    private int emplY;
    
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
    
    public int getEmplX(){
        return this.emplX;
    }
    
    public void setEmplX(int x){
        this.emplX = x;
    }
    
    public int getEmplY(){
        return this.emplY;
    }
    
    public void setEmplY(int y){
        this.emplY = y;
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
    
    public void emplacementCourant(){
        //x entre -5 et 35 (x d'1 station entre 0 et 30)
        Random r1 = new Random();
        int x = -5 + r1.nextInt(35);
        
        //y entre -20 et 40 (y d'1 station entre -15 et 40)
        Random r2 = new Random();
        int y = -20 + r2.nextInt(45);
        
        this.emplX = x;
        this.emplY = y;
        
        System.out.println("Vous êtes en ("+x+" ; "+y+").");
        
    }
    
    public void stationPlusProche(Metro m){
        int currentX, currentY, distX, distY, distTot;
        ArrayList<Voie> v = new ArrayList<Voie>();
        HashMap<Integer,Ligne> tabLignes = m.getTabLignes();
        boolean dejaVu = false;
        //emplacement utilisateur
        currentX = this.getEmplX();
        currentY = this.getEmplY();
                
        //stations deja parcourues
        int[] stationsVues;
        
        for(Map.Entry<Integer,Ligne> entry : tabLignes.entrySet()){
            Integer cle = entry.getKey();
            
            Ligne l = entry.getValue();
            v = l.getListeVoies();
            
            //parcours des voies de la ligne consideree
            //ajouter 1 valeur true/false pour vue/pasvue ?
            
        /*    for(int i=0 ; i<v.size() ; i++){
                for (int var : stationsVues){
                    if(var==v.get(i).getId()){
                        dejaVu = true;
                        break;
                    }
                }
                
            
                if(!dejaVu){
                
                distX = (this.getEmplX()-v.get(i).getStationAmont().getX());
                distY = (this.getEmplY()-v.get(i).getStationAmont().getX());
                
                System.out.println((String)(v.get(i).getStationAmont().getNom())+" -> "+(String)(v.get(i).getStationAval().getNom()));
            }
            
            System.out.println("");
            }
        */
                
        }
    }
    
}
