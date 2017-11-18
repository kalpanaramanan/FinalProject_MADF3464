/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.finalproject.logic;

import com.lambton.finalproject.impl.IFullTime;
import com.lambton.finalproject.model.FullTime;

/**
 *
 * @author Kalpana Ramanan
 */
public class FullTimeImpl implements IFullTime{

    @Override
    public double calculateEarnings(FullTime fullTime) {   
        return (fullTime.getSalary() + fullTime.getBonus());
    }

}
