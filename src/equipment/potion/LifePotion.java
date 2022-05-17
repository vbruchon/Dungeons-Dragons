package equipment.potion;

import equipment.Equipment;

public class LifePotion implements Equipment {
    String nameEquipment;
    int pointOfLife;

    public LifePotion(){
        nameEquipment();
        pointOfLife();
    }

    @Override
    public String nameEquipment() {
        nameEquipment = "Potion de Vie" ;

        return nameEquipment;
    }

    @Override
    public int pointOfLife() {
        pointOfLife = 2 ;

        return pointOfLife;
    }

    @Override
    public int attackForce() {
        return 0;
    }
}
/*package equipment.potion;

import equipment.Equipment;

public class LifePotion extends Equipment {
    public LifePotion(){
        setNameEquipment("Potion de Vie");
        setPointOfLife(2);
    }
}*/
