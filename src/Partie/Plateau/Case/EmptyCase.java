package Partie.Plateau.Case;

public class EmptyCase extends Case {
    //attributs

    public EmptyCase(){setContent("empty");}
    public void action(){System.out.println("La case est vide veuillez lancer le dé");}
}
