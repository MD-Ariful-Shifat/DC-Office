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
    
    private String eventColumn,dateColumn,timeColumn,locationColumn;

    public DCEventModel(String eventColumn, String dateColumn, String timeColumn, String locationColumn) {
        this.eventColumn = eventColumn;
        this.dateColumn = dateColumn;
        this.timeColumn = timeColumn;
        this.locationColumn = locationColumn;
    }

    public String getEventColumn() {
        return eventColumn;
    }

    public void setEventColumn(String eventColumn) {
        this.eventColumn = eventColumn;
    }

    public String getDateColumn() {
        return dateColumn;
    }

    public void setDateColumn(String dateColumn) {
        this.dateColumn = dateColumn;
    }

    public String getTimeColumn() {
        return timeColumn;
    }

    public void setTimeColumn(String timeColumn) {
        this.timeColumn = timeColumn;
    }

    public String getLocationColumn() {
        return locationColumn;
    }

    public void setLocationColumn(String locationColumn) {
        this.locationColumn = locationColumn;
    }

    @Override
    public String toString() {
        return "DCEventModel{" + "eventColumn=" + eventColumn + ", dateColumn=" + dateColumn + ", timeColumn=" + timeColumn + ", locationColumn=" + locationColumn + '}';
    }
    public void display(){
        System.out.println("eventColumn="+eventColumn+", dateColumn="+dateColumn+", timeColumn="+timeColumn+",locationColumn="+locationColumn);
    }

    
}
