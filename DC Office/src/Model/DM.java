/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author sadia
 */
public class DM extends User implements Serializable{
    private static final long serialVersionUID = 5L;

    public DM(int userID, String password, String name, String address, String contact, LocalDate DOB, String area) {
        super(userID, password, name, address, contact, DOB, area);
    }

    @Override
    public String toString() {
        return "DM{" + "userID=" + userID + ", password=" + password + ", name=" + name + ", address=" + address + ", contact=" + contact + ", DOB=" + DOB + ", area=" + area + '}';
    }
    
     
    
}
