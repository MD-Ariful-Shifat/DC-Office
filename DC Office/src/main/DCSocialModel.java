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
public class DCSocialModel implements Serializable  {
    
    private String eventColumn,timeColumn,dateColumn,locationColumn;

    public DCSocialModel(String eventColumn, String timeColumn, String dateColumn, String locationColumn) {
        this.eventColumn = eventColumn;
        this.timeColumn = timeColumn;
        this.dateColumn = dateColumn;
        this.locationColumn = locationColumn;
    }

    public String getEventColumn() {
        return eventColumn;
    }

    public void setEventColumn(String eventColumn) {
        this.eventColumn = eventColumn;
    }

    public String getTimeColumn() {
        return timeColumn;
    }

    public void setTimeColumn(String timeColumn) {
        this.timeColumn = timeColumn;
    }

    public String getDateColumn() {
        return dateColumn;
    }

    public void setDateColumn(String dateColumn) {
        this.dateColumn = dateColumn;
    }

    public String getLocationColumn() {
        return locationColumn;
    }

    public void setLocationColumn(String locationColumn) {
        this.locationColumn = locationColumn;
    }

    @Override
    public String toString() {
        return "DCSocialModel{" + "eventColumn=" + eventColumn + ", timeColumn=" + timeColumn + ", dateColumn=" + dateColumn + ", locationColumn=" + locationColumn + '}';
    }
    public void display(){
        System.out.println("eventColumn="+eventColumn+", timeColumn="+timeColumn+", dateColumn="+dateColumn+",locationColumn="+locationColumn);
    }

}