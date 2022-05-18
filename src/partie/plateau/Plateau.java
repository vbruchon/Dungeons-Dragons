package partie.plateau;

import java.util.ArrayList;
import java.util.Collections;
import equipment.arms.*;
import equipment.potion.*;
import equipment.spell.*;
import partie.plateau.Case.EmptyCase;
import personnage.ennemy.*;


public class Plateau {

    public ArrayList<CaseBoard> board;

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
        this.board = new ArrayList<>(64); //24 monstre 24 surprise 16 vide//

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

    /*__________________________GETTER__________________*/
    public Dragons getDrg() { return drg; }
    public Gobelins getGbl() { return gbl; }
    public Wizzards getWiz() { return wiz; }
    public FireBall getFb() { return fb; }
    public Lightning getLn() { return ln; }
    public Sword getS() { return s; }
    public Sledgehammer getSlg() { return slg; }
    public LifePotion getLp() { return lp; }
    public BigLifePotion getBlp() { return blp; }
    /*__________________________SETTER__________________*/
    public void setDrg(Dragons drg) { this.drg = drg; }
    public void setGbl(Gobelins gbl) { this.gbl = gbl; }
    public void setWiz(Wizzards wiz) { this.wiz = wiz; }
    public void setFb(FireBall fb) { this.fb = fb; }
    public void setLn(Lightning ln) { this.ln = ln; }
    public void setS(Sword s) { this.s = s; }
    public void setSlg(Sledgehammer slg) { this.slg = slg; }
    public void setLp(LifePotion lp) { this.lp = lp; }
    public void setBlp(BigLifePotion blp) { this.blp = blp; }
}































/*    private final Case[] box;
    public Plateau() {
        this.box = new Case[64];

        for (int i = 0; i < box.length; i++) {
             box[i] = caseContent();
        }
    }
    public Case getBoxContent(int position){
        return this.box[position];
    }

    @Override
    public void action(Personnage personnage) {

    }*/
