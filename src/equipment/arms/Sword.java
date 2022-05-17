package equipment.arms;

import equipment.Equipment;

public class Sword implements Equipment {
    String nameEquipment;
    int attackForce;

    public Sword (){
        nameEquipment();
        attackForce();
    }

    @Override
    public String nameEquipment() {
        nameEquipment = "Epée" ;

        return nameEquipment;
    }

    @Override
    public int pointOfLife() {
        return 0;
    }

    @Override
    public int attackForce() {
        attackForce = 5 ;

        return attackForce;
    }
}

/*package equipment.arms;

import equipment.Equipment;

public class Sword extends Equipment {
    public Sword (){
        setNameEquipment("Epée");
        setAttackForce(5);
    }
}*/
