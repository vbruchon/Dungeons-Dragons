package Partie;

import Partie.Menu.Menu;
public class LancerJeu {

    public static void main(String[] args) {
        Menu m = new Menu();

        m.beginGameOrQuitDialogMenu();
        m.verifyBeginOrQuit(m.setCommencer("go"), m.setQuitter("q"));
        m.createOrQuitDialogMenu();
        m.createOrQuit(m.setCreate("c"), m.setQuitter("q"));
        m.lancerPartie();

        Game g = new Game();

        g.play();
    }
}