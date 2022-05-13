package personnage;

import equipment.potion.BigLifePotion;
import equipment.potion.LifePotion;

public abstract class Personnage {
    private String name;
    private int lifePoint;
    private int attackForce;
    private int lifePointPerso;
    private int result;
    private int newLife;

    private int newForce;
    private int forceActuelle;



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

            lifePoint = lp.getPointOfLife();
            result = lifePointPersonnage + lifePoint;

            newLife = this.setLifePoint(result);
            System.out.println("Vous buvez une petite potion de vie. Maintenant votre personnage possède " + newLife + " point de vie.");

        } else if (potion.equals("BigPotion")){
            BigLifePotion blp = new BigLifePotion();

            lifePoint = blp.getPointOfLife();
            result = lifePointPersonnage + lifePoint;

            newLife = this.setLifePoint(result);
            System.out.println("Vous buvez une grande potion de vie. Maintenant votre personnage possède " + newLife + " point de vie.");
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
