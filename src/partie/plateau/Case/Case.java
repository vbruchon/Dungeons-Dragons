package partie.plateau.Case;

import personnage.Personnage;

public abstract class Case {
    private String content;

    /*__________________________________________________Constructeur__________________________________________________*/
    public abstract void action(Personnage personnage);

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
        int j = (int) (Math.random() * 3);

        if (j == 0) {
           return new EmptyCase();
        } else if (j == 1) {
            return new SurpriseCase();
        } else {
            return new MonsterCase();
        }
    }
    public void videCase() {
        System.out.println("La case est desormais vide");
        setContent("empty");
    }
}