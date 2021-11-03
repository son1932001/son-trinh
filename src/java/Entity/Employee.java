/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;


/**
 *
 * @author Admin
 */
public class Employee {
    private String idemp;
    private String name;
    private Date dob;
    private String idroom;

    public Employee() {
    }

    public Employee(String idemp, String name, Date dob, String idroom) {
        this.idemp = idemp;
        this.name = name;
        this.dob = dob;
        this.idroom = idroom;
    }

    public String getIdemp() {
        return idemp;
    }

    public void setIdemp(String idemp) {
        this.idemp = idemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getIdroom() {
        return idroom;
    }

    public void setIdroom(String idroom) {
        this.idroom = idroom;
    }

    @Override
    public String toString() {
        return "Employee{" + "idemp=" + idemp + ", name=" + name + ", dob=" + dob + ", idroom=" + idroom + '}';
    }

    
    
}
