/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Firhan
 */
public class Motor {
    private String idmotor;
    private String nama;
    private String merk;
    private int harga;
    private int stok;

    public Motor() {
    }

    public Motor(String idmotor, String nama, String merk, int harga, int stok) {
        this.idmotor = idmotor;
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
        this.stok = stok;
    }

    public String getIdMotor() {
        return idmotor;
    }

    public void setIdMotor(String idmotor) {
        this.idmotor = idmotor;
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
        return "Motor{" + "idmotor=" + idmotor + ", nama=" + nama + ", merk=" + merk + ", harga=" + harga + ", stok=" + stok + '}';
    }

    
}
