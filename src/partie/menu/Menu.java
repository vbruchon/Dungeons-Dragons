package partie.menu;

import java.util.Scanner;

import personnage.*;

public class Menu {
    /*______________ATTIBUTS_____________*/
    private Scanner scanner;
    private Personnage personnage;
    private String quitter = "q";
    private String commencer = "go";
    private String create = "c";
    private  String magicien = "m";
    private String warriors = "g";
    private String name;

    private String lancerPartie = "l";
    private String lancerDe = "L";
    private String userInput;

    private String kill = "T";
    private String recup = "R";

    /*______________CONSTRUCTEUR_____________*/
    public Menu() {
        scanner = new Scanner(System.in);
    }

                                        /*______________METHODES_____________*/

    /*___COMMENCER___*/
    public void beginGameOrQuitDialogMenu() {
        System.out.println("Bienvenue sur le jeux !! ");
        System.out.println("Pour commencer une partie veuillez écire " + commencer);
        System.out.println(" Si vous voulez quitter le jeu veuillez écrire " + quitter);
    }

    public void verifyBeginOrQuit(String begin, String quit) {
        this.userInput = scanner.nextLine();

        if (begin.equals(userInput)) {
            System.out.println("Nous allons commencer une partie !");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + this.commencer + " ou " + this.quitter + " ? ");
        }
    }

    /*___CREER_PERSONNAGE___*/
    public void createOrQuitDialogMenu() {
        System.out.println("Pour créer un personnage merci d'écrire " + this.create + " dans la console.");
        System.out.println("Sinon veuillez écrire dans la console " + quitter);
    }

    public Personnage createOrQuit(String create, String quitter) {
        this.userInput = scanner.nextLine();

        if (create.equals(userInput)) {
            System.out.println("Nous allons créer un personnage");
            name = namePersonnage();
            typePersonnageDialogMenu();
            verifyTypePersonnage(magicien, warriors, name);
            return personnage;
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + this.create + " ou " + this.quitter + " ? ");
            throw new RuntimeException("Vous n'avez pas choisi de personnage");
        }
    }

    /*___NAME_PERSONNAGE___*/
    public String namePersonnage() {
        System.out.println("Veuillez saisir le nom de votre personnage");
        this.userInput = scanner.nextLine();
        this.name = userInput;

        return name;
    }

    /*___TYPE_PERSONNAGE___*/
    public void typePersonnageDialogMenu() {
        System.out.println("Quelle type de personnage voulez-vous?");
        System.out.println("Personnage disponible : \"Magicien\" ou \"Guerrier\" ");
        System.out.println(" Merci de saisir " + this.magicien + " pour choisir Magicien ou saisir " + this.warriors + " pour choisir le Guerrier");
        ;
    }

    public void verifyTypePersonnage(String magicien, String warriors, String personnageName) {
        this.userInput = scanner.nextLine();

        if (magicien.equals(userInput)) {
            personnage = new Magicien(personnageName);
        } else if (warriors.equals(userInput)) {
            personnage = new Guerrier(personnageName);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + this.magicien + " ou " + this.warriors + " ? ");
        }
    }

    public void lancerPartie() {

        System.out.println("Voulez-vous lancer la partie ?");
        System.out.println("Pour lancer la partie veuillez écrire " + this.lancerPartie + " , Pour quitter ecrivez " + this.quitter);

        this.userInput = scanner.nextLine();

        if (userInput.equals(this.lancerPartie)){
            System.out.println("La partie commence");
        } else if (userInput.equals(this.quitter)){
            System.out.println("A bientot!");
            System.exit(5);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + this.lancerPartie + " ou " + this.quitter + " ? ");
        }
    }


    /*----------SETTER/GETTER--------*/
    public String setQuitter(String quitter) {
        this.quitter = quitter;
        return quitter;
    }

    public String setCommencer(String commencer) {
        this.commencer = commencer;
        return commencer;
    }

    public String setCreate(String create) {
        this.create = create;
        return create;
    }
    public String getQuitter() {
        return quitter;
    }

    public String getKill() {
        return kill;
    }

    public void setKill(String kill) {
        this.kill = kill;
    }
}