/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class UnoEventModel implements Serializable{
        private String VillagersTextField; 

    public UnoEventModel(String VillagersTextField) {
        this.VillagersTextField = VillagersTextField;
    }

    public String getVillagersTextField() {
        return VillagersTextField;
    }

    public void setVillagersTextField(String VillagersTextField) {
        this.VillagersTextField = VillagersTextField;
    }

    @Override
    public String toString() {
        return "UnoEventModel{" + "VillagersTextField=" + VillagersTextField + '}';
    }

        
}
