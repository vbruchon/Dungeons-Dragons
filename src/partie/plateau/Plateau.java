package partie.plateau;

import partie.plateau.Case.Case;
import personnage.Personnage;

public class Plateau extends Case {
    private final Case[] box;
    public Plateau() {
        this.box = new Case[64];

        for (int i = 0; i < box.length; i++) {
             box[i] = caseContent();
        }
    }
    public Case getBoxContent(int position){
        return this.box[position];
    }

    @Override
    public void action(Personnage personnage) {

    }
}


