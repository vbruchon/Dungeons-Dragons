package Plateau_Dé;

import Menu.Menu1;

public class Des {
    public int lancerDe() {
        System.out.println("Pour lancer les dés écriver \"Lancer\" dans la console");
        System.out.println("Pour quitter écriver \"Quitter\"");

        String quit = "Q";
        String lance = "L";
        String userInput = Menu1.userInput();

        int de = 0;

        if (lance.equals((userInput))) {
           de = (int) (Math.random() * (6 - 1 + 1) + 1);
            System.out.println("Le joueur avance de " + de + " case");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(105);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement \"Lancer\" ou \"Quitter\" ? ");
        }

        return de;
    }
}
