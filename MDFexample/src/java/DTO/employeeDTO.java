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
public class employeeDTO {
    
    private String employee_No;
    private String employee_Mail;
    private String employee_Phone;
    private String employee_Status;
    private String employee_Rank;

    public employeeDTO(String employee_No, String employee_Mail, String employee_Phone, String employee_Status, String employee_Rank) {
        this.employee_No = employee_No;
        this.employee_Mail = employee_Mail;
        this.employee_Phone = employee_Phone;
        this.employee_Status = employee_Status;
        this.employee_Rank = employee_Rank;
    }

    public String getEmployee_No() {
        return employee_No;
    }

    public void setEmployee_No(String employee_No) {
        this.employee_No = employee_No;
    }

    public String getEmployee_Mail() {
        return employee_Mail;
    }

    public void setEmployee_Mail(String employee_Mail) {
        this.employee_Mail = employee_Mail;
    }

    public String getEmployee_Phone() {
        return employee_Phone;
    }

    public void setEmployee_Phone(String employee_Phone) {
        this.employee_Phone = employee_Phone;
    }

    public String getEmployee_Status() {
        return employee_Status;
    }

    public void setEmployee_Status(String employee_Status) {
        this.employee_Status = employee_Status;
    }

    public String getEmployee_Rank() {
        return employee_Rank;
    }

    public void setEmployee_Rank(String employee_Rank) {
        this.employee_Rank = employee_Rank;
    }

    @Override
    public String toString() {
        return "employeeDTO{" + "employee_No=" + employee_No + ", employee_Mail=" + employee_Mail + ", employee_Phone=" + employee_Phone + ", employee_Status=" + employee_Status + ", employee_Rank=" + employee_Rank + '}';
    }
    
    
    
}
