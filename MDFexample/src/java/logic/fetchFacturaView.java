/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.FacturaDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ebbe
 */
public class fetchFacturaView {
    
        public FacturaDTO fetchFactura(String id_factura) throws SQLException {
        FacturaDTO factura = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

          try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "Select * from FACTURA where ID_FACTURA =" + id_factura;

            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                factura = new FacturaDTO(
                        rs.getString("id_factura"),
                        rs.getString("filepath"),
                        rs.getString("additional_information")
                );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fetchPoeView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        return factura;
    }
}
