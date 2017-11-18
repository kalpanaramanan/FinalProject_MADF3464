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
public class Employee {

    private int employeeNo;
    private String employeeName;
    private int age;
    private int birthyear;
    private double earnings;
    private Vehicle vehicle;

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee() {
    }

    public Employee(int employeeNo, String employeeName, int age, Vehicle vehicle) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.age = age;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        Object vehicle = null;
     
        if (this.vehicle != null){
            vehicle = (Vehicle)this.vehicle;
        }else{
            vehicle = (String) " No Vehicle registered";
        }
        return "Employee{" + "employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", age=" + age + " vehicle=" 
                + vehicle
                + '}';
    }

}
