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
public class CommissionBasedPartTime extends PartTime {

    private double commissionPercentage;

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    
    /*@Override
    public String toString() {

        String str = "";
        str += (super.toString() + "     * Commission : " + this.getCommissionPercentage() + "%\n"
                
                + "(" + (getRate() * getNoOfHoursWorked()) + "+" + +this.getCommissionPercentage() + "% of " + (getRate() * getNoOfHoursWorked()) +")");
        return str;
    }*/

    public CommissionBasedPartTime(double commissionPercentage, double rate, double noOfHoursWorked) {
        super(rate, noOfHoursWorked);
        this.commissionPercentage = commissionPercentage;
    }

    public CommissionBasedPartTime(double commissionPercentage, double rate, double noOfHoursWorked, int employeeNo, String employeeName, int age, Vehicle vehicle) {
        super(rate, noOfHoursWorked, employeeNo, employeeName, age, vehicle);
        this.commissionPercentage = commissionPercentage;
    }

   

 
    @Override
    public String toString() {
        return "CommissionBasedPartTime {" + "commissionPercentage =" + commissionPercentage +
                " Earnings " + ((getRate() * getNoOfHoursWorked()) + ((getCommissionPercentage() /100) * (getRate() * getNoOfHoursWorked()))) + 
                 "(" + (getRate() * getNoOfHoursWorked()) + " + " + this.getCommissionPercentage() + "% of " + (getRate() * getNoOfHoursWorked()) +")" +
        
                '}';
    }
    
  
}
