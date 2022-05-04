package Personnage;
import java.util.Scanner;
public class Guerrier {
    String name;
    int pointOfLife;
    int attackForce;
    String arme;
    String bouclier;

    public Guerrier() {
        Scanner saisieUser = new Scanner(System.in);
        System.out.print("Veuillez saisir un nom pour votre personnage");

        name = saisieUser.nextLine();
        pointOfLife = 3;
        attackForce = 8;
        arme = "Baaaaaaannzzaaaaaaaiiii !!!!";
        bouclier = "Bouclieeeeerrr!";

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + arme);
        System.out.println("bouclier : " + bouclier);
    }

    public void GuerrierWithName(String nameParams) {

        name = nameParams;
        pointOfLife = 3;
        attackForce = 8;
        arme = "Baaaaaaannzzaaaaaaaiiii !!!!";
        bouclier = "Bouclieeeeerrr!";

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + arme);
        System.out.println("bouclier : " + bouclier);
    }

    public void GuerrierWithAllParams(String nameParams, String img, int pointOfLifeParams, int attackForceParams) {

        name = nameParams;
        pointOfLife = pointOfLifeParams;
        attackForce = attackForceParams;
        arme = "Baaaaaaannzzaaaaaaaiiii !!!!";
        bouclier = "Bouclieeeeerrr!";

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