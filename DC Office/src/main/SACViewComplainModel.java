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
public class SACViewComplainModel implements Serializable  {
    
    private String complainColumn,contactColumn,addressColumn,personcolumn;

    public SACViewComplainModel(String complainColumn, String contactColumn, String addressColumn, String personcolumn) {
        this.complainColumn = complainColumn;
        this.contactColumn = contactColumn;
        this.addressColumn = addressColumn;
        this.addressColumn = personcolumn;
    }

    public String getSchoolcolumn() {
        return complainColumn;
    }

    public String getPrincipalColumn() {
        return contactColumn;
    }

    public String getHotlineColumn() {
        return addressColumn;
    }

    public String getAddressColumn() {
        return personcolumn;
    }

    public void setSchoolcolumn(String schoolcolumn) {
        this.complainColumn = complainColumn;
    }

    public void setPrincipalColumn(String principalColumn) {
        this.contactColumn = contactColumn;
    }

    public void setHotlineColumn(String hotlineColumn) {
        this.addressColumn = addressColumn;
    }

    public void setAddressColumn(String addressColumn) {
        this.personcolumn = personcolumn;
    }

    
    @Override
    public String toString() {
        return "SACViewComplainModel{" + "complainColumn=" + complainColumn + ", contactColumn=" + contactColumn + ", addressColumn=" + addressColumn + ", personcolumn=" + personcolumn + '}';
    }
    public void display(){
        System.out.println("complainColumn="+complainColumn+", contactColumn="+contactColumn+", addressColumn="+addressColumn+",personcolumn="+personcolumn);
    }

}