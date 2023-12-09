/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author FIRHAN
 */
public class Barang {
    private int motor_id;
    private String nama;
    private String merk;
    private int harga;
    private int stok;

    public Barang() {
    }

    public Barang(int user_id) {
        this.motor_id = motor_id;
    }
    
    public Barang(int motor_id, String nama, String merk, int harga, int stok) {
        this.motor_id = motor_id;
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
        this.stok = stok;
    }

    public Barang(String nama, String merk, int harga, int stok) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
        this.stok = stok;
    }

    public Barang(int motor_id, String nama, String merk, int harga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMotor_id() {
        return motor_id;
    }

    public void setMotor(int motor_id) {
        this.motor_id = motor_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "ID motor{" + "motor_id=" + motor_id + ", nama=" + nama + ", merk=" + merk + ", harga=" + harga + ", stok=" + stok + '}';
    }
    
    
    
}
