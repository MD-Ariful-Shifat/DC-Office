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
        this.personcolumn = personcolumn;
    }

    public String getComplainColumn() {
        return complainColumn;
    }

    public void setComplainColumn(String complainColumn) {
        this.complainColumn = complainColumn;
    }

    public String getContactColumn() {
        return contactColumn;
    }

    public void setContactColumn(String contactColumn) {
        this.contactColumn = contactColumn;
    }

    public String getAddressColumn() {
        return addressColumn;
    }

    public void setAddressColumn(String addressColumn) {
        this.addressColumn = addressColumn;
    }

    public String getPersoncolumn() {
        return personcolumn;
    }

    public void setPersoncolumn(String personcolumn) {
        this.personcolumn = personcolumn;
    }

    @Override
    public String toString() {
        return "SACViewComplainModel{" + "complainColumn=" + complainColumn + ", contactColumn=" + contactColumn + ", addressColumn=" + addressColumn + ", personcolumn=" + personcolumn + '}';
    }
    public void display(){
        System.out.println("complainColumn="+complainColumn+", contactColumn="+contactColumn+", addressColumn="+addressColumn+", personcolumn=" + personcolumn);

}
}