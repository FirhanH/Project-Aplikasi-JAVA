/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Firhan
 */
public class Transaksi {
    private int idtransaksi;
    private String waktu;
    private String username;
    private String idmotor;
    private String nama;
    private String merk;
    private int jumlah;
    private int totalharga;

    public Transaksi() {
    }

    public Transaksi(String waktu, String username, String idmotor, String nama, String merk, int jumlah, int totalharga) {
        this.waktu = waktu;
        this.username = username;
        this.idmotor = idmotor;
        this.nama = nama;
        this.merk = merk;
        this.jumlah = jumlah;
        this.totalharga = totalharga;
    }

    public int getIdtransaksi() {
        return idtransaksi;
    }

    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdmotor() {
        return idmotor;
    }

    public void setIdmotor(String idmotor) {
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

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(int totalharga) {
        this.totalharga = totalharga;
    }

    @Override
    public String toString() {
        return "Transaksi{" + "idtransaksi=" + idtransaksi + ", waktu=" + waktu + ", username=" + username + ", idmotor=" + idmotor + ", nama=" + nama + ", merk=" + merk + ", jumlah=" + jumlah + ", totalharga=" + totalharga + '}';
    }
}
