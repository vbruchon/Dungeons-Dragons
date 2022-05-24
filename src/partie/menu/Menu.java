package partie.menu;

import java.sql.SQLException;
import java.util.Scanner;

import database.DataBase;
import partie.exception.MyException;
import personnage.*;
import personnage.user.Guerrier;
import personnage.user.Magicien;
import database.*;
//import database.AddHero;

public class Menu {
    /*______________ATTIBUTS_____________*/
    private final Scanner scanner;
    PrintData pdt;
    private Personnage personnage;

    public String getUse() {
        return use;
    }

    public String setUse(String use) {
        this.use = use;
        return use;
    }

    private String use = "u";
    private String quitter = "Q";
    private String commencer = "go";
    private String create = "c";
    private final String magicien = "m";
    private final String warriors = "g";
    private String lance = "L";
    private String name;
    AddHero ah;



    private String lancerPartie = "l";
    private String lancerDe = "L";

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    private String userInput;
    DataBase db;

    private String kill = "T";
    private String recup = "R";

    /*______________CONSTRUCTEUR_____________*/
    public Menu() {
        scanner = new Scanner(System.in);
        pdt = new PrintData();
        //db = new DataBase();
    }








                                        /*______________METHODES_____________*/

    /*___COMMENCER___*/
    public void beginGameOrQuitDialogMenu() {
        System.out.println("Pour commencer une partie veuillez écire " + commencer);
        System.out.println(" Si vous voulez quitter le jeu veuillez écrire " + quitter);
    }

    public void verifyBeginOrQuit(String begin, String quit) throws MyException {
        this.userInput = scanner.nextLine();

        if (begin.equals(userInput)) {
            System.out.println("Nous allons commencer une partie !");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            System.out.println("Veuillez saisir uniquement " + this.commencer + " ou " + this.quitter + " ? ");
            throw new MyException("Mauvaise saise");
        }
    }







/*________________________________________________________________________________________________________________*/
    /*___CREER_PERSONNAGE___*/
    public void createOrQuitDialogMenu() {
        System.out.println("Pour créer un personnage merci d'écrire " + this.create + " dans la console.");
        System.out.println("Pour utiliser un personnage merci d'écrire " + this.use);
        System.out.println("Sinon veuillez écrire dans la console " + quitter);
    }

    public Personnage createOrUseOrQuit(String create, String quitter, String use) throws MyException, SQLException {
        this.userInput = scanner.nextLine();

        if (create.equals(userInput)) {

            System.out.println("Nous allons créer un personnage");

            name = namePersonnage();
            typePersonnageDialogMenu();
            verifyTypePersonnage(magicien, warriors, name);
            return personnage;


        } else if (use.equals(userInput)) {
            //Affiche Bdd
            pdt.printData(db);
            System.out.println("Veuillez saisir le nom de votre personnage");
            //saisie user
            userInput = scanner.nextLine();

            personnage = pdt.printDataOfOneHero(db, userInput);

            return personnage;

        } else {
            System.out.println("Veuillez saisir uniquement " + this.create + " ou " + this.use + " ou " + this.quitter + " ? ");
            throw new MyException("Vous n'avez pas saisie un choix disponible");
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

    public void verifyTypePersonnage(String magicien, String warriors, String personnageName) throws SQLException {
        this.userInput = scanner.nextLine();
        this.ah = new AddHero();

        if (magicien.equals(userInput)) {
            personnage = new Magicien(personnageName);
            ah.addHero(db , personnage);

        } else if (warriors.equals(userInput)) {
            personnage = new Guerrier(personnageName);
            ah.addHero(db, personnage);

        } else {
            System.out.println("Veuillez saisir uniquement " + this.magicien + " ou " + this.warriors + " ? ");
        }
    }
    /*_____________________________________________________________________________________________________*/

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
            System.out.println("Veuillez saisir uniquement " + this.lancerPartie + " ou " + this.quitter + " ? ");
        }
    }

    public String lancerDe(){
        System.out.println("Pour lancer les dés écriver " + this.lance + " dans la console");
        System.out.println("Pour quitter écriver " + this.quitter);

        this.userInput = scanner.nextLine();
        return userInput;
    }
    public String catchSurprise(){
        System.out.println("La case contient une surprise. Récupérer là, puis Lancer les dés");

        System.out.println("Pour récupérer la surprise écrivez " + this.recup);
        System.out.println("Pour quitter écriver " + this.quitter);

        this.userInput = scanner.nextLine();

        return userInput;
    }

    public String ennemyCase(){
        System.out.println("Vous avec un ennemie battez le et lancer les dés");
        System.out.println("Pour combattre l'ennemie écrivez " + this.kill + ", pour quitter écriver " + this.quitter + " dans la console");

        this.userInput= scanner.nextLine();

        return userInput;
    }
    public void verifSurpriseCase(String userInput){
        System.out.println("Êtes vous sure d'avoir saisie correctement " + this.recup + " ou " + this.quitter + " ? ");
        if ((!userInput.equals(this.recup)) || (!userInput.equals(this.quitter))) {
            catchSurprise();        }
    }
    public void verifEnnemyCase(String userInput){
        if ((!userInput.equals(this.kill)) || (!userInput.equals(this.quitter))) {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + this.kill + " ou " + this.quitter + " ? ");
            ennemyCase();        }
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