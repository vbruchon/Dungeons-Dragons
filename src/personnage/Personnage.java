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
    public int setLifePoint(int pointOfLife) { this.lifePoint = pointOfLife; return pointOfLife; }
    public int setAttackForce(int attackForce) { this.attackForce = attackForce; return attackForce; }
    /*________________________________________________________________________________________________________________*/

    /*__________________________________________________Methodes______________________________________________________*/

    /**
     * @method drinkPotion = Method for assigning potion's point of life at player's point life
     * @param potion = A String with name of potion
     */
    public  void drinkPotion(String potion){
        lifePoint = this.getLifePoint();


        if (potion.equals("LittlePotion")){
            LifePotion lp = new LifePotion();

            this.lifePointPotion = lp.pointOfLife();
            this.result = this.lifePoint + this.lifePointPotion;

            this.newLife = this.setLifePoint(result);
            System.out.println("Vous buvez une petite potion de vie. Maintenant votre personnage possède " + newLife + " point de vie.");

        } else if (potion.equals("BigPotion")){
            BigLifePotion blp = new BigLifePotion();

            this.lifePointPotion = blp.pointOfLife();
            this.result = this.lifePoint + this.lifePointPotion;

            this.newLife = this.setLifePoint(result);
            System.out.println("Vous buvez une grande potion de vie. Maintenant votre personnage possède " + newLife + " point de vie.");
        }
    }

    /**
     * @method combattre = Method for control a fight between User & Ennemy
     * @param user = Personnage create by user
     * @param ennemy = The monster to assigned at MonsterCaser with Instance of class Ennemy
     */
    public void combattre(Personnage user, Personnage ennemy){
        this.lifePoint = user.getLifePoint();
        this.lifePointEnnemy = ennemy.getLifePoint();
        this.attackForce = user.getAttackForce();
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
    /*_______________________________________________Abstract_Methodes________________________________________________*/

    /**
     * @method equipSpell = Method for equip spell at personnage
     * @param spell = Name of spell assigned to the surpriseCase with instance of spell
     */
    public abstract void equipSpell(String spell);

    /**
     * @method equipArm = Method for equip arm at personnage
     * @param arm = Name of arm assigned to the surpriseCase with instance of arms
     */
    public abstract void equipArm(String arm);
}





    /*
    private void boirePetitePotion(){
        LifePotion potion = new LifePotion();

        this.lifePoint = potion.getPointOfLife();
        this.lifePointPerso = this.getLifePoint();
        this.result = lifePointPerso + lifePoint;

        this.newLife = this.setLifePoint(result);
        System.out.println("Maintenant j'ai " + this.newLife + " point de vie");
    }

    private void boireGrandePotion(){
        BigLifePotion potion = new BigLifePotion();

        this.lifePoint = potion.getPointOfLife();
        this.lifePointPerso = this.getLifePoint();
        this.result = lifePointPerso + lifePoint;

        this.newLife = this.setLifePoint(result);
        System.out.println("Maintenant j'ai " + this.newLife + " point de vie");
    }
*/
