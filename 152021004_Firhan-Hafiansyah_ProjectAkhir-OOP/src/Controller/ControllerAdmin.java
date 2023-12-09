/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Admin;
import Database.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Firhan
 */
public class ControllerAdmin {
    public java.util.List<Admin> getAllAdmin(){
        java.util.List<Admin> lsAdmin = new ArrayList<Admin>();
        String query = "Select * from tbl_admin";   // nama tabelnya Mahasiswa
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Admin admin = new Admin();
                admin.setUser_id(rs.getInt("iduser"));
                admin.setNama(rs.getString("nama"));
                admin.setEmail(rs.getString("email"));
                admin.setNo_hp(rs.getInt("nohp"));
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
     
                lsAdmin.add(admin);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return lsAdmin;
    }
    
    public int CreateAdmin(Admin admin){
        int hasil = 0;
        // buka koneksi
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "INSERT INTO tbl_admin(nama, email, nohp, username, password)"
                + "values('"+ admin.getNama() +"', '"+ admin.getEmail()+"', '"
                + admin.getNo_hp()+"', '"+ admin.getUsername()+"', '"+ admin.getPassword()+"')";
        
        try {
            Statement stm =conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
