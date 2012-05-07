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
        int distance;
        int currentX = this.getEmplX();
        int currentY = this.getEmplY();
        
        
        //liste des lignes
        HashMap<Integer,Ligne> tabLignes = m.getTabLignes();
        
        //liste des voies pour chaque ligne
        ArrayList<Voie> v = new ArrayList<Voie>();
        
        //liste des stations pour chaque voie
        HashMap<Integer,Integer> stations = new HashMap<Integer,Integer>();
        
        //4 stations les plus proches <id,distance>
    //    HashMap<Integer,Integer> stationsProches = new HashMap<Integer,Integer>();
        
        //nom de la station la + proche, et distance
        String proche="";
        int dist=1000;
        
        //parcours de la liste des lignes
        for(Map.Entry<Integer,Ligne> entry : tabLignes.entrySet()){
            
            Integer cle = entry.getKey();
            
            Ligne l = entry.getValue();
            
            //parcours de la liste des voies de cette ligne 
            v = l.getListeVoies();
            Iterator it = v.iterator();
            
            while(it.hasNext()){
                
                Voie voie = (Voie)it.next();
                Station v1 = voie.getStationAmont();
                Station v2 = voie.getStationAval();
                boolean v1vue = false, v2vue = false;
                
    /*            for(Map.Entry<Integer,Integer> stationsVues : stationsProches.entrySet()){
                    
                    Integer key = entry.getKey();
                    
                    Integer voieVue = stationsVues.getValue();
                    
                    if(v1.getId()==voieVue){
                        v1vue = true;
                    }
                    if(v1.getId()==voieVue){
                        v2vue = true;
                    }
                }
     */           
                    if(!v1vue){
                        distance = (int)Math.sqrt(Math.pow(v1.getX()-currentX,2)+Math.pow(v1.getY()-currentY,2));
                        
                        if(distance<dist){
                            dist = distance;
                            proche = v1.getNom();
                        }
                    }
                    
                    if(!v2vue){
                        distance = (int)Math.sqrt(Math.pow(v1.getX()-currentX,2)+Math.pow(v1.getY()-currentY,2));
                        
                        if(distance<dist){
                            dist = distance;
                            proche = v1.getNom();
                        }
                    }
                    
                
                
            }
                
        }
        
        
        System.out.println("Station la plus proche : "+proche+" à "+dist+"m.");
                    
    }
    
    //Ne marche pas car stationPlusProche renvoie toujours le meme resultat.....
    /*
    public void troisPlusProches(Metro m){
        System.out.println("Les 4 stations les plus proches : ");
        for(int i=0 ; i<3 ; i++){
            this.stationPlusProche(m);
            System.out.println("");
        }
    }
    * */
}
