package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {

    public static Collection<Dep> getLesDeps() {
        Collection<Dep> d = new TreeSet<Dep>();
        try {

            Connection cnx = Connect.get();

            //Requête
            java.sql.Statement reqD = (java.sql.Statement) cnx.createStatement();
            ResultSet rsD = reqD.executeQuery("Select DISTINCT departement from medecin");
            while (rsD.next()) {
                String dep = rsD.getString("departement");
                d.add(new Dep(dep));
            }
            rsD.close();
            //fermeture de la B de D
            reqD.close();
        } catch (SQLException ex) {
            Logger.getLogger(Pays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    public static Collection<Spe> getLesSpes() {
        Collection<Spe> s = new TreeSet<Spe>();
        try {
            Connection cnx = Connect.get();

            java.sql.Statement reqS = (java.sql.Statement) cnx.createStatement();
            ResultSet rsS = reqS.executeQuery("Select DISTINCT specialitecomplementaire from medecin where specialitecomplementaire is not null");
            while (rsS.next()) {
                String spe = rsS.getString("specialitecomplementaire");
                s.add(new Spe(spe));
            }
            rsS.close();
            //fermeture de la B de D
            reqS.close();
        } catch (SQLException ex) {
            Logger.getLogger(Pays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    public static Collection<Med> getLesMeds() {
        Collection<Med> m = new TreeSet<Med>();
        try {
            Connection cnx = Connect.get();

            Statement reqM = cnx.createStatement();
            ResultSet rsM = reqM.executeQuery("select * from medecin");
            while (rsM.next()) {
                String id = rsM.getString("id");
                String nom = rsM.getString("nom");
                String prenom = rsM.getString("prenom");
                String adresse = rsM.getString("adresse");
                String tel = rsM.getString("tel");
                String spe = rsM.getString("specialitecomplementaire");
                String dep = rsM.getString("departement");
                m.add(new Med(nom, prenom, adresse, tel, spe, dep, id));
            }
            rsM.close();
            //fermeture de la B de D
            reqM.close();
        } catch (SQLException ex) {
            Logger.getLogger(Pays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }
}