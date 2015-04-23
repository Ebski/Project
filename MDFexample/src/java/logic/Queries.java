/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.CampaignDTO;
import DTO.InvoiceDTO;
import DTO.MdfDTO;
import DTO.PoEDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class Queries {

    private ArrayList<String> mdfArrayList() {
        ArrayList al = new ArrayList();
        al.add("ID_MDF");
        al.add("Submission_date");
        al.add("Company_address");
        al.add("Contact_name");
        al.add("Contact_email");
        al.add("Company_name");
        al.add("Contact_phone");
        al.add("Program_date");
        al.add("Estimated_attendees");
        al.add("Start_time");
        al.add("Venue_name");
        al.add("End_time");
        al.add("Venue_address");
        al.add("face_to_face");
        al.add("Tradeshows");
        al.add("Multi_touch_campaign");
        al.add("Door_opener_campaign");
        al.add("Third_party_campaign");
        al.add("Direct_mail");
        al.add("Blitz_campaign");
        al.add("description_agenda");
        al.add("Diss_Storage_1");
        al.add("Diss_Storage_2");
        al.add("Diss_Storage_3");
        al.add("Diss_Storage_4");
        al.add("Diss_Storage_5");
        al.add("Diss_Storage_6");
        al.add("Diss_Server_1");
        al.add("Diss_Server_2");
        al.add("Diss_Server_3");
        al.add("Diss_Server_4");
        al.add("Diss_Network_1");
        al.add("Diss_Network_2");
        al.add("Diss_Solutions_1");
        al.add("Diss_Solutions_2");
        al.add("Diss_Solutions_3");
        al.add("Diss_Solutions_4");
        al.add("Diss_Solutions_5");
        al.add("Diss_Solutions_6");
        al.add("Diss_text");
        al.add("Target_1");
        al.add("Target_2");
        al.add("Target_3");
        al.add("Additional_totalcost");
        al.add("Additional_totalmdf");
        al.add("Additional_reimbursement");
        al.add("Additional_participating");
        al.add("Additional_contribution");
        al.add("Additional_opportunities");
        al.add("Additional_revenue");

        return al;
    }

    public void addMdfRequestToDatabase(MdfDTO mdf, CampaignDTO camp) throws SQLException {

        Connection con = null;
        PreparedStatement stmt = null;

        Long campaign_no = UUID.randomUUID().getMostSignificantBits();
        Long id_mdf = UUID.randomUUID().getMostSignificantBits();

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = makeSqlInsertString(mdfArrayList());

            stmt = con.prepareStatement(sql);

            camp.setCampaign_No(campaign_no.toString());
            mdf.setID_MDF(id_mdf.toString());

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

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }

    }

    public void addCampaignToDatabase(MdfDTO mdf, CampaignDTO camp) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;
        Long id_poe = UUID.randomUUID().getMostSignificantBits();
        Long id_invoice = UUID.randomUUID().getMostSignificantBits();

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "INSERT INTO POE (ID_POE) VALUES (?)";
            String sql2 = "INSERT INTO INVOICE (ID_INVOICE) VALUES (?)";
            String sql3 = "INSERT INTO CAMPAIGN (CAMPAIGN_NO, CAMPAIGN_NAME, PARTNER_NO, ID_MDF, ID_POE, ID_INVOICE, C_STATUS) VALUES (?, ?, ?, ?, ?, ?, ?)";

            stmt = con.prepareStatement(sql);
            stmt2 = con.prepareStatement(sql2);
            stmt3 = con.prepareStatement(sql3);

            stmt.setString(1, id_poe.toString());
            
            stmt2.setString(1, id_invoice.toString());

            stmt3.setString(1, camp.getCampaign_No());
            stmt3.setString(2, camp.getCampaign_Name());
            stmt3.setString(3, camp.getPartner_No());
            stmt3.setString(4, mdf.getID_MDF());
            stmt3.setString(5, id_poe.toString());
            stmt3.setString(6, id_invoice.toString());
            stmt3.setInt(7, 0);

            stmt.executeQuery();
            stmt2.executeQuery();
            stmt3.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            stmt2.close();
            stmt3.close();
        }
    }

    public void addPoERequestToDatabase(PoEDTO poe) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE POE "
                    + "SET campaign_type = ?, activity = ?, POE_date = ?, recipients = ?, unique_opens_hits = ?, "
                    + "unique_clicks = ?, additional_information = ?, filepath = ?"
                    + " WHERE ID_POE = ?";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, poe.getCampaign_type());
            stmt.setString(2, poe.getActivity());
            stmt.setString(3, poe.getDate());
            stmt.setString(4, poe.getRecipients());
            stmt.setString(5, poe.getUnique_opens_hits());
            stmt.setString(6, poe.getUnique_clicks());
            stmt.setString(7, poe.getAdditional_information());
            stmt.setString(8, poe.getFilepath());
            stmt.setString(9, poe.getPoe_ID());

            stmt.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }

    }

    public void addInvoiceToDatabase(InvoiceDTO invoice) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "UPDATE INVOICE "
                    + "SET FILEPATH = ?, ADDITIONAL_INFORMATION = ?"
                    + " WHERE ID_INVOICE = ?";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, invoice.getFilepath());
            stmt.setString(2, invoice.getAdditional_information());
            stmt.setString(3, invoice.getID_invoice());

            stmt.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
        }

    }

    public ArrayList<CampaignDTO> fetchPendingCampaigns(String partner) throws SQLException {
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
                fpc.add(new CampaignDTO(rs.getString("campaign_No"), rs.getString("campaign_Name"), rs.getString("partner_No"), rs.getString("id_MDF"), rs.getString("id_POE"), rs.getString("id_invoice"), rs.getString("c_Status")));
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

    private String makeSqlInsertString(ArrayList<String> al) {
        if (al.isEmpty()) {
            return "";
        }
        String sql = "";
        String variable = "";
        String values = "";
        for (String s : al) {
            variable += s + ",";
            values += "?,";
        }
        if (variable.length() > 0 && variable.charAt(variable.length() - 1) == ',') {
            variable = variable.substring(0, variable.length() - 1);
        }
        if (values.length() > 0 && values.charAt(values.length() - 1) == ',') {
            values = values.substring(0, values.length() - 1);
        }
        sql = "INSERT INTO MDF (" + variable + ") VALUES (" + values + ")";
        return sql;
    }

}
