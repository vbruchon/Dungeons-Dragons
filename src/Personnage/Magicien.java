package Personnage;
import java.util.Scanner;

public class Magicien {
    String name;
    int pointOfLife;
    int attackForce;
    String sort;
    String filtre;

    public Magicien() {
        Scanner saisieUser = new Scanner(System.in);
        System.out.print("Veuillez saisir un nom pour votre personnage");

        name = saisieUser.nextLine();
        pointOfLife = 3;
        attackForce = 8;
        sort = "Abracadabra";
        filtre = "Filtre de Guérison";

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + sort);
        System.out.println("bouclier : " + filtre);
    }

    public void MagicianWithName(String nameParams) {

        name = nameParams;
        pointOfLife = 5;
        attackForce = 8;
        sort = "Abracadabra";
        filtre = "Filtre de Guérison";

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + sort);
        System.out.println("bouclier : " + filtre);
    }

    public void MagicianWithAllParams(String nameParams, String img, int pointOfLifeParams, int attackForceParams) {

        name = nameParams;
        pointOfLife = pointOfLifeParams ;
        attackForce = attackForceParams ;
        sort = "Abracadabra" ;
        filtre = "Filtre de Guérison" ;

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + sort);
        System.out.println("bouclier : " + filtre);
    }

    public static void main(String[] args) {
        Magicien myMagicien = new Magicien();
        System.out.println(myMagicien);
    }
}

