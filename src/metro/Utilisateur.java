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
    
    
/**
    * Retourne la liste des stations du metro
    * @param m le metro
    */
    public ArrayList<Station> listeStations(Metro m){
        //liste des lignes
        HashMap<Integer,Ligne> tabLignes = m.getTabLignes();

        //liste des voies pour chaque ligne
        ArrayList<Voie> v;

        //liste des stations du metro
        ArrayList<Station> s = new ArrayList<Station>();

        //parcours de la liste des lignes
        for(Map.Entry<Integer,Ligne> entry : tabLignes.entrySet()){
            Integer cle = entry.getKey();

            Ligne l = entry.getValue();

            //parcours de la liste des voies de cette ligne 
            v = l.getListeVoies();
            Iterator itVoies = v.iterator();

            while(itVoies.hasNext()){
                Voie voie = (Voie)itVoies.next();
                Station v1 = voie.getStationAmont();
                Station v2 = voie.getStationAval();

                if(!s.contains(v1)){
                    s.add(v1);
                }
                if(!s.contains(v2)){
                    s.add(v2);
                }
            }
        }
        
        for(int i=0 ; i<s.size(); i++)
            System.out.println(s.get(i).getId()+" - "+s.get(i).getNom());
        
        return s;
    }

    
    
    /**
     * recursif : a chaque iteration, affiche la station la + proche et l'ote de l'ArrayList s
     * @param s liste des stations
    **/
    int distmin = 0;
    
    public void stationsPlusProches(Metro m, ArrayList<Station> s, int nbPassages){
        String proche="";
        int dist=1000;
        Station current;
        int idCurrent, distCurrent;
        
        //System.out.println("LISTE DES STATIONS : ");
        //for(int a=0 ; a<s.size() ; a++)
        //    System.out.println(s.get(a).getId()+" -- "+s.get(a).getNom());
        
        for(int i=0 ; i<s.size()-1 ; i++){
        	current = (Station)s.get(i);
            distCurrent = valeurDistance(current.getX(),current.getY()); 
            
            if(distCurrent <= dist && distCurrent > distmin){
                proche = current.getNom();
                dist = distCurrent;
                idCurrent = current.getId();
            }
        }
        
        System.out.println("Station "+proche+" a "+dist+"m.");
        distmin=dist;

        if(s.size()>=1 && nbPassages<3){
        	nbPassages++;
            stationsPlusProches(m,s,nbPassages);
        }
        
        /*
        for(int j=0 ; j<s.size() ; j++)
            System.out.println("RESTANTE : "+s.get(j).getId()+" - "+s.get(j).getNom());
        */
        
    }
    
    /**
     * Calcule la distance entre l'utilisateur et une station dont les coordonnes sont passees en parametres
     * @param x latitude de la station
     * @param y longitude de la station
     * @return 
     */
    public int valeurDistance(int x, int y){
        int currentX = this.getEmplX();
        int currentY = this.getEmplY();
        int distance = (int)Math.sqrt(Math.pow(x-currentX,2)+Math.pow(y-currentY,2));
        return distance;
    }
    
    
}
