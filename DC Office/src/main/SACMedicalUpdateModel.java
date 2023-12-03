/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class SACMedicalUpdateModel implements Serializable  {
    
    private String mediColumn,hotColumn,locationColumn;

    public SACMedicalUpdateModel(String mediColumn, String hotColumn, String locationColumn) {
        this.mediColumn = mediColumn;
        this.hotColumn = hotColumn;
        this.locationColumn = locationColumn;
    }

    public String getMediColumn() {
        return mediColumn;
    }

    public void setMediColumn(String mediColumn) {
        this.mediColumn = mediColumn;
    }

    public String getHotColumn() {
        return hotColumn;
    }

    public void setHotColumn(String hotColumn) {
        this.hotColumn = hotColumn;
    }

    public String getLocationColumn() {
        return locationColumn;
    }

    public void setLocationColumn(String locationColumn) {
        this.locationColumn = locationColumn;
    }

    @Override
    public String toString() {
        return "SACMedicalUpdateModel{" + "mediColumn=" + mediColumn + ", hotColumn=" + hotColumn + ", locationColumn=" + locationColumn + '}';
    }
   public void display(){
        System.out.println("mediColumn="+mediColumn+", hotColumn="+hotColumn+", locationColumn="+locationColumn);
    }
}