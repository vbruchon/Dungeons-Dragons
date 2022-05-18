package personnage.ennemy;

import partie.plateau.CaseBoard;
import personnage.Personnage;

public class Dragons extends Ennemy implements CaseBoard {

    public Dragons(){
        super();
        setName("Dragons");
        setLifePoint(15);
        setAttackForce(4);
    }
}