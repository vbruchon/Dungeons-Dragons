package database;

import java.sql.*;

public class DataBase {

    public Connection connexion() {

        String user = "vivian";
        String pswd = "31juillet!12";
        String urlBDD = "jdbc:mysql://localhost/Donjon_&_Dragons";
        Connection connexionBdd = null;

        try {
            // Charger JDBC

            Class.forName("com.mysql.cj.jdbc.Driver");

            // Créer la connexion

            connexionBdd = DriverManager.getConnection(urlBDD, user, pswd);

            //System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Une erreur s'est produite durant la connexion à la BDD");
        }
        return connexionBdd;
    }


}