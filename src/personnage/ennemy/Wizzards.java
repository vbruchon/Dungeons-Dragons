package personnage.ennemy;

import personnage.Personnage;

public class Wizzards extends Personnage {
    public Wizzards() {
        setName("Sorcier");
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
