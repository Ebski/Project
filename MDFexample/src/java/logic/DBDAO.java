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
    
//    DBDAO connect = new DBDAO();
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
//                fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("id_factura"), rs.getString("c_Status")));
//            }
//
//        return fpc;
//    }
}
