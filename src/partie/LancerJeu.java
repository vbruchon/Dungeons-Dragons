package partie;

import partie.exception.MyException;
import partie.menu.Menu;
import personnage.Personnage;

public class LancerJeu {
    public static void main(String[] args) {
        System.out.println("Bienvenue sur le jeux !! ");

        Menu m = new Menu();

       String go = m.setCommencer("go");
       String quit = m.setQuitter("q");

       while ((!go.equals(m.getUserInput()) && (!quit.equals(m.getUserInput())))) {
           try {
               m.beginGameOrQuitDialogMenu();
               m.verifyBeginOrQuit(go, quit);
           } catch (MyException e){
               //boucle
           }
       }

        m.createOrQuitDialogMenu();

        Personnage personnage = null;
        while (personnage == null) {
            try {
                personnage = m.createOrQuit(m.setCreate("c"), m.setQuitter("q"));
            } catch (MyException e) {
                // boucle
            }
        }

        m.lancerPartie();

        Game g = new Game(personnage);

        g.play();
    }

}