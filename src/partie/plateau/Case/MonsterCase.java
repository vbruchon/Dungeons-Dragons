package partie.plateau.Case;

import personnage.Personnage;

import java.util.Scanner;

public class MonsterCase extends Case {
    /*____Attributs____*/
    Scanner scanner;
    private String quit = "Q";
    private String kill = "T";
    private int dragons ;
    private int wizzards ;
    private int random ;


    /*____Constructeur____*/
    public MonsterCase(){
        setContent("ennemy");
    }

    /*____Methodes____*/
    public void action(Personnage personnage) {
        System.out.println("Vous avec un ennemie battez le et lancer les dés");

        this.setContent("ennemy");
        whatIsMonster();

         scanner = new Scanner(System.in);
//Ajouter logique combat a la place de kill
        System.out.println("Pour tuer l'ennemie écrivez " + this.kill + ", pour quitter écriver " + this.quit + " dans la console");

        String userInput= scanner.nextLine();

        if (kill.equals((userInput))) {
            System.out.println("Vous avez tuer l'ennemie !! Veuillez lancer les dés");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + this.kill + " ou " + this.quit + " ? ");
            System.out.println("Merci de resaisir " + this.kill + " Pour tuer l'ennemie, " + this.quit + " pour quitter");
        }
    }
    public void whatIsMonster(){
        random = (int) (Math.random()* (3 - 1 + 1) + 1);
        this.dragons = 1;
        this.wizzards = 2;

        if (this.dragons == random){
            System.out.println("Vous vous retrouvez face à un Dragon");
        } else if (this.wizzards == random) {
            System.out.println("Vous vous retrouvez face à un Sorcier");
        } else {
            System.out.println("Vous vous retrouvez face à un Gobelin");
        }
    }
}
