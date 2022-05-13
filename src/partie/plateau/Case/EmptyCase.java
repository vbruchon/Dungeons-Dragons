package partie.plateau.Case;

import personnage.Personnage;

public class EmptyCase extends Case {
    //attributs

    public EmptyCase(){setContent("empty");}
    public void action(Personnage personnage){System.out.println("La case est vide veuillez lancer le dé");}
}
