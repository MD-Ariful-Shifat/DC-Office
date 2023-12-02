/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class DrroBlanketModel implements Serializable {
    private String AreaColumn,AmountColumn;
    private LocalDate DateColumn;


    public DrroBlanketModel(String AreaColumn, String AmountColumn, LocalDate DateColumn) {
        this.AreaColumn = AreaColumn;
        this.AmountColumn = AmountColumn;
        this.DateColumn = DateColumn;
    }

    public String getAreaColumn() {
        return AreaColumn;
    }

    public String getAmountColumn() {
        return AmountColumn;
    }

    public LocalDate getDateColumn() {
        return DateColumn;
    }

    public void setAreaColumn(String AreaColumn) {
        this.AreaColumn = AreaColumn;
    }

    public void setAmountColumn(String AmountColumn) {
        this.AmountColumn = AmountColumn;
    }

    public void setDateColumn(LocalDate DateColumn) {
        this.DateColumn = DateColumn;
    }

    

    @Override
    public String toString() {
        return "DrroBlanketModel{" + "AreaColumn=" + AreaColumn + ", AmountColumn=" + AmountColumn + ", DateColumn=" + DateColumn + '}';
    }
    
    public void display(){
        System.out.println("AreaColumn="+AreaColumn+", AmountColumn="+AmountColumn+", DateColumn="+DateColumn);
    }

    
}
