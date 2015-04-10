/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.MdfDTO;
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
 * @author Dennis
 */
public class Queries {

    ResultSet rs = null;

    public void connectToDatabase(PreparedStatement pstmt) throws SQLException {
        try (Connection con = DriverManager.getConnection(DB.URL, DB.user, DB.password)) {

            Class.forName(DB.driver);

            //  stmt.executeUpdate("INSERT INTO MDF VALUES ('2000-10-10', 'FSAF', 'GSA', 'sofar', 'KLGDS','41245','2000-10-10',4214,'2000-10-10','FDSF','2000-10-10','FSAF',0,0,0,0,0,0,0,'FDSF',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,'FSA',0,0,0,2141,4214,'FDSF','GDSG',324,235,235)");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addMdfRequestToDatabase(MdfDTO mdf) throws SQLException {

        Connection con = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        Long campaign_no = UUID.randomUUID().getMostSignificantBits();
        Long id_mdf = UUID.randomUUID().getMostSignificantBits();
        Long id_poe = UUID.randomUUID().getMostSignificantBits();

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "INSERT INTO MDF (ID_MDF, Submission_date, Company_address, Contact_name, Contact_email, Company_name, "
                    + "Contact_phone, Program_date, Estimated_attendees, Start_time, Venue_name, End_time, Venue_address, "
                    + "face_to_face, Tradeshows, Multi_touch_campaign, Door_opener_campaign, Third_party_campaign, Direct_mail, "
                    + "Blitz_campaign, description_agenda, Diss_Storage_1, Diss_Storage_2, Diss_Storage_3, Diss_Storage_4, "
                    + "Diss_Storage_5, Diss_Storage_6, Diss_Server_1, Diss_Server_2, Diss_Server_3, Diss_Server_4, Diss_Network_1, "
                    + "Diss_Network_2, Diss_Solutions_1, Diss_Solutions_2, Diss_Solutions_3, Diss_Solutions_4, Diss_Solutions_5, "
                    + "Diss_Solutions_6, Diss_text, Target_1, Target_2, Target_3, Additional_totalcost, Additional_totalmdf, "
                    + "Additional_reimbursement, Additional_participating, Additional_contribution, Additional_opportunities, "
                    + "Additional_revenue) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            String sql2 = "INSERT INTO CAMPAIGN (CAMPAIGN_NO, PARTNER_NO, ID_MDF, ID_POE) VALUES (?, ?, ?, ?)";

            stmt = con.prepareStatement(sql);
            stmt2 = con.prepareStatement(sql2);

            stmt2.setString(1, campaign_no.toString());
            stmt2.setString(2, "Ebbe");
            stmt2.setString(3, id_mdf.toString());
            stmt2.setString(4, id_poe.toString());

            stmt.setString(1, id_mdf.toString());
            stmt.setString(2, mdf.getSubmission_date());
            stmt.setString(3, mdf.getCompany_address());
            stmt.setString(4, mdf.getContact_name());
            stmt.setString(5, mdf.getContact_email());
            stmt.setString(6, mdf.getCompany_name());
            stmt.setString(7, mdf.getContact_phone());
            stmt.setString(8, mdf.getProgram_date());
            stmt.setString(9, mdf.getEstimated_attendees());
            stmt.setString(10, mdf.getStart_time());
            stmt.setString(11, mdf.getVenue_name());
            stmt.setString(12, mdf.getEnd_time());
            stmt.setString(13, mdf.getVenue_address());
            stmt.setString(14, mdf.getFace_to_face());
            stmt.setString(15, mdf.getTradeshows());
            stmt.setString(16, mdf.getMulti_touch_campaign());
            stmt.setString(17, mdf.getDoor_opener_campaign());
            stmt.setString(18, mdf.getThird_party_campaign());
            stmt.setString(19, mdf.getDirect_mail());
            stmt.setString(20, mdf.getBlitz_campaign());
            stmt.setString(21, mdf.getDescription_agenda());
            stmt.setString(22, mdf.getDiss_Storage_1());
            stmt.setString(23, mdf.getDiss_Storage_2());
            stmt.setString(24, mdf.getDiss_Storage_3());
            stmt.setString(25, mdf.getDiss_Storage_4());
            stmt.setString(26, mdf.getDiss_Storage_5());
            stmt.setString(27, mdf.getDiss_Storage_6());
            stmt.setString(28, mdf.getDiss_Server_1());
            stmt.setString(29, mdf.getDiss_Server_2());
            stmt.setString(30, mdf.getDiss_Server_3());
            stmt.setString(31, mdf.getDiss_Server_4());
            stmt.setString(32, mdf.getDiss_Network_1());
            stmt.setString(33, mdf.getDiss_Network_2());
            stmt.setString(34, mdf.getDiss_Solutions_1());
            stmt.setString(35, mdf.getDiss_Solutions_2());
            stmt.setString(36, mdf.getDiss_Solutions_3());
            stmt.setString(37, mdf.getDiss_Solutions_4());
            stmt.setString(38, mdf.getDiss_Solutions_5());
            stmt.setString(39, mdf.getDiss_Solutions_6());
            stmt.setString(40, mdf.getDiss_text());
            stmt.setString(41, mdf.getTarget_1());
            stmt.setString(42, mdf.getTarget_2());
            stmt.setString(43, mdf.getTarget_3());
            stmt.setString(44, mdf.getAdditional_totalcost());
            stmt.setString(45, mdf.getAdditional_totalmdf());
            stmt.setString(46, mdf.getAdditional_reimbursement());
            stmt.setString(47, mdf.getAdditional_participating());
            stmt.setString(48, mdf.getAdditional_contribution());
            stmt.setString(49, mdf.getAdditional_opportunities());
            stmt.setString(50, mdf.getAdditional_revenue());

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

    public void addPoERequestToDatabase(PoEDTO poe) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "INSERT INTO POE (ID_POE, campaign_type, activity, date, recipients, unique_opens_hits,"
                    + " unique_clicks, additional_information) VALUES (SEQ_POE.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";

            stmt = con.prepareStatement(sql);

            stmt.setString(1, poe.getCampaign_type());
            stmt.setString(2, poe.getActivity());
            stmt.setString(3, poe.getDate());
            stmt.setString(4, poe.getRecipients());
            stmt.setString(5, poe.getUnique_opens_hits());
            stmt.setString(6, poe.getUnique_clicks());
            stmt.setString(7, poe.getAdditional_information());

            stmt.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }

    }
}
