package equipment.arms;

import equipment.Equipment;

public class Sledgehammer implements Equipment {
    String nameEquipment;
    int attackForce;

    public Sledgehammer(){
        nameEquipment();
        attackForce();
    }

    @Override
    public String nameEquipment() {
        nameEquipment = "Massue" ;

        return nameEquipment;
    }

    @Override
    public int pointOfLife() {
        return 0;
    }

    @Override
    public int attackForce() {
        attackForce = 3 ;

        return attackForce;
    }
}
/*package equipment.arms;

import equipment.Equipment;

public class Sledgehammer extends Equipment {
    public Sledgehammer(){
        setNameEquipment("Massue");
        setAttackForce(3);
    }
}*/
