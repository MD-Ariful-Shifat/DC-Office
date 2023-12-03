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
public class DrroDevelopmentModel implements Serializable{
    
    private String VillagersTextField; 
    private String RoadsTextField;
    private String PondsTextField;
    private String YearTextField;

    public DrroDevelopmentModel(String VillagersTextField, String RoadsTextField, String PondsTextField, String YearTextField) {
        this.VillagersTextField = VillagersTextField;
        this.RoadsTextField = RoadsTextField;
        this.PondsTextField = PondsTextField;
        this.YearTextField = YearTextField;
    }

    public String getVillagersTextField() {
        return VillagersTextField;
    }

    public String getRoadsTextField() {
        return RoadsTextField;
    }

    public String getPondsTextField() {
        return PondsTextField;
    }

    public String getYearTextField() {
        return YearTextField;
    }

    public void setVillagersTextField(String VillagersTextField) {
        this.VillagersTextField = VillagersTextField;
    }

    public void setRoadsTextField(String RoadsTextField) {
        this.RoadsTextField = RoadsTextField;
    }

    public void setPondsTextField(String PondsTextField) {
        this.PondsTextField = PondsTextField;
    }

    public void setYearTextField(String YearTextField) {
        this.YearTextField = YearTextField;
    }

    @Override
    public String toString() {
        return "DrroDevelopmentModel{" + "VillagersTextField=" + VillagersTextField + ", RoadsTextField=" + RoadsTextField + ", PondsTextField=" + PondsTextField + ", YearTextField=" + YearTextField + '}';
    }

        
    public void display(){
        System.out.println("VillagersTextField="+VillagersTextField+", RoadsTextField="+RoadsTextField+", PondsTextField="+PondsTextField+",YearTextField="+YearTextField);
    }
    
}
