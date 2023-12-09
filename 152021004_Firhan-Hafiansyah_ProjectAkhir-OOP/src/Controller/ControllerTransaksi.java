/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Transaksi;
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
public class ControllerTransaksi {
    public List<Transaksi> getAllTransaksi(){
        List<Transaksi> lsTransaksi = new ArrayList<Transaksi>();
        String query = "Select * from tbl_transaksi";
        String waktu, username, idmotor, nama, merk;
        int idtransaksi, jumlah, totalharga;
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                idtransaksi = rs.getInt("idtransaksi");
                waktu = rs.getString("waktu");
                username = rs.getString("username");
                idmotor = rs.getString("idmotor");
                nama = rs.getString("nama");
                merk = rs.getString("merk");
                jumlah = rs.getInt("jumlah");
                totalharga = rs.getInt("totalharga");
//                Transaksi transaksi = new Transaksi(waktu, username, kode_barang, nama_barang, jumlah, total_harga);
                Transaksi transaksi = new Transaksi();
                transaksi.setIdtransaksi(idtransaksi);
                transaksi.setWaktu(waktu);
                transaksi.setUsername(username);
                transaksi.setIdmotor(idmotor);
                transaksi.setNama(nama);
                transaksi.setJumlah(jumlah);
                transaksi.setTotalharga(totalharga);
                
                lsTransaksi.add(transaksi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lsTransaksi;
    }
    
    public List<Transaksi> getUserTransaksi(String username){
        List<Transaksi> lsTransaksi = new ArrayList<Transaksi>();
        String query = "SELECT * FROM tbl_transaksi WHERE username = ?";
        String waktu, idmotor, nama, merk;
        int idtransaksi, jumlah, totalharga;
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                idtransaksi = rs.getInt("idtransaksi");
                waktu = rs.getString("waktu");
                idmotor = rs.getString("idmotor");
                nama = rs.getString("nama");
                merk = rs.getString("merk");
                jumlah = rs.getInt("jumlah");
                totalharga = rs.getInt("totalharga");
                Transaksi transaksi = new Transaksi();
                transaksi.setIdtransaksi(idtransaksi);
                transaksi.setWaktu(waktu);
                transaksi.setIdmotor(idmotor);
                transaksi.setNama(nama);
                transaksi.setJumlah(jumlah);
                transaksi.setTotalharga(totalharga);
                
                lsTransaksi.add(transaksi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControllerTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lsTransaksi;
    }
    
    public int simpanTransaksi(Transaksi transaksi){
        int hasil = 0;
        String query = "INSERT INTO tbl_transaksi (idtransaksi, waktu, username, idmotor, nama, merk, jumlah, totalharga) VALUES "
                + "('" + transaksi.getIdtransaksi() + "','" + transaksi.getWaktu() + "','" + transaksi.getUsername() + "','" 
                + transaksi.getIdmotor() + "','" + transaksi.getNama() + "','" + transaksi.getMerk() +"','" + transaksi.getJumlah() + "','" 
                + transaksi.getTotalharga() +"')";
        
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conMan.logOff();
        return hasil;

    }
    
}
