package Partie.Plateau;

import Partie.Plateau.Case.Case;

public class Plateau extends Case {
    private Case[] box;
    public Plateau() {
        this.box = new Case[64];
        String boxContent = null;

        for (int i = 0; i < box.length; i++) {
             if (box[i] == null) {
                box[i] = new Case();
                boxContent = box[i].setContent(caseContent());
            }
        }
    }
    public Case getBoxContent(int position){
        return this.box[position];
    }
}


