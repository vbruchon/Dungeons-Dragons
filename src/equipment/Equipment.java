package equipment;

import equipment.arms.Arms;
import equipment.arms.Sledgehammer;
import equipment.arms.Sword;
import equipment.potion.BigLifePotion;
import equipment.potion.LifePotion;
import equipment.potion.Potions;
import equipment.spell.FireBall;
import equipment.spell.Lightning;
import equipment.spell.Spells;
import partie.plateau.caseBoard.CaseBoard;
import partie.plateau.Plateau;
import personnage.Personnage;
import partie.menu.Menu;
import personnage.user.Guerrier;
import personnage.user.Magicien;

public class Equipment implements CaseBoard {

    /*____Attributs de Class____*/
    private String nameEquipment;
    private int attackForceEquipment;
    private int pointOfLifeEquipment;
    String quit = "Q";
    String recup = "R";
    /*_________________________*/

    /*___Attributes_for_User___*/
    Menu m;
    int pointOfLifeUser;
    int attackForceUser;
    int lifePointUser;
    int lifePointMax;
    int newLifeUser;
    int newPointAttackUser;
    int attackMax;



    /*____Méthodes____*/

    public void action(Personnage personnage) {
        m = new Menu();
        String userInput = this.m.catchSurprise();

        if (recup.equals((userInput))) {
            whatIsSurprise(this);
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


    public void whatIsSurprise(Equipment equipment) {

        System.out.println(nameEquipment);

        if (equipment instanceof LifePotion) {
            System.out.println("""
                       _____
                      `.___,'
                       (___)
                       <   >
                        ) (
                       /`-.\\
                      /     \\
                     / _    _\\
                    :,' `-.' `:
                    |         |
                    :         ;
                     \\       /
                      `.___.'\s""");
        }
        if (equipment instanceof BigLifePotion) {
            System.out.println("""
                     ____
                    |    |
                    |____|
                    |    |
                    (    )
                    )    (
                  .'      `.
                 /          \\
                |------------|
                |JACK DANIELS|
                |    ----    |
                |   (No.7)   |
                |    ----    |
                | Tennessee  |
                |  WHISKEY   |
                |  40% Vol.  |
                |------------|
                |____________|""");
        }
        if (equipment instanceof Sword) {
            System.out.println(
                    """
             /\
            // \
            || |
            || |
            || |
            || |
            || |
            || |
         __ || | __
        /___||_|___\\
             ww
             MM
            _MM_
           (&<>&)
            ~~~~""");
        }
        if (equipment instanceof Sledgehammer) {
            System.out.println("""
                        |\\
                        | \\        /|
                        |  \\____  / |
                       /|__/AMMA\\/  |
                     /AMMMMMMMMMMM\\_|
                 ___/AMMMMMMMMMMMMMMA
                 \\   |MVKMMM/ .\\MMMMM\\
                  \\__/MMMMMM\\  /MMMMMM---
                  |MMMMMMMMMMMMMMMMMM|  /
                  |MMMM/. \\MM.--MMMMMM\\/
                  /\\MMM\\  /MM\\  |MMMMMM   ___
                 /  |MMMMMMMMM\\ |MMMMMM--/   \\-.
                /___/MMMMMMMMMM\\|M.--M/___/_|   \\
                     \\VMM/\\MMMMMMM\\  |      /\\ \\/
                      \\V/  \\MMMMMMM\\ |     /_  /
                        |  /MMMV'   \\|    |/ _/
                        | /              _/  /
                        |/              /| \\'
                VK                     /_  /
                                       /  /
                """);
        }
        if (equipment instanceof FireBall) {
            System.out.println("""
                   \s
                                  /                \s
                              (                    \s
                              (                    \s
                             ,     ,,              \s
                                    (.             \s
                                    /,             \s
                                (.   ,             \s
                              (  (.                \s
                               ,  (/,              \s
                                  ((/(  ,          \s
                                  ((((  (          \s
                                 ((((* ,(          \s
                                  (#(, (/          \s
                              (* ((##,((,          \s
                               (((###((#           \s
                               (((###(##           \s
                               (####%###,   (      \s
                                .((###%#(   (      \s
                                (((#&&&%(  (#,     \s
                              **/(##%&&&&/ #(      \s
                            ((*/###&&&&&%((%(      \s
                             ,(#%&&&&&&&&&&&#((    \s
                            ((#&&&&&&&&&&&%#((     \s
                            *(##&&&&&&&&&%#((*     \s
                              ((###%&&%##(((       \s
                               *(((((((((*         \s
                               
                    """);
        }
        if (equipment instanceof Lightning) {
            System.out.println("""

                                         d$$$$$P
                                        d$$$$$P
                                       $$$$$$"
                                     .$$$$$$"
                                    .$$$$$$"
                                   4$$$$$$$$$$$$$"
                                  ""\"""\""3$$$$$"
                                        z$$$$P
                                      z$$$$P
                                    d$$$$$$$$$$"
                                    *******$$$"
                                         .$$$"
                                        .$$"
                                       4$P"
                                      z$"
                                     zP
                                    z"
                                   /    
                                  ^
                               
                    """);
        }
    }

    public boolean canEquip(Personnage personnage) {
        boolean answer = false;
        pointOfLifeUser = personnage.getLifePoint();
        lifePointMax = personnage.getLifeMax();

        if ((this instanceof Potions) && (pointOfLifeUser < lifePointMax)) {
            answer = true;
        }
        if ((personnage instanceof Guerrier) && (this instanceof Arms)) {
            answer = true;
        } else if ((personnage instanceof Magicien) && (this instanceof Spells)) {
            answer = true;
        }

        return answer;
    }

    public void equip(Personnage personnage) {
        //Equipment
        pointOfLifeEquipment = getPointOfLifeEquipment();
        attackForceEquipment = getAttackForceEquipment();
        //personnage
        lifePointUser = personnage.getLifePoint();
        attackForceUser = personnage.getAttackForce();
        attackMax = personnage.getAttackMax();
        lifePointMax = personnage.getLifeMax();

        if ((attackForceUser + attackForceEquipment) < attackMax) {
            newPointAttackUser = attackForceUser + attackForceEquipment;
            personnage.setAttackForce(newPointAttackUser);
        } else {
            newPointAttackUser = attackMax;
            personnage.setAttackForce(newPointAttackUser);
        }

        if ((lifePointUser + pointOfLifeEquipment < lifePointMax)) {
            newLifeUser = lifePointUser + pointOfLifeEquipment;
            personnage.setLifePoint(newLifeUser);
        } else {
            newLifeUser = lifePointMax;
            personnage.setLifePoint(newLifeUser);
        }
        System.out.println("Vous vous équipez avec " + this.getNameEquipment() + ". Maintenant votre personnage possède " + newLifeUser + " point de vie, et " + newPointAttackUser + " point d'attaque");
    }

    /*__________________________GETTER_SETTER________________________*/

    public String getNameEquipment() {
        return nameEquipment;
    }

    public void setNameEquipment(String nameEquipment) {
        this.nameEquipment = nameEquipment;
    }

    public int getAttackForceEquipment() {
        return attackForceEquipment;
    }

    public void setAttackForceEquipment(int attackForceEquipment) {
        this.attackForceEquipment = attackForceEquipment;
    }

    public int getPointOfLifeEquipment() {
        return pointOfLifeEquipment;
    }

    public void setPointOfLifeEquipment(int pointOfLifeEquipment) {
        this.pointOfLifeEquipment = pointOfLifeEquipment;
    }
}
