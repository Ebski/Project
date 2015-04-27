/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class DeclineDescriptionAdder {
    
    public void addDeclineMDFDescription(String mdf, String desc) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        PreparedStatement stmt1 = null;
        ResultSet rs = null;
        String campaign_No = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);
            
            String sql = "SELECT CAMPAIGN_NO FROM CAMPAIGN WHERE ID_MDF LIKE " + mdf;
            
            stmt = con.createStatement();
            
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                campaign_No = rs.getString("CAMPAIGN_NO");
            }

            String sql1 = "INSERT INTO DECLINEDESCRIPTION (CAMPAIGN_NO, MDF_DECLINE_DESCRIPTION) VALUES (?,?)";
            stmt1 = con.prepareStatement(sql1);

            stmt1.setString(1, campaign_No);
            stmt1.setString(2, desc);

            stmt1.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            stmt1.close();
            rs.close();
        }
    }
    
}
