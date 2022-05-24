package partie.de;

import partie.menu.Menu;
import personnage.Personnage;
public class De {
    private int de = 0;
    private String quit = "Q";
    private String lance = "L";
    private String userInput;

    public int lancerDe() {
        Menu m = new Menu();
        userInput = m.lancerDe();

        if (lance.equals((userInput))) {
            System.out.println("""
                                   (( _______
                         _______     /\\O    O\\
                        /O     /\\   /  \\      \\
                       /   O  /O \\ / O  \\O____O\\ ))
                    ((/_____O/    \\\\    /O     /
                      \\O    O\\    / \\  /   O  /
                       \\O    O\\ O/   \\/_____O/
                        \\O____O\\/ )) mrf      ))
                      ((
                    """);
            this.de = (int) (Math.random() * (6 - 1 + 1) + 1);
            System.out.println("Le joueur avance de " + this.de + " case");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + this.lance + " ou " + this.quit + " ? ");
        }
        return this.de;
    }
}

