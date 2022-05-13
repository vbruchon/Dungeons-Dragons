package partie.plateau.Case;

import personnage.Personnage;

import java.util.Scanner;

public class SurpriseCase extends Case {

    Scanner scanner;
    String quit = "Q";
    String recup = "R";
    private int random;
    private int arm;
    private int spell;
    private int fireBall;
    private int sword;
    private  int littlePotion;


    public SurpriseCase() {
        setContent("surprise");
    }

    public void action(Personnage personnage) {
        System.out.println("La case contient une surprise. Récupérer là, puis Lancer les dés");

        this.scanner = new Scanner(System.in);


        System.out.println("Pour récupérer la surprise écrivez " + this.recup);
        System.out.println("Pour quitter écriver " + this.quit);

        String userInput = scanner.nextLine();

        if (recup.equals((userInput))) {
            whatIsTheSurprise(personnage);
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + this.recup + " ou " + this.quit + " ? ");
        }
    }

    public void whatIsTheSurprise(Personnage personnage){
        this.spell = 0;
        this.arm = 1;

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
        this.fireBall = 0;

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
        this.sword = 0;
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
        this.littlePotion = 0;
        random = (int) (Math.random() * (1 - 0 + 1) + 0);

        if (random == littlePotion) {
            personnage.drinkPotion("LittlePotion");
        } else {
            personnage.drinkPotion("BigPotion");
        }
    }
}







    /*public void potionOrEquipment(Personnage personnage) {
        this.equipments = 2;

        random = (int) (Math.random() * (2 - 1 + 1) + 1);

        if (random == equipments) {
            System.out.println("Vous trouvez un equipement !");
            equipment(personnage);
        } else {
            System.out.println("Vous trouvez une potion !");
            potion(personnage);
        }
    }

    public void potion(Personnage personnage) {
        random = (int) (Math.random() * (2 - 1 + 1) + 1);
        this.petitePotion = 1;

        if (random == this.petitePotion) {
            System.out.println("Le joueur boit une petite potion de vie qui lui rajoute 2 pdv");
        } else {
            System.out.println("Le joueur boit une grande potion qui lui rajoute 5 pdv");
        }
    }
//
    public void equipment(Personnage personnage) {
        if (personnage instanceof Magicien) {
            spells((Magicien) personnage);
        } else if (personnage instanceof Guerrier) {
            arms((Guerrier) personnage);
        }
    }
/*/

   /* public void spells(Magicien magicien) {
        random = (int) (Math.random() * (2 - 1 + 1) + 1);
        this.fireBall = 1;

        if (random == this.fireBall) {
            System.out.println("Le joueur récupère le sort Boule de Feu");
            magicien.equipSpell("FireBall");
        } else {
            System.out.println("Le joueur récupère le sort Eclair");
            magicien.equipSpell("Lightning");
        }
    }

    public void arms(Guerrier guerrier) {
        random = (int) (Math.random() * (2 - 1 + 1) + 1);
        this.sword = 1;

        if (random == this.sword) {
            System.out.println("Le joueur récupère une épée.");
            guerrier.equipArm("Epée");
        } else {
            System.out.println("Le joueur récupère un bouclier.");
            guerrier.equipArm("Bouclier");

        }
    }*/


