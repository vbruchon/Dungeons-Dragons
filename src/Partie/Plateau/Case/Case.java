package Partie.Plateau.Case;

import java.util.Scanner;

public abstract class Case {
    private String content;

    /*__________________________________________________Constructeur__________________________________________________*/
    public abstract void action();

    /*_________________________________________________Getter_Setter__________________________________________________*/

    /*---------Content----------*/
    public String getContent() {
        return content;
    }

    public String setContent(String content) {
        this.content = content;
        return content;
    }

    /*______________________________________________________METHODES____________________________________________*/
    /*_________Contenu_de_la_Case________*/
    public Case caseContent() {
        int j = (int) (Math.random() * 4);

        if (j == 0) {
           return new EmptyCase();
        } else if (j == 1) {
            return new SurpriseCase();
        } else {
            return new MonsterCase();
        }
    }

}