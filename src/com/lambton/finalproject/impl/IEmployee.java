/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.finalproject.impl;

import com.lambton.finalproject.model.Employee;

/**
 *
 * @author Kalpana Ramanan
 */
public interface IEmployee {
    
    public int calculateBirthYear(Employee employee);
    
    public double calculateEarnings(Employee employee);
}
