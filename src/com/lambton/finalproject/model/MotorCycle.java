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
public class MotorCycle extends Vehicle{
   
    private String motorCycleNumber;
    private String brand;
    private String model;


    public String getMotorCycleNumber() {
        return motorCycleNumber;
    }

    public void setMotorCycleNumber(String motorCycleNumber) {
        this.motorCycleNumber = motorCycleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MotorCycle(String motorCycleNumber, String brand, String model, String vehicleNo, String vehicleType) {
        super(vehicleNo, vehicleType);
        this.motorCycleNumber = motorCycleNumber;
        this.brand = brand;
        this.model = model;
    }

    public MotorCycle(){}

    @Override
    public String toString() {
        return super.toString() + "MotorCycle{" + "motorCycleNumber=" + motorCycleNumber + ", brand=" + brand + ", model=" + model + '}';
    }
    
   
    
}
