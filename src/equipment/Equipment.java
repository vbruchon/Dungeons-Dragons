package equipment;

import equipment.arms.Arms;
import equipment.potion.BigLifePotion;
import equipment.potion.LifePotion;
import equipment.potion.Potions;
import equipment.spell.Spells;
import partie.plateau.CaseBoard;
import partie.plateau.Plateau;
import personnage.Personnage;
import partie.menu.Menu;
import personnage.user.Guerrier;
import personnage.user.Magicien;

public class Equipment implements CaseBoard {

    /*____Attributs____*/

    private String nameEquipment;
    private int attackForce;
    private int pointOfLife;
    Menu m;
    Plateau board;
    String quit = "Q";
    String recup = "R";

    /*____Méthodes____*/

    public void action(Personnage personnage) {
        m = new Menu();
        String userInput = this.m.catchSurprise();

        if (recup.equals((userInput))) {
            whatIsSurprise(personnage);
            if (canEquip(personnage)) {
                equip(personnage);
            } else {
                System.out.println("Vous ne pouvez pas utiliser " + getNameEquipment());
            }
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            m.verifSurpriseCase(userInput);
        }
    }


    public void whatIsSurprise(Personnage personnage) {
        System.out.println(nameEquipment);
    }

    public boolean canEquip(Personnage personnage){
        boolean answer = false;

        if (this instanceof Potions){
            answer = true;
        }
        else if ((personnage instanceof Guerrier) && (this instanceof Arms)){
            answer = true;
        } else if ((personnage instanceof Magicien) && (this instanceof Spells)) {
            answer = true;
        }

        return  answer;
    }

    public void equip(Personnage personnage) {

        int lifePoint = personnage.getLifePoint();
        int pointAttack = personnage.getAttackForce();
        int newLife = lifePoint + this.pointOfLife;
        int newPointAttack = pointAttack + this.attackForce;

        personnage.setLifePoint(newLife);
        personnage.setAttackForce(newPointAttack);

        System.out.println("Vous vous équipez avec " + this.getNameEquipment() + ". Maintenant votre personnage possède " + newLife + " point de vie, et " + newPointAttack + " point d'attaque");
    }

    /*__________________________SETTER________________________*/
    public void setNameEquipment(String nameEquipment) {
        this.nameEquipment = nameEquipment;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

    public void setPointOfLife(int pointOfLife) {
        this.pointOfLife = pointOfLife;
    }

    /*__________________________GETTER________________________*/
    public String getNameEquipment() {
        return nameEquipment;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public int getPointOfLife() {
        return pointOfLife;
    }
}

