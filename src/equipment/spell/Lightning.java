package equipment.spell;

import equipment.Equipment;

public class Lightning implements Equipment {

    String nameEquipment;
    int attackForce;

    public Lightning() {
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
/*package equipment.spell;

import equipment.Equipment;

public class Lightning extends Equipment {
    public Lightning() {
        setNameEquipment("Eclair");
        setAttackForce(3);
    }
}*/