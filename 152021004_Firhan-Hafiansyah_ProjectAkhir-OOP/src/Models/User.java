/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Firhan
 */
public class User {
    private int user_id;
    private String nama;
    private String email;
    private int no_hp;
    private String username;
    private String password;

    public User() {
    }

    public User(int user_id) {
        this.user_id = user_id;
    }
    
    public User(int user_id, String nama, String email, int no_hp, String username, String password) {
        this.user_id = user_id;
        this.nama = nama;
        this.email = email;
        this.no_hp = no_hp;
        this.username = username;
        this.password = password;
    }

    public User(String nama, String email, int no_hp, String username, String password) {
        this.nama = nama;
        this.email = email;
        this.no_hp = no_hp;
        this.username = username;
        this.password = password;
    }

    public User(int user_id, String nama, String email, int nohp, String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User(int user_id, String nama, int nohp, String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", nama=" + nama + ", email=" + email + ", no_hp=" + no_hp + ", username=" + username + ", password=" + password + '}';
    }
    
    
    
}
