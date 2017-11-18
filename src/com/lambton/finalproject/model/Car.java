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
public class Car extends Vehicle {

    private String carNumber;
    private String brand;
    private String model;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
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

    public Car(String carNumber, String brand, String model, String vehicleNo, String vehicleType) {
        super(vehicleNo, vehicleType);
        this.carNumber = carNumber;
        this.brand = brand;
        this.model = model;
    }


 

}
