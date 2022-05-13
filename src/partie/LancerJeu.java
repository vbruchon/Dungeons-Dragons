package partie;

import partie.menu.Menu;
import personnage.Personnage;

public class LancerJeu {
    public static void main(String[] args) {
       Menu m = new Menu();

        m.beginGameOrQuitDialogMenu();
        m.verifyBeginOrQuit(m.setCommencer("go"), m.setQuitter("q"));
        m.createOrQuitDialogMenu();

        Personnage personnage = null;
        while (personnage == null) {
            try {
                personnage = m.createOrQuit(m.setCreate("c"), m.setQuitter("q"));
            } catch (RuntimeException error) {
                // boucle
            }
        }

        m.lancerPartie();

        Game g = new Game(personnage);

        g.play();
    }

}