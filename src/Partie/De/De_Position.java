package Partie.De;

import java.util.Scanner;

public class De_Position {
    private int de = 0;
    private String quit = "Q";
    private String lance = "L";

    public int lancerDe() {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Pour lancer les dés écriver " + this.lance + " dans la console");
        System.out.println("Pour quitter écriver " + this.quit);

        String userInput = scanner.nextLine();

        if (lance.equals((userInput))) {
            this.de = (int) (Math.random() * (6 - 1 + 1) + 1);
            System.out.println("Le joueur avance de " + this.de + " case");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + this.lance + " ou " + this.quit + " ? ");
        }
        return this.de;
    }
}

