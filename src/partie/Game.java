package partie;

import partie.de.De;
import partie.plateau.*;
import partie.plateau.Case.Case;
import personnage.Personnage;

public class Game {
    /*__________Attributs_________*/
    private Plateau board;
    private int positionJoueur = 1;
    private Personnage personnage;

    public Game(Personnage personnage) {
        this.personnage = personnage;
    }

    /*________Mehodes________*/
    public void play() {
        this.board = new Plateau();

        while (positionJoueur < 45) {
            De d = new De();
            int de = d.lancerDe();
            newPositionJoueur(de);
            actionCase(positionJoueur);
        }
        System.out.println("Felicitation vous avez gagné");
    }
    public void actionCase(int positionJoueur) {
        Case boxCase = board.getBoxContent(positionJoueur);
        boxCase.action(personnage);
    }
    public void newPositionJoueur(int de) {
        this.positionJoueur = this.positionJoueur + de;
        System.out.println("Le joueur se trouve maintenant a la case N° " + positionJoueur);
    }
}