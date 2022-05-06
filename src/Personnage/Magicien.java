package Personnage;
public class Magicien extends Personnage{
    String sort;
    String filtre;

    public Magicien() {this("TOOT");}

    public Magicien(String name) {
        this(name, "", 3, 8);
    }

    public Magicien(String name, String img, int lifePoint, int attackForce) {
        setName(name);
        setLifePoint(lifePoint);
        setAttackForce(attackForce);
        sort = "Abracadabra";
        filtre = "Filtre de Guérison";
    }

    public String toString() {
        return "Votre personnage est un " + this.getClass().getSimpleName() + ", vous l'aves nommé " + this.getName() +
                ", il possède " + this.getLifePoint() + " point de vie, " +
                " il a une puissance d'attaque de " + this.getAttackForce() +
                " son sort d'attaque est " + this.sort + " et son filtre de défense est " + this.filtre;
    }
}