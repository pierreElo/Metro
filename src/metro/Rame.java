package metro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * Classe modélisant une rame de métro
 */
public class Rame {

    private Timer t;
    private Ligne ligne;
    private Station stationPosition;
    private Voie voiePosition;
    private int listePos;
    private boolean fin = false;

    public Rame(Ligne ligne) {
        this.ligne = ligne;
        if (!ligne.getListeVoies().isEmpty()) {
            listePos = 0;
            voiePosition = ligne.getVoie(listePos);
            stationPosition = voiePosition.getStationAmont();
            DeplacerRame deplacerRame = new DeplacerRame();
            t = new Timer(stationPosition.getTempsArret(), deplacerRame);
            t.start();
        }
    }
    
    public Rame getRame(){
        return this;
    }

    class DeplacerRame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (fin) {
                ligne.supprimerRame(getRame());
            } else {
                if (stationPosition != null) {
                    stationPosition = null;
                    t.setDelay(voiePosition.getTempsParcours());
                    System.out.println("Est sur la station "+stationPosition.getNom()+", emprunte la voie "+voiePosition.getId());
                } else {
                    listePos++;
                    if (ligne.getListeVoies().size() > listePos) {
                        System.out.println("Est sur la voie "+voiePosition+", arrive sur la station "+voiePosition.getStationAval());
                        voiePosition = ligne.getVoie(listePos);
                        stationPosition = voiePosition.getStationAmont();
                        t.setDelay(voiePosition.getStationAmont().getTempsArret());
                    } else {
                        stationPosition = voiePosition.getStationAval();
                        t.setDelay(stationPosition.getTempsArret());
                        fin = true;
                    }
                }
            }
        }
    }
}
