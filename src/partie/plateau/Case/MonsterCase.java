package partie.plateau.Case;

import personnage.Personnage;
import personnage.ennemy.Dragons;
import personnage.ennemy.Gobelins;
import personnage.ennemy.Wizzards;
import partie.menu.Menu;
import java.util.Scanner;

public class MonsterCase extends Case {
    /*____Attributs____*/
    Scanner scanner;
    Menu m = new Menu();
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

        String userInput = m.ennemyCase();

        this.setContent("ennemy");
        Personnage ennemy = whatIsMonster(personnage);

        if (kill.equals((userInput))) {
            personnage.combattre(personnage, ennemy);
            videCase();
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            m.verifEnnemyCase(userInput);
        }
    }
    public Personnage whatIsMonster(Personnage personnage){
        random = (int) (Math.random()* (3 - 1 + 1) + 1);
        this.dragons = 1;
        this.wizzards = 2;
        Personnage ennemy;

        if (this.dragons == random){
            System.out.println("Vous vous retrouvez face à un Dragon");
            ennemy= new Dragons();

        } else if (this.wizzards == random) {
            System.out.println("Vous vous retrouvez face à un Sorcier");
            ennemy = new Wizzards();
        } else {
            System.out.println("Vous vous retrouvez face à un Gobelin");
            ennemy = new Gobelins();
        }
        return ennemy;
    }
}
