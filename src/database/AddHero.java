package database;

import java.sql.*;

import personnage.*;

public class AddHero {
    Connection co;
    String nameHero;
    String typeHero;
    int lifeHero;
    int attackHero;

    public void addHero(DataBase db, Personnage personnage) throws SQLException {
        db = new DataBase();
        co = db.connexion();
        nameHero = personnage.getName();
        typeHero = personnage.getClass().getSimpleName();
        lifeHero = personnage.getLifePoint();
        attackHero = personnage.getAttackForce();

        try {
            // Prepare request
            PreparedStatement pSt = co.prepareStatement("INSERT INTO Hero (name, type, pointOfLife, pointOfAttack) VALUES (?,?,?,?)");

            //Assigned values at ? in values
            pSt.setString(1, nameHero);
            pSt.setString(2, typeHero);
            pSt.setInt(3, 5);
            pSt.setInt(4, 5);

            // Add Data
            pSt.executeUpdate();
            System.out.println("Votre personnage a bien était sauvegardé");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}