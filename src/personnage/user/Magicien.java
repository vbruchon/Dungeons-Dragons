package personnage.user;

import equipment.potion.BigLifePotion;
import equipment.potion.LifePotion;
import equipment.spell.FireBall;
import equipment.spell.Lightning;
import personnage.Personnage;

public class Magicien extends Personnage {
    String sort;
    String filtre;
    int forcePoint;
    int m ;
    int result;
    int newForce;

    public Magicien() {this("TOOT");}

    public Magicien(String name) {
        this(name, "", 3, 8);
    }

    public Magicien(String name, String img, int lifePoint, int attackForce) {
        setName(name);
        setLifePoint(lifePoint);
        setAttackForce(attackForce);
        sort = "Abracadabra";
        filtre = "Filtre de Guérison";

        String toString = toString();
        System.out.println(toString);
    }
/*________________________________________________Abstract_Methodes__________________________________________________*/
    @Override
    public void equipSpell(String spell) {

        if (spell.equals("FireBall")) {
            FireBall fireball = new FireBall();

            forcePoint = fireball.attackForce();
            System.out.println("La froce de se sort est de " + forcePoint);
            m = this.getAttackForce();
            result = m + forcePoint;

            newForce = this.setAttackForce(result);
            System.out.println("Vous êtes équipée du sort " + spell + ". Votre force est maintenantt de " + newForce);

        } else if (spell.equals("Lightning")) {
            Lightning lightning = new Lightning();

            forcePoint = lightning.attackForce();
            System.out.println("La froce de se sort est de " + forcePoint);
            m = this.getAttackForce();
            result = m + forcePoint;

            newForce = this.setAttackForce(result);
            System.out.println("Vous êtes équipée du sort " + spell + ". Votre force est maintenantt de " + newForce);
        }
    }
    @Override
    public void equipArm(String arm){
        System.out.println("Vous êtes un magicien vous n'utilisez que des sorts! Vous ne pouvais pas vous équiper de " + arm);
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
                ", Actuellement vous n'avez pas de sort, ni de filtre. ";
    }
}