package personnage.ennemy;

import partie.plateau.caseBoard.CaseBoard;

public class Wizzards extends Ennemy implements CaseBoard {
    public Wizzards() {
        super();
        setName("Sorcier");
        setLifePoint(15);
        setAttackForce(4);
    }

}
