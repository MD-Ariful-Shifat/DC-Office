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
    
    private String eventTextField,dateTextField,timeTextFiled,locationTextField;

    public DCEventModel(String eventTextField, String dateTextField, String timeTextFiled, String locationTextField) {
        this.eventTextField = eventTextField;
        this.dateTextField = dateTextField;
        this.timeTextFiled = timeTextFiled;
        this.locationTextField = locationTextField;
    }

    public String getEventTextField() {
        return eventTextField;
    }

    public void setEventTextField(String eventTextField) {
        this.eventTextField = eventTextField;
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

    public String getLocationTextField() {
        return locationTextField;
    }

    public void setLocationTextField(String locationTextField) {
        this.locationTextField = locationTextField;
    }

    @Override
    public String toString() {
        return "DCEventModel{" + "eventTextField=" + eventTextField + ", dateTextField=" + dateTextField + ", timeTextFiled=" + timeTextFiled + ", locationTextField=" + locationTextField + '}';
    }
    public void display(){
        System.out.println("eventTextField="+eventTextField+", dateTextField="+dateTextField+", timeTextFiled="+timeTextFiled+",locationTextField="+locationTextField);
    }    
    
}