package Personnage;
import java.util.Scanner;
public class Guerrier extends Personnage {
    String arme;
    String bouclier;

    public Guerrier() {
        Scanner saisieUser = new Scanner(System.in);
        System.out.print("Veuillez saisir un nom pour votre personnage");

        this.name = saisieUser.nextLine();
        this.pointOfLife = 5 ;
        this.attackForce = 5 ;

        arme = "Epée !!!!";
        bouclier = "Bouclier!";

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + arme);
        System.out.println("bouclier : " + bouclier);
    }

    public void GuerrierWithName(String nameParams) {

        this.name = nameParams;
        this.pointOfLife = 5 ;
        this.attackForce = 5 ;
        arme = "Epée !!!!";
        bouclier = "Bouclier!";

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + arme);
        System.out.println("bouclier : " + bouclier);
    }

    public void GuerrierWithAllParams(String nameParams, String img, int pointOfLifeParams, int attackForceParams) {

        this.name = nameParams;
        this.pointOfLife = pointOfLifeParams;
        this.attackForce = attackForceParams;
        arme = "Epée !!!!";
        bouclier = "Bouclier!";

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + arme);
        System.out.println("bouclier : " + bouclier);
    }

    public static void main(String[] args) {
        Guerrier myGuerrier = new Guerrier();
        System.out.println(myGuerrier);
    }
}