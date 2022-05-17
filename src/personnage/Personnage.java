package personnage;
import equipment.potion.BigLifePotion;
import equipment.potion.LifePotion;

/**
 * @Class Class abstract that contains all common attributes of all personnage
 */
public abstract class Personnage {
    private String name;
    private int lifePoint;
    private int attackForce;



    /*_________________________________________________Getter_Setter__________________________________________________*/

    /*---------name----------*/
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    /*---------pointOfLife----------*/
    public int getLifePoint() { return lifePoint; }
    public int setLifePoint(int pointOfLife) { this.lifePoint = pointOfLife;
        return pointOfLife;
    }

    /*---------attackForce----------*/
    public int getAttackForce() { return attackForce; }
    public int setAttackForce(int attackForce) { this.attackForce = attackForce;
        return attackForce;
    }
    /*________________________________________________________________________________________________________________*/

    /*__________________________________________________Methodes______________________________________________________*/
    public  void drinkPotion(String potion){
        int lifePointPersonnage = this.getLifePoint();
        int lifePoint;
        int result;
        int newLife;

        if (potion.equals("LittlePotion")){
            LifePotion lp = new LifePotion();

            lifePoint = lp.pointOfLife();
            result = lifePointPersonnage + lifePoint;

            newLife = this.setLifePoint(result);
            System.out.println("Vous buvez une petite potion de vie. Maintenant votre personnage possède " + newLife + " point de vie.");

        } else if (potion.equals("BigPotion")){
            BigLifePotion blp = new BigLifePotion();

            lifePoint = blp.pointOfLife();
            result = lifePointPersonnage + lifePoint;

            newLife = this.setLifePoint(result);
            System.out.println("Vous buvez une grande potion de vie. Maintenant votre personnage possède " + newLife + " point de vie.");
        }
    }

    public void combattre(Personnage user, Personnage ennemy){
        int lifePointUser = user.getLifePoint();
        int lifePointEnnemy = ennemy.getLifePoint();
        int  attackPointUser = user.getAttackForce();
        int attackForceEnnemy = ennemy.getAttackForce();

        while ((lifePointEnnemy > 0) && (lifePointUser > 0)){

            System.out.println("vous tapez l'ennemie avec " + attackPointUser + " point d'attaque");
            lifePointEnnemy = lifePointEnnemy - attackPointUser;
            System.out.println("L'ennemie a maintenant " + lifePointEnnemy + " point de vie");
            if (lifePointEnnemy <= 0 ){
                System.out.println("Félicitations ! Vous avez tuer le monstre ! ");
            } else {
                System.out.println("l'ennemie vous tape avec " + attackForceEnnemy + " point d'attaque");
                lifePointUser = lifePointUser - attackForceEnnemy;
                System.out.println("Vous avez maintenant " + lifePointUser + " point de vie");
                if ( lifePointUser <= 0 ){
                    System.out.println("Le monstre vous a tué.");
                    System.out.println("Game Over ! Le jeux s'arrete");
                    System.exit(5);
                }
            }
        }

    }
    /*_______________________________________________Abstract_Methodes________________________________________________*/
    public abstract void equipSpell(String spell);
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
