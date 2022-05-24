package partie.plateau.caseBoard;

import partie.plateau.caseBoard.CaseBoard;
import personnage.Personnage;

public class EmptyCase implements CaseBoard {

    public EmptyCase(){}
    public void action(Personnage personnage){System.out.println("La case est vide veuillez lancer le dé");}
}
