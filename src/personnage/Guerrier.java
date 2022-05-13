package personnage;

import equipment.arms.Sledgehammer;
import equipment.arms.Sword;
import equipment.potion.BigLifePotion;
import equipment.potion.LifePotion;
import equipment.spell.FireBall;
import equipment.spell.Lightning;

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

            int forcePoint = sword.getAttackForce();
            System.out.println("La froce de cette arme est de " + forcePoint);
            int m = this.getAttackForce();
            int result = m + forcePoint;

            int newForce = this.setAttackForce(result);
            System.out.println("Vous êtes équipée d'une " + arm + ". Votre force est maintenantt de " + newForce);

        } else if (arm.equals("Bouclier")) {
            Sledgehammer sldg = new Sledgehammer();

            int forcePoint = sldg.getAttackForce();
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