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
public class PartTime extends Employee {

    private double rate;
    private double noOfHoursWorked;   

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getNoOfHoursWorked() {
        return noOfHoursWorked;
    }

    public void setNoOfHoursWorked(double noOfHoursWorked) {
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public PartTime(double rate, double noOfHoursWorked) {
        this.rate = rate;
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public PartTime(double rate, double noOfHoursWorked, int employeeNo, String employeeName, int age, Vehicle vehicle) {
        super(employeeNo, employeeName, age, vehicle);
        this.rate = rate;
        this.noOfHoursWorked = noOfHoursWorked;
    }

    @Override
    public String toString() {
        return "PartTime{" + "rate=" + rate + ", noOfHoursWorked=" + noOfHoursWorked + '}';
    }

   

   


}
