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
public class FixedBasedPartTime extends PartTime{
    
    private double fixedAmount;

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public FixedBasedPartTime(double fixedAmount, double rate, double noOfHoursWorked) {
        super(rate, noOfHoursWorked);
        this.fixedAmount = fixedAmount;
    }

    public FixedBasedPartTime(double fixedAmount, double rate, double noOfHoursWorked, int employeeNo, String employeeName, int age, Vehicle vehicle) {
        super(rate, noOfHoursWorked, employeeNo, employeeName, age, vehicle);
        this.fixedAmount = fixedAmount;
    }

    @Override
    public String toString() {
        return "FixedBasedPartTime{" + "fixedAmount=" + fixedAmount + 
                " Earnings " + ((getRate() * getNoOfHoursWorked()) + (getFixedAmount()) + 
                "(" + (getRate() * getNoOfHoursWorked()) + " + " + this.getFixedAmount()) +")" +
        
                '}';
    }


}
