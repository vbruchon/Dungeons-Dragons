package personnage.user;

import equipment.arms.Sledgehammer;
import equipment.arms.Sword;
import personnage.Personnage;

/**
 * @Class Class Warriors extends Personnage for instance a new warriors
 */
public class Guerrier extends Personnage {
    /**
     *  @arme = Attributes who contains a String with the name of arm
     *  @bouclier = Attributes who contains a String with the name of bouclier
     *  @result = sum of point of life potion and point of life player's or sum of point attack arms and point attack user
     *  @newForce = new point of attack of personnage after equip arm
     *  @lifePointPotion =  point of life of potion can give to player
     */
    String arme;
    String bouclier;

    /**
     * @Guerrier = First constructor if a programm don't have a name of a personnage. Assigned a name by default
     */
    public Guerrier() {
        this("Toto");
    }

    /**
     * @Guerrier = Second constructor if programm say name of personnage
     * @param name = Personnage's name create by user
     */
    public Guerrier(String name) {
        this(name, "", 5, 5);
    }

    /**
     * @Guerrier = Third Constructeur with all params
     * @param name = Personnage's name create by user
     * @param img = Img of instance {optionnal}
     * @param lifePoint = Charactere's life Point
     * @param attackForce = Charactere's Attack point
     * @arm = empty by default
     * @bouclier = emtpy by default
     */
    public Guerrier(String name, String img, int lifePoint, int attackForce) {
        setName(name);
        setLifePoint(lifePoint);
        setAttackForce(attackForce);
        setLifeMax(10);
        setAttackMax(10);
        arme = "";
        bouclier = "";
        System.out.println("""
                      _,.
                    ,` -.)
                   ( _/-\\\\-._
                  /,|`--._,-^|             ,
                  \\_| |`-._/||          ,'|
                    |  `-, / |          /  /
                    |     || |         /  /
                     `r-._||/   __    /  /
                 __,-<_     )`-/  ` ./  /
                '  \\   `---'   \\  /  /
                    |           |. /  /
                    /           / /  /
                \\_/' \\        |/  /
                 |    |   _,^-' /  /
                 |    , ``  (\\/  /_
                  \\,.->._    \\X-=/^
                  (  /   `-._//^`
                   `Y-.____(__}
                    |     {__)
                          ()
                """);
        String toString = toString();
        System.out.println(toString);
    }
    /*________________________________________________Methodes__________________________________________________*/
    /**
     *  @method combattre = Method for figth with a ennemy when the user is in MonsterCase
     * @param ennemy = The monster to assigned at MonsterCaser with Instance of class Ennemy
     */
    public void combattre( Personnage ennemy) {
        super.combattre(ennemy);
    }


    /*____________________________________________________________________________________________________________________*/

    /**
     * @method toString = Methods who resume the name class, and all attributes assigned by a personnage after the creation
     * @return String who resume all of personnage
     */
    public String toString() {
        return "Nom : " + getName()+ ", Class : "+ getClass().getSimpleName() + ", Point de Vie : " + getLifePoint() + ", Puissance d'Attaque " + getAttackForce();
    }

}

        /*"Votre personnage est un " + this.getClass().getSimpleName() + ", vous l'aves nommé " + this.getName() +
        ", il possède " + this.getLifePoint() + " point de vie, " +
        " il a une puissance d'attaque de " + this.getAttackForce() +
        " son sort d'attaque est " + this.arme + " et son filtre de défense est " + this.bouclier;


        return "Votre personnage est un " + this.getClass().getSimpleName() + ", vous l'aves nommé " + this.getName() +
                ", il possède " + this.getLifePoint() + " point de vie, " +
                " il a une puissance d'attaque de " + this.getAttackForce() +
                ", Actuellement vous n'avez pas d'equipement, ni de bouclier. ";*/