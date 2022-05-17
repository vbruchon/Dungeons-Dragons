package personnage.user;

import equipment.arms.Sledgehammer;
import equipment.arms.Sword;
import personnage.Personnage;

public class Guerrier extends Personnage {
    String arme;
    String bouclier;

    public Guerrier() {
        this("Toto");
    }

    public Guerrier(String name) {
        this(name, "", 5, 5);
    }

    public Guerrier(String name, String img, int lifePoint, int attackForce) {
        setName(name);
        setLifePoint(lifePoint);
        setAttackForce(attackForce);
        arme = "";
        bouclier = "";

        String toString = toString();
        System.out.println(toString);
    }
    /*________________________________________________Abstract_Methodes__________________________________________________*/
    @Override
    public void equipArm(String arm) {

        if (arm.equals("Sword")) {
            Sword sword = new Sword();

            int forcePoint = sword.attackForce();
            System.out.println("La froce de cette arme est de " + forcePoint);
            int m = this.getAttackForce();
            int result = m + forcePoint;

            int newForce = this.setAttackForce(result);
            System.out.println("Vous êtes équipée d'une " + arm + ". Votre force est maintenantt de " + newForce);

        } else if (arm.equals("Bouclier")) {
            Sledgehammer sldg = new Sledgehammer();

            int forcePoint = sldg.attackForce();
            System.out.println("La froce de cette arme est de " + forcePoint);
            int m = this.getAttackForce();
            int result = m + forcePoint;

            int newForce = this.setAttackForce(result);
            System.out.println("Vous êtes équipée d'un " + arm + ". Votre force est maintenantt de " + newForce);
        }
    }
    @Override
    public void equipSpell(String spell){
        System.out.println("Vous êtes un guerrier vous n'utilisez que des armes! Vous ne pouvais pas vous équiper du sort " + spell);
    }

    @Override
    public void drinkPotion(String potion) {
        super.drinkPotion(potion);
    }

    public void combattre(Personnage personnage , Personnage ennemy) {
        super.combattre(personnage, ennemy);
    }

    /*____________________________________________________________________________________________________________________*/

    public String toString() {
        return "Votre personnage est un " + this.getClass().getSimpleName() + ", vous l'aves nommé " + this.getName() +
                ", il possède " + this.getLifePoint() + " point de vie, " +
                " il a une puissance d'attaque de " + this.getAttackForce() +
                ", Actuellement vous n'avez pas d'equipement, ni de bouclier. ";
    }

}

        /*"Votre personnage est un " + this.getClass().getSimpleName() + ", vous l'aves nommé " + this.getName() +
        ", il possède " + this.getLifePoint() + " point de vie, " +
        " il a une puissance d'attaque de " + this.getAttackForce() +
        " son sort d'attaque est " + this.arme + " et son filtre de défense est " + this.bouclier;*/