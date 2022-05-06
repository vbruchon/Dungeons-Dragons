package Personnage;

public class Personnage {
    private String name;
    private int lifePoint;
    private int attackForce;

/*_________________________________________________Getter_Setter_____________________________________________________*/

    /*---------name----------*/
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    /*---------pointOfLife----------*/
    public int getLifePoint() { return lifePoint; }
    public void setLifePoint(int pointOfLife) { this.lifePoint = pointOfLife; }

    /*---------attackForce----------*/
    public int getAttackForce() { return attackForce; }
    public void setAttackForce(int attackForce) { this.attackForce = attackForce; }
}
