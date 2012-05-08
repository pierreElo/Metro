
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author lily277
 */
public class UtilisateurTest {
    
    /**
     * Test of Connexion method, of class Utilisateur.
     */
    @Test
    public void testConnexion() {
        System.out.println("Connexion");
        Utilisateur u = new Utilisateur("toto","pass");
        Utilisateur v = new Utilisateur("tata","pass");
        ListeUtilisateurs l = new ListeUtilisateurs();
        l.ajouterUtilisateur(u);
        assertEquals(u.Connexion(l), true);
        assertEquals(v.Connexion(l), false);
    }


}

