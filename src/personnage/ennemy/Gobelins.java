package personnage.ennemy;

import partie.plateau.CaseBoard;
import personnage.Personnage;

public class Gobelins extends Ennemy implements CaseBoard {

    public Gobelins() {
        super();
        setName("Gobelin");
        setLifePoint(6);
        setAttackForce(1);
    }

}
