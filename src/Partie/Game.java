package Partie;

import Partie.Plateau.*;
import Partie.De.De_Position;
import Partie.Plateau.Case.Case;

public class Game {
    private Plateau board;
    private De_Position d;
    private Case cel;
    private int positionJoueur = 1;


    public void play() {
        this.board = new Plateau();

        while (positionJoueur < 64) {
            this.d = new De_Position();
            int de = d.lancerDe();
            newPositionJoueur(de);
            actionCase(positionJoueur);
        }
    }

    public void actionCase(int positionJoueur) {
        Case boxCase = board.getBoxContent(positionJoueur);
        String boxContent = boxCase.getContent();

        if (boxContent.equals("surprise")) {
            System.out.println("La case contient une surprise. Récupérer là, puis Lancer les dés");
            boxCase.surpriseCase();
        } else if (boxContent.equals("ennemy")) {
            System.out.println("Vous avec un ennemie battez le et lancer les dés");
            boxCase.ennemyCase();
        } else {
            boxCase.emptyCase();
        }
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