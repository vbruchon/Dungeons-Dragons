package Partie.Plateau.Case;

import java.util.Scanner;

public class Case {
    private String content;
    private Scanner scanner;


    /*__________________________________________________Constructeur__________________________________________________*/
    public Case() {
        content = null;
    }

    /*_________________________________________________Getter_Setter__________________________________________________*/

    /*---------Content----------*/
    public String getContent() {
        return content;
    }

    public String setContent(String content) {
        this.content = content;
        return content;
    }

    /*______________________________________________________METHODES____________________________________________*/
    /*_________Contenu_de_la_Case________*/
    public String caseContent() {
        int j = (int) (Math.random() * 4);

        if (j == 0) {
            return setContent("empty");
        } else if (j == 1) {
            return setContent("surprise");
        } else {
            return setContent("ennemy");
        }
    }

    /*________Case_Surprise________*/
    public void surpriseCase() {
        String quit = "Q";
        String recup = "R";
        scanner = new Scanner(System.in);


        System.out.println("Pour récupérer la surprise écrivez " + recup);
        System.out.println("Pour quitter écriver " + quit);

        String userInput = scanner.nextLine();

        //while (!userInput.equals(quit) || !userInput.equals(recup)) {
            if (recup.equals((userInput))) {
                System.out.println("Vous avez bien réucpérer la surprise");
            } else if (quit.equals(userInput)) {
                System.out.println("A bientôt !");
                System.exit(5);
            } else {
                System.out.println("Êtes vous sure d'avoir saisie correctement " + recup + " ou " + quit + " ? ");
            }
        //}
    }

    /*________Case_Ennemy________*/
    public void ennemyCase() {
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

    public void emptyCase(){
        System.out.println("La case est vide veuillez lancer le dé");
    }
}