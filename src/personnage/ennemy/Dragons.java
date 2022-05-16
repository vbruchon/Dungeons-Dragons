package personnage.ennemy;

import personnage.Personnage;

public class Dragons extends Personnage {

    public Dragons(){
        setName("Dragons");
        setLifePoint(15);
        setAttackForce(4);
    }
    public void combattre(Personnage personnage , Personnage ennemy) {
        super.combattre(personnage, ennemy);
    }

    @Override
    public void equipSpell(String spell) {

    }

    @Override
    public void equipArm(String arm) {

    }
}