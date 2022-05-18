package partie.plateau.Case;

import partie.plateau.CaseBoard;
import personnage.Personnage;

public class EmptyCase implements CaseBoard {

    public EmptyCase(){}
    public void action(Personnage personnage){System.out.println("La case est vide veuillez lancer le dé");}
}
