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
public class FullTime extends Employee{
    
   private double salary;
   private double bonus;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public FullTime(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public FullTime(double salary, double bonus, int employeeNo, String employeeName, int age,  Vehicle vehicle) {
        super(employeeNo, employeeName, age, vehicle);
        this.salary = salary;
        this.bonus = bonus;
    }

    
    @Override
    public String toString() {
        return "FullTime{" + "salary=" + salary + ", bonus=" + bonus + '}';
    }


    public String displayData(){
        return super.toString() + this.toString();
    }
    
}
