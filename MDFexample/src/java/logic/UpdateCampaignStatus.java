/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ebbe
 */
public class UpdateCampaignStatus {

    public void updateCampaignStatusAfterMdf(String id_MDF) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE CAMPAIGN "
                    + "SET C_STATUS = ?"
                    + " WHERE ID_MDF = ?";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, 1);
            stmt.setString(2, id_MDF);

            stmt.executeQuery();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fetchMdfView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    public void updateCampaignStatusAfterPoeUpload(String id_POE) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE CAMPAIGN "
                    + "SET C_STATUS = ?"
                    + " WHERE ID_POE = ?";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, 2);
            stmt.setString(2, id_POE);

            stmt.executeQuery();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fetchMdfView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

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

    public void updateCampaignStatusAfterInvoiceUpload(String id_invoice) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE CAMPAIGN "
                    + "SET C_STATUS = ?"
                    + " WHERE ID_INVOICE = ?";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, 4);
            stmt.setString(2, id_invoice);

            stmt.executeQuery();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fetchMdfView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    public void updateCampaignStatusAfterInvoice(String id_invoice) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE CAMPAIGN "
                    + "SET C_STATUS = ?"
                    + " WHERE ID_INVOICE = ?";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, 5);
            stmt.setString(2, id_invoice);

            stmt.executeQuery();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fetchMdfView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

    public void updateCampaignStatusAfterFacturaUpload(String id_factura) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE CAMPAIGN "
                    + "SET C_STATUS = ?"
                    + " WHERE ID_FACTURA = ?";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, 6);
            stmt.setString(2, id_factura);

            stmt.executeQuery();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fetchMdfView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }

}
