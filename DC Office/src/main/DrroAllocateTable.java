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
public class DrroAllocateTable implements Serializable  {
    
    private String AreaColumn,CashColumn,ItemColumn,AmountFoodClm;

    public DrroAllocateTable(String AreaColumn, String CashColumn, String ItemColumn, String AmountFoodClm) {
        this.AreaColumn = AreaColumn;
        this.CashColumn = CashColumn;
        this.ItemColumn = ItemColumn;
        this.AmountFoodClm = AmountFoodClm;
    }

    public String getAreaColumn() {
        return AreaColumn;
    }

    public String getCashColumn() {
        return CashColumn;
    }

    public String getItemColumn() {
        return ItemColumn;
    }

    public String getAmountFoodClm() {
        return AmountFoodClm;
    }

    public void setAreaColumn(String AreaColumn) {
        this.AreaColumn = AreaColumn;
    }

    public void setCashColumn(String CashColumn) {
        this.CashColumn = CashColumn;
    }

    public void setItemColumn(String ItemColumn) {
        this.ItemColumn = ItemColumn;
    }

    public void setAmountFoodClm(String AmountFoodClm) {
        this.AmountFoodClm = AmountFoodClm;
    }

    @Override
    public String toString() {
        return "DrroAllocateTable{" + "AreaColumn=" + AreaColumn + ", CashColumn=" + CashColumn + ", ItemColumn=" + ItemColumn + ", AmountFoodClm=" + AmountFoodClm + '}';
    }
    
    public void display(){
        System.out.println("AreaColumn="+AreaColumn+", CashColumn="+CashColumn+", ItemColumn="+ItemColumn+",AmountFoodClm="+AmountFoodClm);
    }
    
}
