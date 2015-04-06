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
public class Queries {

    Statement stmt = null;
    ResultSet rs = null;

    private void connectToDatabase(String query) throws SQLException {
        try(Connection con = DriverManager.getConnection(DB.URL, DB.user, DB.password)) {

            Class.forName(DB.driver);


            stmt = con.createStatement();

            con.prepareStatement(query);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addMdfRequestToDatabase(MdfDTO mdf) throws SQLException {
        String query = "INSERT INTO MDF VALUES('" + mdf.getSubmission_date()
                + "','" + mdf.getCompany_address() + "','"
                + mdf.getContact_name()
                + "','" + mdf.getContact_email()
                + "','" + mdf.getCompany_name()
                + "','" + mdf.getContact_phone()
                + "','" + mdf.getProgram_date()
                + "'," + mdf.getEstimated_attendees()
                + ",'" + mdf.getStart_time()
                + "','" + mdf.getVenue_name()
                + "','" + mdf.getEnd_time()
                + "','" + mdf.getVenue_address()
                + "'," + mdf.getFace_to_face()
                + "," + mdf.getTradeshows()
                + "," + mdf.getMutli_touch_campaign()
                + "," + mdf.getDoor_opener_campaign()
                + "," + mdf.getThird_party_campaign()
                + "," + mdf.getDirect_mail()
                + "," + mdf.getBlitz_campaign()
                + ",'" + mdf.getDescription_agenda()
                + "'," + mdf.getDiss_Storage_1()
                + "," + mdf.getDiss_Storage_2()
                + "," + mdf.getDiss_Storage_3()
                + "," + mdf.getDiss_Storage_4()
                + "," + mdf.getDiss_Storage_5()
                + "," + mdf.getDiss_Storage_6()
                + "," + mdf.getDiss_Server_1()
                + "," + mdf.getDiss_Server_2()
                + "," + mdf.getDiss_Server_3()
                + "," + mdf.getDiss_Server_4()
                + "," + mdf.getDiss_Network_1()
                + "," + mdf.getDiss_Network_2()
                + "," + mdf.getDiss_Solutions_1()
                + "," + mdf.getDiss_Solutions_2()
                + "," + mdf.getDiss_Solutions_3()
                + "," + mdf.getDiss_Solutions_4()
                + "," + mdf.getDiss_Solutions_5()
                + "," + mdf.getDiss_Solutions_6()
                + ",'" + mdf.getDiss_text()
                + "'," + mdf.getAdditional_totalcost()
                + "," + mdf.getAdditional_totalmdf()
                + ",'" + mdf.getAdditional_reimbursement()
                + "','" + mdf.getAdditional_contribution()
                + "','" + mdf.getAdditional_opportunities()
                + "','" + mdf.getAdditional_revenue() + ");";

        connectToDatabase(query);
    }

}
