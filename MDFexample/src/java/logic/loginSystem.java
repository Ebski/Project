/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.PoEDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class LoginSystem {
    
    public String login(String user, String pass) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String result = "0";

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.user, DB.password);

            String sql = "SELECT * FROM USERPASS WHERE USERNAME = '"+user+"' AND PASSWORD = '"+pass+"'";

            System.out.println(sql);
            
            stmt = con.createStatement();

            rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                result = rs.getString(3); //refere til status for login 1(medarbejder) eller 2(partner)
            }
            
            
           return result;
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.close();
            stmt.close();
            rs.close();
        }
        
        return result;

    }
}
