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
public class DrroRehabilitationModel implements Serializable{
        private String PeopleColumn,HouseColumn,BudgetClm ;

    public DrroRehabilitationModel(String PeopleColumn, String HouseColumn, String BudgetClm) {
        this.PeopleColumn = PeopleColumn;
        this.HouseColumn = HouseColumn;
        this.BudgetClm = BudgetClm;
    }

    public String getPeopleColumn() {
        return PeopleColumn;
    }

    public String getHouseColumn() {
        return HouseColumn;
    }

    public String getBudgetClm() {
        return BudgetClm;
    }

    public void setPeopleColumn(String PeopleColumn) {
        this.PeopleColumn = PeopleColumn;
    }

    public void setHouseColumn(String HouseColumn) {
        this.HouseColumn = HouseColumn;
    }

    public void setBudgetClm(String BudgetClm) {
        this.BudgetClm = BudgetClm;
    }

    @Override
    public String toString() {
        return "DrroRehabilitationModel{" + "PeopleColumn=" + PeopleColumn + ", HouseColumn=" + HouseColumn + ", BudgetClm=" + BudgetClm + '}';
    }
        
    public void display(){
        System.out.println("PeopleColumn="+PeopleColumn+", PeopleColumn="+PeopleColumn+",HouseColumn="+HouseColumn);
    }
        
        
}
