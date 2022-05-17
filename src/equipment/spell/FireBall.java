package equipment.spell;

import equipment.Equipment;

public class FireBall implements Equipment {

    String nameEquipment;
    int attackForce;

    public FireBall(){
        nameEquipment();
        attackForce();
    }


    @Override
    public String nameEquipment() {
        nameEquipment = "Eclair" ;

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