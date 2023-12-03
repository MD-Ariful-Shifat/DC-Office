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
public class DCEventModel implements Serializable  {
    
    private String eventTextField,locationTextField,dateTextField,timeTextFiled;

    public DCEventModel(String eventTextField, String locationTextField, String dateTextField, String timeTextFiled) {
        this.eventTextField = eventTextField;
        this.locationTextField = locationTextField;
        this.dateTextField = dateTextField;
        this.timeTextFiled = timeTextFiled;
    }

    public String getEventTextField() {
        return eventTextField;
    }

    public void setEventTextField(String eventTextField) {
        this.eventTextField = eventTextField;
    }

    public String getLocationTextField() {
        return locationTextField;
    }

    public void setLocationTextField(String locationTextField) {
        this.locationTextField = locationTextField;
    }

    public String getDateTextField() {
        return dateTextField;
    }

    public void setDateTextField(String dateTextField) {
        this.dateTextField = dateTextField;
    }

    public String getTimeTextFiled() {
        return timeTextFiled;
    }

    public void setTimeTextFiled(String timeTextFiled) {
        this.timeTextFiled = timeTextFiled;
    }

    @Override
    public String toString() {
        return "DCEventModel{" + "eventTextField=" + eventTextField + ", locationTextField=" + locationTextField + ", dateTextField=" + dateTextField + ", timeTextFiled=" + timeTextFiled + '}';
    }
    public void display(){
        System.out.println("eventTextField="+eventTextField+", locationTextField="+locationTextField+", dateTextField="+dateTextField+",timeTextFiled="+timeTextFiled);
    }
}