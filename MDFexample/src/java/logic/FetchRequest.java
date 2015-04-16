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
                fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE")));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
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
                fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE")));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }

        return fpc;
    }
}
