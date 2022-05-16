package partie.plateau.Case;

import personnage.Personnage;
import partie.menu.Menu;

public class SurpriseCase extends Case {

    Menu m = new Menu();
    String quit = "Q";
    String recup = "R";
    private int random;


    public SurpriseCase() {
        setContent("surprise");
    }

    public void action(Personnage personnage) {
        String userInput = this.m.catchSurprise();

        if (recup.equals((userInput))) {
            whatIsTheSurprise(personnage);
            videCase();
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            m.verifSurpriseCase(userInput);
        }
    }

    public void whatIsTheSurprise(Personnage personnage){
        int spell = 0;
        int arm = 1;

        random = (int) (Math.random()* (2 - 0 + 1) + 0);

        if (random == spell){
            System.out.println("Vous trouvez un sort");
            spell(personnage);
        } else if (random == arm) {
            System.out.println("Vous trouvez une arme");
            arms(personnage);
        } else {
            System.out.println("Vous trouvez une potion");
            potion(personnage);
        }
    }

    public void spell(Personnage personnage){
        int fireBall = 0;

        random = (int) (Math.random() * (1 - 0 + 1) + 0);

        if (random == fireBall){
            System.out.println("Le joueur trouve le sort Boule de Feu");
            personnage.equipSpell("FireBall");
        } else {
            System.out.println("Le joueur trouve le sort Eclair");
            personnage.equipSpell("Lightning");
        }
    }

    public void arms(Personnage personnage){
        int sword = 0;
        random = (int) (Math.random() * (1 - 0 + 1) + 0);

        if (random == sword){
            System.out.println("Le joueur trouve une épée.");
            personnage.equipArm("Sword");
        } else {
            System.out.println("Le joueur trouve un bouclier.");
            personnage.equipArm("Sledgehammer");
        }
    }

    public void potion(Personnage personnage){
        int littlePotion = 0;
        random = (int) (Math.random() * (1 - 0 + 1) + 0);

        if (random == littlePotion) {
            personnage.drinkPotion("LittlePotion");
        } else {
            personnage.drinkPotion("BigPotion");
        }
    }
}