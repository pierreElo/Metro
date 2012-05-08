package metro;

import java.util.*;

public class Utilisateur {

    private int idUser;
    private String login;
    private String password;
    private boolean estAdmin;
    private int preferenceChemin; // 0=chemin le + rapide 1= chemin avec le moins de changements
    private ArrayList<Station> listeStations; // liste des stations par lesquelles l'utilisateur souhaite passer
    private Set<Utilisateur> listeUtilisateurs;
    private int emplX;
    private int emplY;

    public Utilisateur(String login, String password, boolean estAdmin) {
        this.login = login;
        this.password = password;
        this.estAdmin = estAdmin;
    }
    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean isEstAdmin() {
        return estAdmin;
    }

    public Set<Utilisateur> getListeUtilisateurs() {
        return listeUtilisateurs;
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
    
    public void ajouterStation(Station s) {
        listeStations.add(s);
    }

    public void setListeStations(ArrayList<Station> listeStations) {
        this.listeStations = listeStations;
    }

    public void setEstAdmin(boolean estAdmin) {
        this.estAdmin = estAdmin;
    }

    public void setListeUtilisateurs(Set<Utilisateur> listeUtilisateurs) {
        this.listeUtilisateurs = listeUtilisateurs;
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

    public int getEmplX() {
        return this.emplX;
    }

    public void setEmplX(int x) {
        this.emplX = x;
    }

    public int getEmplY() {
        return this.emplY;
    }

    public void setEmplY(int y) {
        this.emplY = y;
    }

    public int getPreferenceChemin() {
        return preferenceChemin;
    }

    public void setPreferenceChemin(int preferenceChemin) {
        this.preferenceChemin = preferenceChemin;
    }

    public void Inscription(ListeUtilisateurs l,String login, String mdp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nVeuillez choisir vos preferences : ");
        System.out.println("Tapez 1 si vous souhaitez le chemin le plus rapide ");
        System.out.println("Tapez 0 si vous souhaitez le moins de changements possibles");
        int choix = sc.nextInt();
        this.preferenceChemin = choix;
        this.idUser = l.getId();
        l.ajouterUtilisateur(this);
        System.out.println("Inscription reussie\n");

    }

    public void AjoutPreferenceStations(Utilisateur u, Station s){
        /*System.out.println("Quelle(s) station(s) souhaitez-vous ajouter a vos preferences ? \n");
        boolean ajout=true;
        Scanner sc = new Scanner(System.in);
        String station = sc.nextLine();
        Station st = new Station(station);
        
        if()*/
        u.ajouterStation(s);
    }
    
    public void Connexion(ListeUtilisateurs l) { // Fonction qui connecte l'utilisateur √† son compte
        /*
         * System.out.println("Veuillez entrer votre login : "); String login =
         * sc.nextLine(); System.out.println("Veuillez entrer votre mot de passe
         * : "); String mdp = sc.nextLine();
         */

        boolean b = l.contientEnregistrement(this.login,this.password);
        if (b == true) {
            System.out.println("Vous etes connecté");
        } 
        else {
            System.out.println("Vous n'etes pas connecté");
        }

        System.out.println("le chemin min est : ");
    }

    public void Deconnexion(Utilisateur u) {
        System.out.println("Vous êtes déconnecté");
    }

    public void emplacementCourant() {
        //x entre -5 et 35 (x d'1 station entre 0 et 30)
        Random r1 = new Random();
        int x = -5 + r1.nextInt(35);

        //y entre -20 et 40 (y d'1 station entre -15 et 40)
        Random r2 = new Random();
        int y = -20 + r2.nextInt(45);

        this.emplX = x;
        this.emplY = y;

        System.out.println("Vous etes en (" + x + " ; " + y + ").");

    }

    public void stationPlusProche(Metro m) {
        int distance;
        int currentX = this.getEmplX();
        int currentY = this.getEmplY();

        //liste des lignes
        HashMap<Integer, Ligne> tabLignes = m.getTabLignes();

        //liste des voies pour chaque ligne
        ArrayList<Voie> v = new ArrayList<Voie>();

        //liste des stations pour chaque voie
        HashMap<Integer, Integer> stations = new HashMap<Integer, Integer>();

        //4 stations les plus proches <id,distance>
        //    HashMap<Integer,Integer> stationsProches = new HashMap<Integer,Integer>();

        //nom de la station la + proche, et distance
        String proche = "";
        int dist = 1000;

        //parcours de la liste des lignes
        for (Map.Entry<Integer, Ligne> entry : tabLignes.entrySet()) {

            Integer cle = entry.getKey();

            Ligne l = entry.getValue();

            //parcours de la liste des voies de cette ligne 
            v = l.getListeVoies();
            Iterator it = v.iterator();

            while (it.hasNext()) {

                Voie voie = (Voie) it.next();
                Station v1 = voie.getStationAmont();
                Station v2 = voie.getStationAval();
                boolean v1vue = false, v2vue = false;

                /*
                 * for(Map.Entry<Integer,Integer> stationsVues :
                 * stationsProches.entrySet()){
                 *
                 * Integer key = entry.getKey();
                 *
                 * Integer voieVue = stationsVues.getValue();
                 *
                 * if(v1.getId()==voieVue){ v1vue = true; }
                 * if(v1.getId()==voieVue){ v2vue = true; } }
                 */
                if (!v1vue) {
                    distance = (int) Math.sqrt(Math.pow(v1.getX() - currentX, 2) + Math.pow(v1.getY() - currentY, 2));

                    if (distance < dist) {
                        dist = distance;
                        proche = v1.getNom();
                    }
                }

                if (!v2vue) {
                    distance = (int) Math.sqrt(Math.pow(v1.getX() - currentX, 2) + Math.pow(v1.getY() - currentY, 2));

                    if (distance < dist) {
                        dist = distance;
                        proche = v1.getNom();
                    }
                }
            }
        }
        System.out.println("Station la plus proche : " + proche + " a " + dist + "m.");
    }
    //Ne marche pas car stationPlusProche renvoie toujours le meme resultat.....
    /*
     * public void troisPlusProches(Metro m){ System.out.println("Les 4 stations
     * les plus proches : "); for(int i=0 ; i<3 ; i++){
     * this.stationPlusProche(m); System.out.println(""); } }
    *
     */
}
