/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.finalproject.logic;

import com.lambton.finalproject.impl.IEmployee;
import com.lambton.finalproject.model.Employee;
import java.util.Calendar;

/**
 *
 * @author Kalpana Ramanan
 */
public class EmployeeImpl implements IEmployee{

    @Override
    public int calculateBirthYear(Employee employee) {
        
        Calendar now = Calendar.getInstance();   
        int year = now.get(Calendar.YEAR); 
        return (year - employee.getAge());
    }

    @Override
    public double calculateEarnings(Employee employee) {     
     return 1000d;  
    }

   
    
}
