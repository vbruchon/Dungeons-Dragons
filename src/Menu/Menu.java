package Menu;

import java.util.Scanner;

import Personnage.Guerrier;
import Personnage.Magicien;
import Personnage.Personnage;
import Plateau_Dé.*;

public class Menu {
    /*______________ATTIBUTS_____________*/
    private Scanner scanner;
    private Plateau plateau;
    private Personnage personnage;
    private String quitter = "q" ;
    private String commencer = "go";
    private String create = "c";
    private String magicien = "m";
    private String warriors = "g";


    /*______________CONSTRUCTEUR_____________*/
    public Menu(){
        scanner = new Scanner(System.in);
        plateau = new Plateau();
    }

    /*______________METHODES_____________*/

    public void inputUser(){
        String begin = this.commencer;
        String quit = this.quitter;
        String create = this.create;
        String magician = this.magicien;
        String warrior = this.warriors;

        String userInput = scanner.nextLine();

        verifyBeginOrQuit(begin, quit, userInput);
        verifyCreateOrQuit(create, quit, userInput);

        //
    }
        /*___COMMENCER_PARTIE___*/
    public void beginGameOrQuit(){
        System.out.println("Bienvenue sur le jeux !! ");
        System.out.println("Pour commencer une partie veuillez écire " + commencer);
        System.out.println(" Si vous voulez quitter le jeu veuillez écrire " + quitter);
    }
    public void verifyBeginOrQuit(String begin, String quit, String userInput){
        if (begin.equals(userInput)){
            System.out.println("Nous allons commencer une partie !");
        } else if (quit.equals(userInput)) {
            System.out.println("A bientôt !");
            System.exit(5);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement \"Commencer\" ou \"Quitter\" ? ");
        }
    }

    /*___CREER_PERSONNAGE___*/
    public void createOrQuitDialogMenu(){
        System.out.println("Pour créer un personnage merci d'écrire " + commencer + " dans la console.");
        System.out.println("Sinon veuillez écrire dans la console " + quitter);
    }
    public void verifyCreateOrQuit(String create, String quit, String userInput){
        if (create.equals(userInput)){
            System.out.println("Nous allons créer un personnage");
            //Demander le nom du personnage
            // demander le type de personnage
            //Vous avez créer tel personnage
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement \"Commencer\" ou \"Quitter\" ? ");
        }
    }

    /*___NAME_PERSONNAGE___*/
    public namePersonnage(String userInput){
        System.out.println("Veuillez saisir le nom de votre personnage");
        String name = userInput;
        return name;
    }
    public void verifyNamePersonnage(String userInput){

    }

        /*___TYPE_PERSONNAGE___*/
    public void typePersonnageDialogMenu(){
        System.out.println("Quelle type de personnage voulez-vous?");
        System.out.println("Personnage disponible : \"Magicien\" ou \"Guerrier\"")
        System.out.println(" Merci de saisir " + magicien + " pour choisir Magicien ou saisir " + warriors + " pour choisir le Guerrier");;
    }
    public void verifyTypePersonnage(String magicien, String warriors, String userInput, String personnageName){
        if (magicien.equals(userInput)){
            personnage = new Magicien(personnageName);
        } else if (warriors.equals(userInput)) {
            personnage = new Guerrier(personnageName);
        } else {
            System.out.println("Êtes vous sure d'avoir saisie correctement " + magicien + " ou " + warriors + " ? ");
        }
        System.out.println("Votre personnage sera un " + personnage);
    }

    /*___LANCER_DES___
    public void lancerDeDialogMenu(){
        System.out.println("Pour lancer les dés écriver \"Lancer\" dans la console");
        System.out.println("Pour quitter écriver \"Quitter\"");
    }*/
}
