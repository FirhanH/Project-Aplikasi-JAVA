/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.ConnectionManager;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Models.User;

/**
 *
 * @author Firhan
 */
public class ControllerUser {
    public java.util.List<User> getAllUser(){
        java.util.List<User> lsUser = new ArrayList<User>();
        String query = "Select * from tbl_user";   // nama tabelnya Mahasiswa
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                User user = new User();
                user.setUser_id(rs.getInt("user_id"));
                user.setNama(rs.getString("nama"));
                user.setEmail(rs.getString("email"));
                user.setNo_hp(rs.getInt("no_hp"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
     
                lsUser.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return lsUser;
    }
    
    public int CreateUser(User user){
        int hasil = 0;
        // buka koneksi
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "INSERT INTO tbl_user(nama, email, no_hp, username, password)"
                + "values('"+ user.getNama() +"', '"+ user.getEmail()+"', '"
                + user.getNo_hp()+"', '"+ user.getUsername()+"', '"+ user.getPassword()+"')";
        
        try {
            Statement stm =conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int UpdateUser(User user){
        int hasil = 0;
        String query = "UPDATE tbl_user SET nama = '" + user.getNama() + "', email = '" + user.getEmail() + "', no_hp = '" + user.getNo_hp() + "', username = '" + user.getUsername() + "', password = '" + user.getPassword() + "' WHERE user_id = '" + user.getUser_id() + "'";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;
    }
    
    public int DeleteUser(String user_id){
        int hasil = 0;
        String query = "DELETE FROM tbl_user WHERE user_id = '"+ user_id +"'";

        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
