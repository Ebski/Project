/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.CampaignDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ebbe
 */
public class FetchRequest {

    public ArrayList<CampaignDTO> fetchPendingCampaigns() throws SQLException {
        ArrayList<CampaignDTO> fpc = new ArrayList();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT * FROM CAMPAIGN";

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }

        return fpc;
    }

    public ArrayList<CampaignDTO> fetchPendingCampaignsForPartner(String partner) throws SQLException {
        ArrayList<CampaignDTO> fpc = new ArrayList();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT * FROM CAMPAIGN WHERE PARTNER_NO = '" + partner + "'";

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }

        return fpc;
    }

    public String fetchPartnerNo(String username) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        String out = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select partner_no from partner where username = '" + username + "'";

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            StringBuilder builder = new StringBuilder();
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 0; i < columnCount; i++) {
                    builder.append(rs.getString(i + 1));
                }
            }
            
            out = builder.toString();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FetchRequest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return out;
    }
}
