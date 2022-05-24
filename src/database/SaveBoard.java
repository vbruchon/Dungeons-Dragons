/*package database;

import java.sql.*;
import partie.plateau.*;


public class SaveBoard extends DataBase {
    Connection co;
    Plateau board;

    public void saveBoard(Plateau board , int positionJoueur){
        co = connexion();

        try {
            // Prepare request
            PreparedStatement pSt = co.prepareStatement("INSERT INTO Hero (name, type, pointOfLife, pointOfAttack) VALUES (?,?,?,?)");

            //Assigned values at ? in values
            pSt.setString(1, nameHero);
            pSt.setString(2, typeHero);
            pSt.setInt(3 , 5);
            pSt.setInt(4, 5);

            // Add Data
            pSt.executeUpdate();
            System.out.println("Votre personnage a bien était sauvegardé");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}*/