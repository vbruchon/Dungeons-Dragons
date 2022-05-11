package Partie.Plateau.Case;

import java.util.Scanner;


public class MonsterCase extends Case {
    Scanner scanner;
    public MonsterCase(){
        setContent("ennemy");
    }
    public void action() {
        System.out.println("Vous avec un ennemie battez le et lancer les dés");

        this.setContent("ennemy");
        String quit = "Q";
        String kill = "T";
         scanner = new Scanner(System.in);

        System.out.println("Pour tuer l'ennemie écrivez " + kill + ", pour quitter écriver " + quit + " dans la console");

        String userInput= scanner.nextLine();

        //while (!userInput.equals(quit) || !userInput.equals(kill)) {

        if (kill.equals((userInput))) {
            System.out.println("Vous avez tuer l'ennemie !! Veuillez lancer les dés");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + kill + " ou " + quit + " ? ");
            System.out.println("Merci de resaisir " + kill + " Pour tuer l'ennemie, " + quit + " pour quitter");
        }
        //}
    }
}
