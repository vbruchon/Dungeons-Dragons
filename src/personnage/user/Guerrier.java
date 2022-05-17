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
    int forcePoint;
    int m ;
    int result;
    int newForce;

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
        arme = "";
        bouclier = "";

        String toString = toString();
        System.out.println(toString);
    }
    /*________________________________________________Abstract_Methodes__________________________________________________*/

    /**
     * @method equipArm = abstract Method extends to Personnage. Assigned this for aquip arm at personnage
     * @param arm = Name of arm assigned to the surpriseCase with instance of arms
     */
    @Override
    public void equipArm(String arm) {

        if (arm.equals("Sword")) {
            Sword sword = new Sword();

            forcePoint = sword.attackForce();
            System.out.println("La froce de cette arme est de " + forcePoint);
            m = this.getAttackForce();
            result = m + forcePoint;

            newForce = this.setAttackForce(result);
            System.out.println("Vous êtes équipée d'une " + arm + ". Votre force est maintenantt de " + newForce);

        } else if (arm.equals("Bouclier")) {
            Sledgehammer sldg = new Sledgehammer();

            forcePoint = sldg.attackForce();
            System.out.println("La froce de cette arme est de " + forcePoint);
            m = this.getAttackForce();
            result = m + forcePoint;

            newForce = this.setAttackForce(result);
            System.out.println("Vous êtes équipée d'un " + arm + ". Votre force est maintenantt de " + newForce);
        }
    }

    /**
     * @method equipSpell = Method for equip spell at personnage but as It's a warriors he can't use spell so don't equip spell
     * @param spell = Name of spell assigned to the surpriseCase with instance of spell
     */
    @Override
    public void equipSpell(String spell){
        System.out.println("Vous êtes un guerrier vous n'utilisez que des armes! Vous ne pouvais pas vous équiper du sort " + spell);
    }

    /**
     *  @method drinkPotion = Method for assigned potion's point of life at personnage's
     * @param potion = A String with name of potion
     */
    @Override
    public void drinkPotion(String potion) {
        super.drinkPotion(potion);
    }

    /**
     *  @method combattre = Method for figth with a ennemy when the user is in MonsterCase
     * @param personnage = Personnage create by user
     * @param ennemy = The monster to assigned at MonsterCaser with Instance of class Ennemy
     */
    public void combattre(Personnage personnage , Personnage ennemy) {
        super.combattre(personnage, ennemy);
    }

    /*____________________________________________________________________________________________________________________*/

    /**
     * @method toString = Methods who resume the name class, and all attributes assigned by a personnage after the creation
     * @return String who resume all of personnage
     */
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