package personnage.ennemy;

import personnage.Personnage;

public class Gobelins extends Personnage {

    public Gobelins() {
        setName("Gobelin");
        setLifePoint(6);
        setAttackForce(1);
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
