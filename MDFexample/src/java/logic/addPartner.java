/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.PartnerDTO;
import DTO.PoEDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void updatePartner(PartnerDTO partner) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE PARTNER "
                    + "SET PARTNER_NAME = ?, PARTNER_MAIL = ?, PARTNER_PHONE = ?, PARTNER_ADDRESS = ?"
                    + " WHERE PARTNER_NO = ?";

            stmt = con.prepareStatement(sql);

            stmt.setString(1, partner.getPartner_name());
            stmt.setString(2, partner.getPartner_mail());
            stmt.setString(3, partner.getPartner_phone());
            stmt.setString(4, partner.getPartner_address());
            stmt.setString(5, partner.getPartner_No());

            stmt.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    public PartnerDTO fetchPartnerInfo(String user) throws SQLException {
        PartnerDTO partner = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select PARTNER_NAME, PARTNER_MAIL, PARTNER_PHONE, pARTNER_ADDRESS from PARTNER where PARTNER_NO =" + user;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                partner = new PartnerDTO(
                        rs.getString("PARTNER_NAME"),
                        rs.getString("PARTNER_MAIL"),
                        rs.getString("PARTNER_PHONE"),
                        rs.getString("PARTNER_ADDRESS")
                );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fetchPoeView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return partner;
    }
}
