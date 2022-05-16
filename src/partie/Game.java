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

    /*________Mehodes________
    public void play() {
        this.board = new Plateau();

        while (positionJoueur != 64) {
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

    }*/

    public void play() {
        this.board = new Plateau();
        this.positionJoueur = 1;
        while (positionJoueur != 10) {
            De d = new De();
            int de = d.lancerDe();
            newPositionJoueur(de);
            actionCase(positionJoueur);
        }
    }
    public void actionCase(int positionJoueur) {
        Case boxCase = board.getBoxContent(positionJoueur);
        boxCase.action(personnage);
    }
    public void newPositionJoueur(int de) {
        int result;
        int caseMax = 10;

        if ((this.positionJoueur + de) < caseMax ){
            this.positionJoueur = this.positionJoueur + de;
            System.out.println("Le joueur se trouve maintenant a la case N° " + positionJoueur);
        } else if ((this.positionJoueur + de)> caseMax){
            result = (this.positionJoueur + de) - caseMax;
            this.positionJoueur = caseMax - result;
            System.out.println("Vous devez arrivé exactement sur la case " + caseMax + " Vous reculez de " + result + "cases");
            System.out.println("Le joueur se trouve maintenant a la case N° " + positionJoueur);
        } else if ((this.positionJoueur + de) == caseMax){
            System.out.println("Félicitations vous avez gagné !! :) :) :)");
            System.exit(5);
        }
    }
}


