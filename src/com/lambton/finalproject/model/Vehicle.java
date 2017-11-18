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
public class Vehicle {
 
    private String vehicleNo;
    private String vehicleType;
    

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle(String vehicleNo, String vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

   
    public Vehicle(){
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleNo=" + vehicleNo + ", vehicleType=" + vehicleType + '}';
    }

    
}
