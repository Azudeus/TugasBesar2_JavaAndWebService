/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.account;

import java.sql.*;

/**
 *
 * @author Personal
 */
import java.util.logging.Level;
import java.util.logging.Logger;
public class Login {
    
    
    public static boolean checkUser(String email, String password) {
        
        boolean st=false;
        try {            
            //loading drivers for mysql
            Connection con = DBConnect.connect();
            PreparedStatement ps =con.prepareStatement
                ("select * from account where email=? and password=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            st = rs.next();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st;
    }
       
}
