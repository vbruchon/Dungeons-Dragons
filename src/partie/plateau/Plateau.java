package partie.plateau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import equipment.arms.*;
import equipment.potion.*;
import equipment.spell.*;
import partie.plateau.caseBoard.EmptyCase;
import partie.plateau.caseBoard.CaseBoard;
import personnage.ennemy.*;


public class Plateau {

    public List<CaseBoard> board;

    private Dragons drg;
    private Gobelins gbl;
    private Wizzards wiz;
    private FireBall fb;
    private Lightning ln;
    private Sword s;
    private Sledgehammer slg;
    private LifePotion lp;
    private BigLifePotion blp;
    private EmptyCase ec;


    public Plateau() {
        this.board = new ArrayList<>(64); //24 monstres 24 surprise 16 vide//

        for (int i = 0; i < 4; i++) {
            drg = new Dragons();
            board.add(drg);
        }
        for (int i = 0; i < 10; i++) {
            gbl = new Gobelins();
            board.add(gbl);
        }
        for (int i = 0; i < 10; i++) {
            wiz = new Wizzards();
            board.add(wiz);

        }
        for (int i = 0; i < 2; i++) {
            fb = new FireBall();
            board.add(fb);

        }
        for (int i = 0; i < 5; i++) {
            ln = new Lightning();
            board.add(ln);

        }
        for (int i = 0; i < 4; i++) {
            s = new Sword();
            board.add(s);

        }
        for (int i = 0; i < 5; i++) {
            slg = new Sledgehammer();
            board.add(slg);

        }
        for (int i = 0; i < 6; i++) {
            lp = new LifePotion();
            board.add(lp);

        }
        for (int i = 0; i < 2; i++) {
            blp = new BigLifePotion();
            board.add(blp);

        }
        for (int i = 0; i < 16 ; i++){
            ec = new EmptyCase();
            board.add(ec);
        }
        Collections.shuffle(board);

        System.out.println("Vous jouez sur un plateau de " + board.size() + " cases.");
    }

    public CaseBoard getBoxContent(int positionJoueur) {
        return board.get(positionJoueur);
    }

    public void viderCase(int positionJoueur){
        EmptyCase emptyCase = new EmptyCase();
        board.set(positionJoueur, emptyCase);
    }
}
