package partie;

import partie.de.De;
import partie.plateau.*;
import partie.plateau.caseBoard.CaseBoard;
import personnage.Personnage;

public class Game {
    /*__________Attributs_________*/
    /**
     * @board = Declare an attributes board to Plateau Class
     * @positopnJoueur = integer that is worth the player’s position on the board
     * @personnage = Declare a attributes personnage to Personnage Class. After he contains new Personnage
     * @caseMax = Length of board.
     * @d = Declare a attributes 'd' to 'De.class'. After contains new 'de'
     * @de = result of dice
     */
    private Plateau board;
    private int positionJoueur = 1;
    private Personnage personnage;
    private int caseMax;
    private De d;
    private int de;

    /**
     * @Construtor
     * @param personnage = Instance of new personne if user create
     */
    public Game(Personnage personnage) {
        this.personnage = personnage;
    }

    /*________Mehodes________*/

    /**
     * @method play() = Method who create a new board. While positionUser != length of board, game continue
     * @de = launch dice
     * @newPositionJoueur = Move on a board
     * @actionCase = Method who control the containts of case
     */
    public void play() {
        this.board = new Plateau();
        this.positionJoueur = 1;
        this.caseMax = 64;
        while (positionJoueur != this.caseMax) {
            De d = new De();
            de = d.lancerDe();
            newPositionJoueur(de);
            CaseBoard caseBoard = board.getBoxContent(positionJoueur);
            caseBoard.action(personnage);
            this.board.viderCase(positionJoueur);
        }
    }

    /**
     * @method newPositionJoueur = Method for move personnage by adding positionJoueur and result of the dice.
     * If poistionJoeur is more than lentgh of bourd, the player steps back from the difference
     * @param de = result of launch the dice
     */
    public void newPositionJoueur(int de) {
        int result;
        this.caseMax = 64;

        if ((this.positionJoueur + de) < caseMax ){
            this.positionJoueur = this.positionJoueur + de;
            System.out.println("Le joueur se trouve maintenant a la case N° " + positionJoueur);
        } else if ((this.positionJoueur + de)> caseMax){
            result = (this.positionJoueur + de) - caseMax;
            this.positionJoueur = caseMax - result;
            System.out.println("Vous devez arrivé exactement sur la case " + caseMax + " Vous reculez de " + result + "cases");
            System.out.println("Le joueur se trouve maintenant a la case N° " + positionJoueur);
        } else if ((this.positionJoueur + de) == caseMax){
            System.out.println("""
                                                       ___________
                                                 .---'::'        `---.
                                                (::::::'              )
                                                |`-----._______.-----'|
                                                |              :::::::|
                                               .|               ::::::!-.
                                               \\|               :::::/|/
                                                |               ::::::|
                                                | Félicitation vous  :|
                                                |   avez Gagner ! ::::|
                                                |               ::::::|
                                                |              .::::::|
                                                J              :::::::F
                                                 \\            :::::::/
                                                  `.        .:::::::'
                                                    `-._  .::::::-'
                    ____________________________________|  ""\"|"_________________________________________
                                                        |  :::|
                                                        F   ::J
                                                       /     ::\\                                       \s
                                                  __.-'      :::`-.__
                                                 (_           ::::::_)
                                                   `""\"---------""\"'""");
            System.exit(5);
        }
    }
}