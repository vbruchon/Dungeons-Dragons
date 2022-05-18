package personnage.ennemy;

import partie.menu.Menu;
import partie.plateau.CaseBoard;
import personnage.Personnage;
import personnage.ennemy.*;
import personnage.user.*;

public class Ennemy extends Personnage implements CaseBoard {
    Menu m;
    private String quit;
    private String kill;

    public Ennemy(){
        quit = "Q";
        kill = "T";
        m = new Menu();

    }

    /*____Methodes____*/
    @Override
    public void action(Personnage personnage) {
        String userInput = m.ennemyCase();

        if (kill.equals((userInput))) {
            personnage.combattre(this);
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            m.verifEnnemyCase(userInput);
        }
    }

}
