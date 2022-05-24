package personnage.ennemy;

import partie.plateau.caseBoard.CaseBoard;

public class Gobelins extends Ennemy implements CaseBoard {

    public Gobelins() {
        super();
        setName("Gobelin");
        setLifePoint(6);
        setAttackForce(1);
        /*System.out.println("""
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
                """);*/
    }

}
