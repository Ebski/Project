/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.MdfDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class FetchMdfViewNew {
    public MdfDTO fetchMdf(String id_MDF) throws SQLException {
        MdfDTO mdf = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select * from mdf where ID_MDF =" + id_MDF;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                mdf = new MdfDTO(
                        rs.getString("ID_MDF"),
                        rs.getString("Submission_date"),
                        rs.getString("Company_address"),
                        rs.getString("Contact_name"),
                        rs.getString("Contact_email"),
                        rs.getString("Company_name"),
                        rs.getString("Contact_phone"),
                        rs.getString("Program_date"),
                        rs.getString("Estimated_attendees"),
                        rs.getString("Start_time"),
                        rs.getString("Venue_name"),
                        rs.getString("End_time"),
                        rs.getString("Venue_address"),
                        rs.getString("face_to_face"),
                        rs.getString("Tradeshows"),
                        rs.getString("Multi_touch_campaign"),
                        rs.getString("Door_opener_campaign"),
                        rs.getString("Third_party_campaign"),
                        rs.getString("Direct_mail"),
                        rs.getString("Blitz_campaign"),
                        rs.getString("description_agenda"),
                        rs.getString("Diss_Storage_1"),
                        rs.getString("Diss_Storage_2"),
                        rs.getString("Diss_Storage_3"),
                        rs.getString("Diss_Storage_4"),
                        rs.getString("Diss_Storage_5"),
                        rs.getString("Diss_Storage_6"),
                        rs.getString("Diss_Server_1"),
                        rs.getString("Diss_Server_2"),
                        rs.getString("Diss_Server_3"),
                        rs.getString("Diss_Server_4"),
                        rs.getString("Diss_Network_1"),
                        rs.getString("Diss_Network_2"),
                        rs.getString("Diss_Solutions_1"),
                        rs.getString("Diss_Solutions_2"),
                        rs.getString("Diss_Solutions_3"),
                        rs.getString("Diss_Solutions_4"),
                        rs.getString("Diss_Solutions_5"),
                        rs.getString("Diss_Solutions_6"),
                        rs.getString("Diss_text"),
                        rs.getString("Target_1"),
                        rs.getString("Target_2"),
                        rs.getString("Target_3"),
                        rs.getString("Additional_totalcost"),
                        rs.getString("Additional_totalmdf"),
                        rs.getString("Additional_reimbursement"),
                        rs.getString("Additional_participating"),
                        rs.getString("Additional_contribution"),
                        rs.getString("Additional_opportunities"),
                        rs.getString("Additional_revenue")
                );

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FetchRequest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return mdf;
    }
}
