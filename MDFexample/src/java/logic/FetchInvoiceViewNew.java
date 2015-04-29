/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.InvoiceDTO;
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
public class FetchInvoiceViewNew {
    public InvoiceDTO fetchInvoice(String id_invoice) throws SQLException {
        InvoiceDTO invoice = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

          try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select * from INVOICE where ID_INVOICE =" + id_invoice;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                invoice = new InvoiceDTO(
                        rs.getString("id_invoice"),
                        rs.getString("filepath"),
                        rs.getString("additional_information")
                );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FetchPoeViewNew.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return invoice;
    }
}
