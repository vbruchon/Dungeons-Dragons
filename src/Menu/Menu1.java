package Menu;

import java.util.Scanner;

import Personnage.Guerrier;
import Personnage.Magicien;
import Personnage.Personnage;
import Plateau_Dé.*;

public class Menu1 {
    private Scanner scanner;
    private Plateau plateau;
    private Des de;
    private Personnage personnage;

    public Menu1() {
        scanner = new Scanner(System.in);
        plateau = new Plateau();
        de = new Des();
    }

    public void jouer() {
        // tant que partie pas finie
        // lancer dé
        // avancer personnage
        // évaluer la case sur laquelle le personne arrive (combat, armes, potions, etc.)
    }
    public static void main(String[] args) {
        Menu1 m = new Menu1();
        m.createOrQuitDialogMenu();
        m.verifyInput();
        m.beginOrQuit();
        m.jouer();
    }

    public void createOrQuitDialogMenu(){
        System.out.println("Bienvenue sur le jeux !! ");
        System.out.println("Pour créer un personnage merci d'écrire \"Créer\" dans la console.");
        System.out.println("Sinon veuillez écrire dans la console \"Quitter\"");
    }

    public String userInput(){
        String userInput = scanner.nextLine();

        return userInput;
    }

    public void verifyInput() {
        String create = "C";
        String quit = "Q";

        String userInput = userInput();

        if (create.equals(userInput)) {
            System.out.println("Nous allons créer un personnage");
            //CreatePersonnage.createYourPersonnage();

            System.out.print("Veuillez saisir un nom pour votre personnage");
            String name = scanner.nextLine();

            System.out.println("Quelle type de personnage voulez-vous?");
            System.out.println("Personnage disponible : \"Magicien\" ou \"Guerrier\", Merci de saisir l'un des deux");

            String magician = "M";
            String warrior = "G";

            String userChoice = scanner.nextLine();
            if (magician.equals(userChoice)) {
                personnage = new Magicien(name);
            } else if (warrior.equals(userChoice)) {
                personnage = new Guerrier(name);
            } else {
                System.out.println("Êtes vous sure d'avoir saisie correctement \"Magicien\" ou \"Guerrier\" ? ");
            }
            System.out.println("Votre personnage sera un " + personnage);
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement \"Créer\" ou \"Quitter\" ? ");
        }
    }

    public void beginOrQuit(){
        String begin = "go";
        String quit = "Q";

        System.out.println("Voulez-vous \"Commencer\" la partie ou \"Quitter\" ?");

        String userInput = userInput();

        if (begin.equals(userInput)) {
            System.out.println("Nous allons commencer une partie !");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement \"Commencer\" ou \"Quitter\" ? ");
        }
    }


}
