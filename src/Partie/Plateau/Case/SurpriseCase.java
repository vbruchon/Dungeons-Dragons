package Partie.Plateau.Case;

import java.util.Scanner;

public class SurpriseCase extends Case{
Scanner scanner ;
    public SurpriseCase(){
        setContent("surprise");
    }
    public void action() {
        System.out.println("La case contient une surprise. Récupérer là, puis Lancer les dés");

        String quit = "Q";
        String recup = "R";
        scanner = new Scanner(System.in);


        System.out.println("Pour récupérer la surprise écrivez " + recup);
        System.out.println("Pour quitter écriver " + quit);

        String userInput = scanner.nextLine();

        if (recup.equals((userInput))) {
            System.out.println("Vous avez bien réucpérer la surprise");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + recup + " ou " + quit + " ? ");
        }
    }
}
