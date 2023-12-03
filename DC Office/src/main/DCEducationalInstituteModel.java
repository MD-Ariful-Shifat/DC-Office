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
public class DCEducationalInstituteModel implements Serializable  {
    
    private String schoolcolumn,principalColumn,hotlineColumn,addressColumn;

    public DCEducationalInstituteModel(String schoolcolumn, String principalColumn, String hotlineColumn, String addressColumn) {
        this.schoolcolumn = schoolcolumn;
        this.principalColumn = principalColumn;
        this.hotlineColumn = hotlineColumn;
        this.addressColumn = addressColumn;
    }

    public String getSchoolcolumn() {
        return schoolcolumn;
    }

    public String getPrincipalColumn() {
        return principalColumn;
    }

    public String getHotlineColumn() {
        return hotlineColumn;
    }

    public String getAddressColumn() {
        return addressColumn;
    }

    public void setSchoolcolumn(String schoolcolumn) {
        this.schoolcolumn = schoolcolumn;
    }

    public void setPrincipalColumn(String principalColumn) {
        this.principalColumn = principalColumn;
    }

    public void setHotlineColumn(String hotlineColumn) {
        this.hotlineColumn = hotlineColumn;
    }

    public void setAddressColumn(String addressColumn) {
        this.addressColumn = addressColumn;
    }

    
    @Override
    public String toString() {
        return "DCEducationalInstituteModel{" + "schoolcolumn=" + schoolcolumn + ", principalColumn=" + principalColumn + ", hotlineColumn=" + hotlineColumn + ", addressColumn=" + addressColumn + '}';
    }
    public void display(){
        System.out.println("schoolcolumn="+schoolcolumn+", principalColumn="+principalColumn+", hotlineColumn="+hotlineColumn+",addressColumn="+addressColumn);
    }

}