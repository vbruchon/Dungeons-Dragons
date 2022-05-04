package Personnage;
import java.util.Scanner;

public class Magicien extends Personnage{
    String sort;
    String filtre;

    public Magicien() {
        Scanner saisieUser = new Scanner(System.in);
        System.out.print("Veuillez saisir un nom pour votre personnage");

        this.name = saisieUser.nextLine();
        this.pointOfLife = 3;
        this.attackForce = 8;
        sort = "Abracadabra";
        filtre = "Filtre de Guérison";

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + sort);
        System.out.println("bouclier : " + filtre);
    }

    public void MagicianWithName(String nameParams) {

        this.name = nameParams;
        this.pointOfLife = 5;
        this.attackForce = 8;
        sort = "Abracadabra";
        filtre = "Filtre de Guérison";

        System.out.println("Le nom du personnage est : " + name);
        System.out.println("Point de vie : " + pointOfLife);
        System.out.println("attackForce : " + attackForce);
        System.out.println("arme : " + sort);
        System.out.println("bouclier : " + filtre);
    }

    public void MagicianWithAllParams(String nameParams, String img, int pointOfLifeParams, int attackForceParams) {

        this.name = nameParams;
        this.pointOfLife = pointOfLifeParams ;
        this.attackForce = attackForceParams ;
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

