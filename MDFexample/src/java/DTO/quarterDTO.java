/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Asnorrason
 */
public class quarterDTO {
    
    private String quarter_Name;
    private String start_Date;
    private String end_Date;

    public quarterDTO(String start_Date, String end_Date) {
        this.start_Date = start_Date;
        this.end_Date = end_Date;
    }

    public String getStart_Date() {
        return start_Date;
    }

    public String getQuarter_Name() {
        return quarter_Name;
    }

    public void setStart_Date(String start_Date) {
        this.start_Date = start_Date;
    }

    public String getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(String end_Date) {
        this.end_Date = end_Date;
    }

    public void setQuarter_Name(String quarter_Name) {
        this.quarter_Name = quarter_Name;
    }

    @Override
    public String toString() {
        return "quarterDTO{" + "quarter_Name=" + quarter_Name + ", start_Date=" + start_Date + ", end_Date=" + end_Date + '}';
    }


    
    
}
