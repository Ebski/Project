/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.CampaignDTO;
import logic.DBDAO;
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

    DBDAO connect = new DBDAO();

    public ArrayList<CampaignDTO> fetchPendingCampaigns() throws SQLException {
        ArrayList<CampaignDTO> fpc = new ArrayList();

        // 
        String variable = "*";
        String table = "CAMPAIGN";
        ResultSet rs = null;
        rs = connect.SelectFromDB(variable, table);

        while (rs.next()) {
            fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
        }

        return fpc;
    }

    public ArrayList<CampaignDTO> fetchPendingCampaignsForPartner(String partner) throws SQLException {
        ArrayList<CampaignDTO> fpc = new ArrayList();

        String variable = "*";
        String table = "CAMPAIGN WHERE PARTNER_NO = '" + partner + "'";
        ResultSet rs = null;
        rs = connect.SelectFromDB(variable, table);

        while (rs.next()) {
            fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
        }

        return fpc;
    }

    public String fetchPartnerNo(String username) throws SQLException {
        String variable = "partner_no";
        String table = "partner where username = '" + username + "'";
        ResultSet rs = null;
        rs = connect.SelectFromDB(variable, table);
        String out = "";

        StringBuilder builder = new StringBuilder();
        int columnCount = rs.getMetaData().getColumnCount();
        while (rs.next()) {
            for (int i = 0; i < columnCount; i++) {
                builder.append(rs.getString(i + 1));
            }
        }

        out = builder.toString();

        return out;
    }
}
