package equipment.potion;

import equipment.Equipment;

public class BigLifePotion implements Equipment {

    String nameEquipment;
    int pointofLife;

    public BigLifePotion(){
        nameEquipment();
        pointOfLife();
    }


        @Override
        public String nameEquipment () {
            nameEquipment = "Grande potion de Vie";

            return null;
        }

        @Override
        public int pointOfLife () {
            pointofLife = 5;

            return pointofLife;
        }

        @Override
        public int attackForce () {

            return 0;
        }

}
/*package equipment.potion;

import equipment.Equipment;

public class BigLifePotion extends Equipment {

    public BigLifePotion(){
        setNameEquipment("Grande potion de vie");
        setPointOfLife(5);
    }
}*/
