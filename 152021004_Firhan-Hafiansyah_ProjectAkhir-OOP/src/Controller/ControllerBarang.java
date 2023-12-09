/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.ConnectionManager;
import Models.Barang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FIRHAN
 */
public class ControllerBarang {
    public java.util.List<Barang> getAllBarang(){
        java.util.List<Barang> lsBarang = new ArrayList<Barang>();
        String query = "Select * from tbl_barang";   // nama tabelnya Mahasiswa
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Barang barang = new Barang();
                barang.setMotor(rs.getInt("motor_id"));
                barang.setNama(rs.getString("nama"));
                barang.setMerk(rs.getString("merk"));
                barang.setHarga(rs.getInt("harga"));
                barang.setStok(rs.getInt("stok"));
     
                lsBarang.add(barang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return lsBarang;
    }
    
    public int CreateBarang(Barang barang){
        int hasil = 0;
        // buka koneksi
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "INSERT INTO tbl_barang(motor_id, nama, merk, harga, stok)"
        + "values('"+ barang.getMotor_id() +"', '"+ barang.getNama() +"', '"
        + barang.getMerk() +"', '"+ barang.getHarga() +"', '"+ barang.getStok() +"')";


        
        try {
            Statement stm =conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int UpdateBarang(Barang barang){
        int hasil = 0;
        String query = "UPDATE tbl_barang SET nama = '" + barang.getNama() + "', merk = '" + barang.getMerk() + "', harga = '" + barang.getHarga() + "', stok = '" + barang.getStok() + "' WHERE motor_id = '" + barang.getMotor_id() + "'";
        
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
    
    public int DeleteBarang(Barang barang){
        int hasil = 0;
        String motor_id = null;
        String query = "DELETE FROM tbl_barang WHERE motor_id = '"+ motor_id +"'";

        
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
