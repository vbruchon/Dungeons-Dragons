package database;

import personnage.Personnage;
import personnage.user.Guerrier;
import personnage.user.Magicien;

import java.sql.*;

public class PrintData {
    Connection co;
    String query;
    String nameHero;
    String typeHero;
    int lifeHero;
    int attackHero;

    public PrintData() {

        DataBase db = new DataBase();
        co = db.connexion();
    }

    public void printData(DataBase db) throws SQLException {
        db = new DataBase();
        co = db.connexion();
        query = "SELECT * FROM Hero ";

        // Créer un état de connexion
        Statement st = co.createStatement();

        // Requete de selection de données
        ResultSet res = st.executeQuery(query);

        //Parcourir les resultats
        while (res.next()) {
            nameHero = res.getString("name");
            typeHero = res.getString("type");
            lifeHero = res.getInt("pointOfLife");
            attackHero = res.getInt("pointOfAttack");
            System.out.println("Nom du héro : " + nameHero + ", Type de personnage : " + typeHero + ", Point de vie : " + lifeHero + ", Point d'Attaque : " + attackHero);
        }
    }

    public Personnage printDataOfOneHero(DataBase db, String nameUser) throws SQLException {

        db = new DataBase();
        co = db.connexion();

        Personnage personnage = null;
        PreparedStatement pSt = co.prepareStatement("SELECT * FROM Hero WHERE name = ?");
        pSt.setString(1, nameUser);


        // Requete de selection de données
        ResultSet res = pSt.executeQuery();
        if (res.next()) {
            //Parcourir les resultats
            nameHero = res.getString("name");
            typeHero = res.getString("type");
            lifeHero = res.getInt("pointOfLife");
            attackHero = res.getInt("pointOfAttack");

            System.out.println("Nom du héro : " + nameHero + ", Type de personnage : " + typeHero + ", Point de vie : " + lifeHero + ", Point d'Attaque : " + attackHero);


            if (typeHero.equals("Magicien")) {
                personnage = new Magicien(nameHero, "", lifeHero, attackHero);
                return personnage;

            } else if (typeHero.equals("Guerrier")) {
                personnage = new Guerrier(nameHero, "", lifeHero, attackHero);
                return personnage;
            }
        }
        return personnage;
    }
}