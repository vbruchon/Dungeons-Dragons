package Plateau_Dé;

import Menu.Menu1;

public class Plateau {
    private Case box[] = new Case[64];

    public Plateau() {

        int i = 0 ;
        int resultDé ;
        int position = 1 ;

        System.out.println("Le joueur se trouve à la case N° " + position);

        while (i < box.length) {

            /*if (i == 0) {
                System.out.println("La case " + position + " est vide. Lancer les dés");
                resultDé = Dés.lancerDé();
                position = position + resultDé;
                box[i] = new Case();
                //System.out.println("Le joueur se trouve à la case N° " + position);
            } else {*/

                if (box[i] == null) {
                    box[i] = new Case();
                    box[i].content = caseContent();
                }

                if (box[i].content.equals("empty")) {
                    System.out.println("La case " + position + " est vide. Lancer les dés");
                    resultDé = Des.lancerDe();
                    position = position + resultDé;
                    //System.out.println("Le joueur se trouve à la case N° " + position);
                }

                if (box[i].content == "surprise") {
                    System.out.println("La case " + position + " Contient une surprise. Récupérer là puis Lancer les dés");
                    surpriseCase();
                    resultDé = Des.lancerDe();
                    position = position + resultDé;
                    //System.out.println("Le joueur se trouve à la case N° " + position);
                }

                if (box[i].content == "ennemy") {
                    System.out.println("Vous avec un ennemie battez le et lancer les dés");
                    ennemyCase();
                    resultDé = Des.lancerDe();
                    position = position + resultDé;
                    //System.out.println("Le joueur se trouve à la case N° " + position);
                }
            }
            System.out.println("Le joueur se trouve à la case N° " + position);
            i = position ;
        }


    /*____________________________________________________METHODES____________________________________________________*/

    /*_________Contenu_de_la_Case________*/
    public String caseContent() {
        int j = (int) (Math.random() * 4);

        if (j == 0) {

            return Case.content = "empty";

        } else if (j == 1) {

            return Case.content = "surprise";

        } else if (j == 2) {

            return Case.content = "ennemy";

        } else {
            return null;
        }
    }

    /*________Case_Surprise________*/
    public void surpriseCase() {
        System.out.println("Pour récupérer la surprise écrivez \"Récupérer\"," +
                "pour quitter écriver \"Quitter\" dans la console");
        String quit = "Q";
        String recup = "R";
        String userInput = Menu1.userInput();

        if (recup.equals((userInput))) {

            System.out.println("Vous avez bien réucpérer la surprise");

        } else if (quit.equals(userInput)) {

            System.out.println("A bientôt !");

        } else {

            System.out.println("Êtes vous sure d'avoir saisie correctement " + recup + " ou " + quit + " ? ");
        }
    }

    /*________Case_Ennemy________*/
    public void ennemyCase() {
        System.out.println("Pour tuer l'ennemie écrivez \"T\", pour quitter écriver \"Quitter\" dans la console");

        String quit = "Q";
        String kill = "T";

        String userInput = Menu1.userInput();

        while (!userInput.equals(quit) || !userInput.equals(kill)) {

            if (kill.equals((userInput))) {
                System.out.println("Vous avez tuer l'ennemie !! Veuillez lancer les dés");

            } else if (quit.equals(userInput)) {
                System.out.println("A bientôt !");

            } else {
                System.out.println("Êtes vous sure d'avoir saisie correctement " + kill + " ou " + quit + " ? ");
                System.out.println("Merci de resaisir \"T\" Pour tuer l'ennemie, \"Quitter\" pour quitter");
                userInput = Menu1.userInput();
            }
        }
    }
}

