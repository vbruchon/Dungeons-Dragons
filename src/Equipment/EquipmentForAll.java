package Equipment;

public class EquipmentForAll extends Equipment{

    public void PotionVie(){
        this.nameEquipment = "Potion de vie" ;
        this.pointOfLife = 2 ;
        System.out.println("Le joueur utilise " + nameEquipment + " et gagne " + pointOfLife + " point de vie");
    }
    public void GrandePotionVie(){
        this.nameEquipment = "Grande potion de vie" ;
        this.pointOfLife = 5 ;
        System.out.println("Le joueur utilise " + nameEquipment + " et gagne " + pointOfLife + " point de vie");
    }

    public static void main(String[] args) {
    }
}
