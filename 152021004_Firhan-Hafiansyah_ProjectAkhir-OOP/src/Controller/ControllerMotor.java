/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Motor;
import Database.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Firhan
 */
public class ControllerMotor {
    public List<Motor> getAllMotor(){
        List<Motor> lsMotor = new ArrayList<Motor>();
        String query = "Select * from tbl_motor";   // nama tabelnya Mahasiswa
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Motor mt = new Motor();
                mt.setIdMotor(rs.getString("idmotor"));
                mt.setNama(rs.getString("nama"));
                mt.setMerk(rs.getString("merk"));
                mt.setHarga(rs.getInt("harga"));
                mt.setStok(rs.getInt("stok"));
     
                lsMotor.add(mt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return lsMotor;
    }
}
