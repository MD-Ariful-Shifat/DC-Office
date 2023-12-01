/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author USER
 */

public abstract class User implements Serializable{
    private static final long serialVersionUID = 5L;
//    DC, Senior Assistant Comissionar, Administrative Assistant, ADC, DM, SAC(edu), UNO, DRRO
    protected int userID;
    protected String password, name, address, contact, email;
    protected LocalDate DOB;
    protected String area;

    public User(int userID, String password, String name, String address, String contact, LocalDate DOB, String area) {
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.DOB = DOB;
        this.area = area;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", password=" + password + ", name=" + name + ", address=" + address + ", contact=" + contact + ", DOB=" + DOB + ", area=" + area + '}';
    }
    
    public static User login(int userID, String password){
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File("Users.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User temp = null;
            try{
                while(true){
                    temp = (User) ois.readObject();
                    System.out.println("User stored :");
                    if (userID==temp.getUserID() && password.equals(temp.getPassword())){
                        return temp;
                    }
                }
            }
            catch(IOException | ClassNotFoundException e){}
        } catch (IOException ex) {}
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        return null;
    }
    
}
