/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rvz
 */
public class DBDAO {

    public ResultSet SelectFromDB(String variable, String table) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT " + variable + " FROM " + table;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return rs;
    }

    public void updateDB(String query) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        String update = "update";

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            stmt = con.createStatement();

            stmt.executeQuery(update + " "+ query);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }
    }
//DBDAO connect = new DBDAO();
//
//    public ArrayList<CampaignDTO> fetchPendingCampaigns() throws SQLException {
//        ArrayList<CampaignDTO> fpc = new ArrayList();
//
//        // 
//        String variable = "*";
//        String table = "CAMPAIGN";
//        ResultSet rs = null;
//        rs = connect.SelectFromDB(variable, table);
//
//        while (rs.next()) {
//            fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
//        }
//
//        return fpc;
//    }
//
//    public ArrayList<CampaignDTO> fetchPendingCampaignsForPartner(String partner) throws SQLException {
//        ArrayList<CampaignDTO> fpc = new ArrayList();
//
//        String variable = "*";
//        String table = "CAMPAIGN WHERE PARTNER_NO = '" + partner + "'";
//        ResultSet rs = null;
//        rs = connect.SelectFromDB(variable, table);
//
//        while (rs.next()) {
//            fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
//        }
//
//        return fpc;
//    }
//
//    public String fetchPartnerNo(String username) throws SQLException {
//        String variable = "partner_no";
//        String table = "partner where username = '" + username + "'";
//        ResultSet rs = null;
//        rs = connect.SelectFromDB(variable, table);
//        String out = "";
//
//        StringBuilder builder = new StringBuilder();
//        int columnCount = rs.getMetaData().getColumnCount();
//        while (rs.next()) {
//            for (int i = 0; i < columnCount; i++) {
//                builder.append(rs.getString(i + 1));
//            }
//        }
//
//        out = builder.toString();
//
//        return out;
//    }
//}
}
//public ArrayList<CampaignDTO> fetchPendingCampaigns(String partner) throws SQLException {
//        ArrayList<CampaignDTO> fpc = new ArrayList();
//
//        String variable = "*";
//        String table = "CAMPAIGN";
//        ResultSet rs = null;
//        rs = connect.SelectFromDB(variable, table);
//
//        while (rs.next()) {
//            fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
//        }
//
//        return fpc;
//    }
//
//    public ArrayList<quarterDTO> fetchQuarters() throws SQLException {
//
//        ArrayList<quarterDTO> fpq = new ArrayList<>();
//
//        String variable = "*";
//        String table = "QUARTERS";
//        ResultSet rs = null;
//        rs = connect.SelectFromDB(variable, table);
//
//        while (rs.next()) {
//            fpq.add(new quarterDTO(
//                    rs.getString("quarter_Name"),
//                    rs.getString("quarter_Startdate"),
//                    rs.getString("quarters_Enddate")));
//        }
//
//        return fpq;
//    }
//
//    private String makeSqlInsertString(ArrayList<String> al) {
//        if (al.isEmpty()) {
//            return "";
//        }
//        String sql = "";
//        String variable = "";
//        String values = "";
//        for (String s : al) {
//            variable += s + ",";
//            values += "?,";
//        }
//        if (variable.length() > 0 && variable.charAt(variable.length() - 1) == ',') {
//            variable = variable.substring(0, variable.length() - 1);
//        }
//        if (values.length() > 0 && values.charAt(values.length() - 1) == ',') {
//            values = values.substring(0, values.length() - 1);
//        }
//        sql = "INSERT INTO MDF (" + variable + ") VALUES (" + values + ")";
//        return sql;
//    }
//
//}