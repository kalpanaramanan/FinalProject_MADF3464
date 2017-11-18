/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.finalproject.model;


/**
 *
 * @author Kalpana Ramanan
 */
public class Intern extends Employee{
    
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Intern(String schoolName) {
        this.schoolName = schoolName;
    }

    public Intern(String schoolName, int employeeNo, String employeeName, int age, Vehicle vehicle) {
        super(employeeNo, employeeName, age, vehicle);
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Intern{" + "schoolName=" + schoolName +'}';
    }

    
    
}
