package partie;

import database.AddHero;
import database.PrintData;
import partie.exception.MyException;
import partie.menu.Menu;
import personnage.Personnage;
import database.DataBase;

public class LancerJeu {

    public static void main(String[] args) throws Exception {
        System.out.println("                                                                                                                                                                 \n" +
                "                                                                                                                                                                 \n" +
                "BBBBBBBBBBBBBBBBB     iiii                                                                                                                                       \n" +
                "B::::::::::::::::B   i::::i                                                                                                                                      \n" +
                "B::::::BBBBBB:::::B   iiii                                                                                                                                       \n" +
                "BB:::::B     B:::::B                                                                                                                                             \n" +
                "  B::::B     B:::::Biiiiiii     eeeeeeeeeeee    nnnn  nnnnnnnn vvvvvvv           vvvvvvv eeeeeeeeeeee    nnnn  nnnnnnnn    uuuuuu    uuuuuu      eeeeeeeeeeee    \n" +
                "  B::::B     B:::::Bi:::::i   ee::::::::::::ee  n:::nn::::::::nnv:::::v         v:::::vee::::::::::::ee  n:::nn::::::::nn  u::::u    u::::u    ee::::::::::::ee  \n" +
                "  B::::BBBBBB:::::B  i::::i  e::::::eeeee:::::een::::::::::::::nnv:::::v       v:::::ve::::::eeeee:::::een::::::::::::::nn u::::u    u::::u   e::::::eeeee:::::ee\n" +
                "  B:::::::::::::BB   i::::i e::::::e     e:::::enn:::::::::::::::nv:::::v     v:::::ve::::::e     e:::::enn:::::::::::::::nu::::u    u::::u  e::::::e     e:::::e\n" +
                "  B::::BBBBBB:::::B  i::::i e:::::::eeeee::::::e  n:::::nnnn:::::n v:::::v   v:::::v e:::::::eeeee::::::e  n:::::nnnn:::::nu::::u    u::::u  e:::::::eeeee::::::e\n" +
                "  B::::B     B:::::B i::::i e:::::::::::::::::e   n::::n    n::::n  v:::::v v:::::v  e:::::::::::::::::e   n::::n    n::::nu::::u    u::::u  e:::::::::::::::::e \n" +
                "  B::::B     B:::::B i::::i e::::::eeeeeeeeeee    n::::n    n::::n   v:::::v:::::v   e::::::eeeeeeeeeee    n::::n    n::::nu::::u    u::::u  e::::::eeeeeeeeeee  \n" +
                "  B::::B     B:::::B i::::i e:::::::e             n::::n    n::::n    v:::::::::v    e:::::::e             n::::n    n::::nu:::::uuuu:::::u  e:::::::e           \n" +
                "BB:::::BBBBBB::::::Bi::::::ie::::::::e            n::::n    n::::n     v:::::::v     e::::::::e            n::::n    n::::nu:::::::::::::::uue::::::::e          \n" +
                "B:::::::::::::::::B i::::::i e::::::::eeeeeeee    n::::n    n::::n      v:::::v       e::::::::eeeeeeee    n::::n    n::::n u:::::::::::::::u e::::::::eeeeeeee  \n" +
                "B::::::::::::::::B  i::::::i  ee:::::::::::::e    n::::n    n::::n       v:::v         ee:::::::::::::e    n::::n    n::::n  uu::::::::uu:::u  ee:::::::::::::e  \n" +
                "BBBBBBBBBBBBBBBBB   iiiiiiii    eeeeeeeeeeeeee    nnnnnn    nnnnnn        vvv            eeeeeeeeeeeeee    nnnnnn    nnnnnn    uuuuuuuu  uuuu    eeeeeeeeeeeeee  \n" +
                "                                                                                                                                                               ");
        Menu m = new Menu();

        String go = m.setCommencer("go");
        String quit = m.setQuitter("q");


/*______________________________________COMMENCER UNE PARTIE ________________________________________*/

       while ((!go.equals(m.getUserInput()) && (!quit.equals(m.getUserInput())))) {

           try {
               m.beginGameOrQuitDialogMenu();
               m.verifyBeginOrQuit(go, quit);

           } catch (MyException e){
               //boucle
           }
       }

/*_________________________________________CREER OU UTILISER OU QUITTER?____________________________________________*/

        Personnage personnage = null;

        m.createOrQuitDialogMenu();

        while (personnage == null) {
            try {
                personnage = m.createOrUseOrQuit(m.setCreate("c"), m.setQuitter("q"), m.setUse("u"));
            } catch (MyException e) {
                // boucle
            }
        }
        m.lancerPartie();

        Game g = new Game(personnage);

        g.play();
    }

}