import Personnage.CreatePersonnage;

import java.util.Scanner;
//import Personnage.Guerrier;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Bienvenue sur le jeux !! ");
        System.out.println("Pour créer un personnage merci d'écrire \"Créer\" dans la console.");
        System.out.println("Sinon veuillez écrire dans la console \"Quitter\"");

        String create = "Créer";
        String quit = "Quitter";

        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();

        if (create.equals(input)) {
            System.out.println("Nous allons créer un personnage");
            CreatePersonnage.createYourPersonnage();
        } else if (quit.equals(input)) {
            System.out.println("A bientôt !");
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement \"Créer\" ou \"Quitter\" ? ");
        }
    }


}
