package personnage;

import personnage.ennemy.Dragons;
import personnage.ennemy.Gobelins;
import personnage.ennemy.Wizzards;

/**
 * @Class Class abstract that contains all common attributes and method of all personnage of game.
 */
public abstract class Personnage {
    /**
     * @name = player's name
     * @lifePoint = player's life point
     * @attackForce = player's attack point
     * @result = sum of point of life potion and point of life player's or sum of point attack arms and point attack user
     * @newLife = new point of life of personnage after drink potion
     * @lifePointPotion =  point of life of potion can give to player
     * @lifePointEnnemy ; // @lifePointEnnemy = point of life of monster
     * @attackForceEnnemy = point of attack of monster
     */
    private String name;
    private int lifePoint;
    private int attackForce;
    private int lifeMax;
    private int attackMax;
    int lifePointEnnemy ; // @lifePointEnnemy = point of life of monster
    int attackForceEnnemy ; // @attackForceEnnemy = point of attack of monster

    /*_________________________________________________Getter_Setter__________________________________________________*/

    /**
     * @GETTER can display value
     * @SETTER can assigned new value of a attributes
     * @return value if you want
     */
    /*---------GETTER----------*/
    public String getName() { return name; }
    public int getLifePoint() { return lifePoint; }
    public int getAttackForce() { return attackForce; }
    public int getLifeMax() { return lifeMax; }
    public int getAttackMax() { return attackMax; }

    /*---------SETTER----------*/
    public void setName(String name) { this.name = name; }
    public void setLifePoint(int pointOfLife) { this.lifePoint = pointOfLife; }
    public void setAttackForce(int attackForce) { this.attackForce = attackForce; }
    public void setLifeMax(int lifeMax) { this.lifeMax = lifeMax; }
    public void setAttackMax(int attackMax) { this.attackMax = attackMax; }
    /*________________________________________________________________________________________________________________*/

    /*__________________________________________________Methodes______________________________________________________*/
    /**
     * @method combattre = Method for control a fight between User & Ennemy
     * @param ennemy = The monster to assigned at MonsterCaser with Instance of class Ennemy
     */
    public void combattre(Personnage ennemy){
        this.lifePoint = this.getLifePoint();
        this.lifePointEnnemy = ennemy.getLifePoint();
        this.attackForce = this.getAttackForce();
        this.attackForceEnnemy = ennemy.getAttackForce();

        if (ennemy instanceof Dragons){
            System.out.println("Vous vous retrouvez face à un Dragons");

            System.out.println("   .:'                                  `:.                                    \n" +
                    "  ::'                                    `::                                   \n" +
                    " :: :.                                  .: ::                                  \n" +
                    "\n" +
                    "  `:. `:.             .             .:'  .:'                                   \n" +
                    "   `::. `::           !           ::' .::'                                     \n" +
                    "       `::.`::.    .' ! `.    .::'.::'                                         \n" +
                    "         `:.  `::::'':!:``::::'   ::'                                          \n" +
                    "         :'*:::.  .:' ! `:.  .:::*`:                                           \n" +
                    "        :: HHH::.   ` ! '   .::HHH ::                                          \n" +
                    "       ::: `H TH::.  `!'  .::HT H' :::                                         \n" +
                    "       ::..  `THHH:`:   :':HHHT'  ..::                                         \n" +
                    "       `::      `T: `. .' :T'      ::'                                         \n" +
                    "         `:. .   :         :   . .:'                                           \n" +
                    "           `::'               `::'                                             \n" +
                    "             :'  .`.  .  .'.  `:                                               \n" +
                    "             :' ::.       .:: `:                                               \n" +
                    "             :' `:::     :::' `:                                               \n" +
                    "              `.  ``     ''  .'                                                \n" +
                    "               :`...........':                                                 \n" +
                    "               ` :`.     .': '                                                 \n" +
                    "                `:  `\"\"\"'  :'");
        } else if (ennemy instanceof Gobelins) {
            System.out.println("Vous vous retrouvez face à un Gobelins");
            System.out.println("""
                                      _..
                                    .'   `",
                                   ;        \\
                            .---._; ^,       ;
                         .-'      ;{ :  .-. ._;
                    .--""          \\*'   o/ o/
                   /   ,  /         :    _`";
                  ;     \\;          `.   `"+'
                  |      }    /    _.'T"--"\\
                  :     /   .'.--""-,_ \\    ;
                   \\   /   /_         `,\\   ;
                    : /   /  `-.,_      \\`.  :
                    |;   {     .' `-     ; `, \\
                    : \\  `;   {  `-,__..-'   \\ `}+=,
                     : \\  ;    `.   `,        `-,\\"
                     ! |\\ `;     \\}?\\|}
                  .-'  | \\ ;
                .'}/ i.'  \\ `,        fsc                  \s
                ``''-'    /   \\
                         /J|/{/
                           `'
                """);
        } else if (ennemy instanceof Wizzards) {
            System.out.println("Vous vous retrouvez face à un Gobelins");
            System.out.println("""
                                         ____\s
                                      .'* *.'
                                   __/_*_*(_
                                  / _______ \\
                                 _\\_)/___\\(_/_\s
                                / _((\\- -/))_ \\
                                \\ \\())(-)(()/ /
                                 ' \\(((()))/ '
                                / ' \\)).))/ ' \\
                               / _ \\ - | - /_  \\
                              (   ( .;''';. .'  )
                              _\\"__ /    )\\ __"/_
                                \\/  \\   ' /  \\/
                                 .'  '...' ' )
                                  / /  |  \\ \\
                                 / .   .   . \\
                                /   .     .   \\
                               /   /   |   \\   \\
                             .'   /    b    '.  '.
                         _.-'    /     Bb     '-. '-._\s
                     _.-'       |      BBb       '-.  '-.\s
                    (________mrf\\____.dBBBb.________)____)
                    """);
        }
        while ((this.lifePointEnnemy > 0) && (this.lifePoint > 0)){

            System.out.println("vous tapez l'ennemie avec " + this.attackForce + " point d'attaque");
            this.lifePointEnnemy = this.lifePointEnnemy - this.attackForce;
            System.out.println("L'ennemie a maintenant " + this.lifePointEnnemy + " point de vie");

            if (this.lifePointEnnemy <= 0 ){
                System.out.println("Félicitations ! Vous avez tuer le monstre ! ");
            } else {
                System.out.println("l'ennemie vous tape avec " + this.attackForceEnnemy + " point d'attaque");
                this.lifePoint = this.lifePoint - this.attackForceEnnemy;
                System.out.println("Vous avez maintenant " + this.lifePoint + " point de vie");
                if ( lifePoint <= 0 ){
                    System.out.println("Le monstre vous a tué.");
                    System.out.println("""
                                                        ,--.
                                                       {    }
                                                      K,   }
                                                     /  `Y`
                                                _   /   /
                                               {_'-K.__/
                                                 `/-.__L._
                                                 /  ' /`\\_}
                                                /  ' /     -ART BY ZEUS-
                                        ____   /  ' /
                                 ,-'~~~~    ~~/  ' /_
                               ,'             ``~~~%%',
                              (                     %  Y
                             {                      %% I
                            {      -                 %  `.
                            |       ',                %  )
                            |        |   ,..__      __. Y
                            |    .,_./  Y ' / ^Y   J   )|
                            \\           |' /   |   |   ||
                             \\          L_/    . _ (_,.'(
                              \\,   ,      ^^""' / |      )
                                \\_  \\          /,L]     /
                                  '-_`-,       ` `   ./`
                                     `-(_            )
                                         ^^\\..___,.--`""");
                    System.out.println("Game Over ! Le jeux s'arrete");
                    System.exit(5);
                }
            }
        }
    }
}