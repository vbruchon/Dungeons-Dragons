package personnage;
import equipment.potion.BigLifePotion;
import equipment.potion.LifePotion;

/**
 * @Class Class abstract that contains all common attributes and method of all personnage of game.
 */
public abstract class Personnage {
    /**
     * @name = player's name
     * @lifePoint = player's life point
     * @attackForce = player's attack point
     * @result = sum of point of life potion and point of life player's or sum of point attack arms and point attack user
     * @newLife = new point of life of personnage after drink potion
     * @lifePointPotion =  point of life of potion can give to player
     * @lifePointEnnemy ; // @lifePointEnnemy = point of life of monster
     * @attackForceEnnemy = point of attack of monster
     */
    private String name; //
    private int lifePoint; //
    private int attackForce; //

    int result; // @result = sum of point of life potion and point of life player's
    int newLife; // @newLife = new point of life of personnage after drink potion
    int lifePointPotion; // @lifePointPotion =  point of life of potion can give to player
    int lifePointEnnemy ; // @lifePointEnnemy = point of life of monster
    int attackForceEnnemy ; // @attackForceEnnemy = point of attack of monster


    /*_________________________________________________Getter_Setter__________________________________________________*/

    /**
     * @GETTER can display value
     * @SETTER can assigned new value of a attributes
     * @return value if you want
     */
    /*---------GETTER----------*/
    public String getName() { return name; }
    public int getLifePoint() { return lifePoint; }
    public int getAttackForce() { return attackForce; }

    /*---------SETTER----------*/
    public void setName(String name) { this.name = name; }
    public void setLifePoint(int pointOfLife) { this.lifePoint = pointOfLife; }
    public void setAttackForce(int attackForce) { this.attackForce = attackForce; }
    /*________________________________________________________________________________________________________________*/

    /*__________________________________________________Methodes______________________________________________________*/
    /**
     * @method combattre = Method for control a fight between User & Ennemy
     * @param ennemy = The monster to assigned at MonsterCaser with Instance of class Ennemy
     */
    public void combattre(Personnage ennemy){
        this.lifePoint = this.getLifePoint();
        this.lifePointEnnemy = ennemy.getLifePoint();
        this.attackForce = this.getAttackForce();
        this.attackForceEnnemy = ennemy.getAttackForce();

        while ((this.lifePointEnnemy > 0) && (this.lifePoint > 0)){

            System.out.println("vous tapez l'ennemie avec " + this.attackForce + " point d'attaque");
            this.lifePointEnnemy = this.lifePointEnnemy - this.attackForce;
            System.out.println("L'ennemie a maintenant " + this.lifePointEnnemy + " point de vie");

            if (this.lifePointEnnemy <= 0 ){
                System.out.println("Félicitations ! Vous avez tuer le monstre ! ");
            } else {
                System.out.println("l'ennemie vous tape avec " + this.attackForceEnnemy + " point d'attaque");
                this.lifePoint = this.lifePoint - this.attackForceEnnemy;
                System.out.println("Vous avez maintenant " + this.lifePoint + " point de vie");
                if ( lifePoint <= 0 ){
                    System.out.println("Le monstre vous a tué.");
                    System.out.println("Game Over ! Le jeux s'arrete");
                    System.exit(5);
                }
            }
        }

    }
}