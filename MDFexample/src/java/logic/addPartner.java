/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.PartnerDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ebbe
 */
public class addPartner {

    public void addPartnerToDatabase(PartnerDTO partner) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "INSERT INTO USERPASS (USERNAME, PASSWORD, USERTYPE) VALUES (?, ?, ?)";
            String sql2 = "INSERT INTO PARTNER (PARTNER_NO, USERNAME) VALUES (?, ?)";

            stmt = con.prepareStatement(sql);
            stmt2 = con.prepareStatement(sql2);

            stmt.setString(1, partner.getUsername());
            stmt.setString(2, partner.getPassword());
            stmt.setInt(3, 2);
            stmt2.setString(1, partner.getPartner_No());
            stmt2.setString(2, partner.getUsername());
            
            stmt.executeQuery();
            stmt2.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            stmt2.close();
        }
    }
}
