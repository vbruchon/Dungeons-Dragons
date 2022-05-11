package Partie;

import Partie.Plateau.*;
import Partie.De.De_Position;
import Partie.Plateau.Case.Case;

public class Game {
    private Plateau board;
    private int positionJoueur = 1;


    public void play() {
        this.board = new Plateau();

        while (positionJoueur < 18) {
            De_Position d = new De_Position();
            int de = d.lancerDe();
            newPositionJoueur(de);
            actionCase(positionJoueur);
        }
        System.out.println("Felicitation vous avez gagné");
    }

    public void actionCase(int positionJoueur) {
        Case boxCase = board.getBoxContent(positionJoueur);
        boxCase.action();
    }


    public void newPositionJoueur(int de) {
        this.positionJoueur = this.positionJoueur + de;
        System.out.println("Le joueur se trouve maintenant a la case N° " + positionJoueur);
    }

    public static void main(String[] args) {
        Game g = new Game();

        g.play();
    }
}

/*for (int i = 0 ; i < box.length; ) {

        }
        // tant que partie pas finie
        // lancer dé
        // avancer personnage(positionJoueur)
        // Affecter contenu a la case et réagir

    }*/