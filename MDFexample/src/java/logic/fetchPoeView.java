/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.PoEDTO;
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
 * @author Ebbe
 */
public class fetchPoeView {

    public void updateCampaignStatusAfterPoe(String id_POE) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE CAMPAIGN "
                    + "SET C_STATUS = ?"
                    + " WHERE ID_POE = ?";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, 3);
            stmt.setString(2, id_POE);

            stmt.executeQuery();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fetchMdfView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    public PoEDTO fetchPoe(String id_POE) throws SQLException {
        PoEDTO poe = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select * from poe where ID_POE =" + id_POE;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                poe = new PoEDTO(
                        rs.getString("ID_POE"),
                        rs.getString("campaign_type"),
                        rs.getString("activity"),
                        rs.getString("poe_date"),
                        rs.getString("recipients"),
                        rs.getString("unique_opens_hits"),
                        rs.getString("unique_clicks"),
                        rs.getString("additional_information"),
                        rs.getString("filepath")
                );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fetchPoeView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return poe;
    }
}
