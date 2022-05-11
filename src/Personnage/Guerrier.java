package Personnage;
public class Guerrier extends Personnage {
    String arme;
    String bouclier;

    public Guerrier(){ this("Toto");}

    public Guerrier(String name){ this(name, "", 5, 5);}

    public Guerrier(String name, String img, int lifePoint, int attackForce){
        setName(name);
        setLifePoint(lifePoint);
        setAttackForce(attackForce);
        arme = "Epée";
        bouclier = "Bouclier!";

        String toString = toString();
        System.out.println(toString);
    }

    public String toString(){
        return "Votre personnage est un " + this.getClass().getSimpleName() + ", vous l'aves nommé " + this.getName() +
                ", il possède " + this.getLifePoint() + " point de vie, " +
                " il a une puissance d'attaque de " + this.getAttackForce() +
                ", Actuellement vous n'avez pas d'equipement, ni de bouclier. ";
    }
}

        /*"Votre personnage est un " + this.getClass().getSimpleName() + ", vous l'aves nommé " + this.getName() +
        ", il possède " + this.getLifePoint() + " point de vie, " +
        " il a une puissance d'attaque de " + this.getAttackForce() +
        " son sort d'attaque est " + this.arme + " et son filtre de défense est " + this.bouclier;*/