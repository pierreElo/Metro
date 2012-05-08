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
            t = new Timer(stationPosition.getTempsArret() * 60000, deplacerRame);
            t.start();
            System.out.println("Voie initiale : " + voiePosition.getId());
            System.out.println("Station initiale : " + stationPosition.getNom());
        }
    }

    public Rame getRame() {
        return this;
    }

    public Voie getVoiePosition() {
        return voiePosition;
    }

    public Station getStationPosition() {
        return stationPosition;
    }

    /*
     * Retourne -1 si la rame est déjà passée, 0 si la rame est dans la station
     * et une valeur positive sinon
     */
    public int tpsRestAttStation(Station s) {
        int tempsRestant = -1;
        int i = listePos;
        boolean trouve = false;
        if (ligne.contientStationB(s)) {
            Voie v = ligne.getVoie(i);
            if (stationPosition != null) {
                if (stationPosition.getId() != s.getId()) {
                    tempsRestant = t.getDelay() / 60000 + v.getTempsParcours();
                    if (v.getStationAval().getId() != s.getId()) {
                        i++;
                    }
                    while (!trouve && ligne.getListeVoies().size() > i) {
                        Voie tmp = ligne.getVoie(i);
                        tempsRestant += tmp.getStationAmont().getTempsArret() + v.getTempsParcours();
                        if (tmp.getStationAval().getId() == s.getId()) {
                            trouve = true;
                        }
                        i++;
                    }
                } else {
                    tempsRestant = 0;
                }
            } else {
                tempsRestant = t.getDelay() / 60000;
                if (v.getStationAval().getId() != s.getId()) {
                    i++;
                    while (!trouve && ligne.getListeVoies().size() > i) {
                        Voie tmp = ligne.getVoie(i);
                        tempsRestant += tmp.getStationAmont().getTempsArret() + v.getTempsParcours();
                        if (tmp.getStationAval().getId() == s.getId()) {
                            trouve = true;
                        }
                        i++;
                    }
                }
            }
        }
        return tempsRestant;
    }

    class DeplacerRame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (fin) {
                ligne.supprimerRame(getRame());
            } else {
                if (stationPosition != null) {
                    System.out.println("Est sur la station " + stationPosition.getNom() + ", emprunte la voie " + voiePosition.getId());
                    stationPosition = null;
                    t.setDelay(voiePosition.getTempsParcours() * 60000);
                    t.restart();
                } else {
                    listePos++;
                    if (ligne.getListeVoies().size() > listePos) {
                        System.out.println("Est sur la voie " + voiePosition.getId() + ", arrive sur la station " + voiePosition.getStationAval().getNom());
                        voiePosition = ligne.getVoie(listePos);
                        stationPosition = voiePosition.getStationAmont();
                        t.setDelay(voiePosition.getStationAmont().getTempsArret() * 60000);
                        t.restart();
                    } else {
                        stationPosition = voiePosition.getStationAval();
                        System.out.println("Est sur la dernière station " + stationPosition.getNom());
                        t.setDelay(stationPosition.getTempsArret() * 60000);
                        fin = true;
                        t.restart();
                    }
                }
            }
        }
    }
}
