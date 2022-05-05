package Personnage;
import java.util.Scanner;

public class CreatePersonnage {
    public static void createYourPersonnage() {
        System.out.println("Quelle type de personnage voulez-vous?");
        System.out.println("Personnage disponible : \"Magicien\" ou \"Guerrier\", Merci de saisir l'un des deux");

        String magician = "Magicien";
        String warrior = "Guerrier";

        Scanner choiceUserRace = new Scanner(System.in);
        String userChoice = choiceUserRace.nextLine();
        if (magician.equals(userChoice)) {
            System.out.println("Votre personnage sera un " + magician);
            Magicien joueurMagician = new Magicien();
        } else if (warrior.equals(userChoice)) {
            System.out.println("Votre personnage sera un " + warrior);
            Guerrier joueurGuerrier = new Guerrier();
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement \"Magicien\" ou \"Guerrier\" ? ");
        }
    }
}
