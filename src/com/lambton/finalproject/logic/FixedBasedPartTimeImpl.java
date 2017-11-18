/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.finalproject.logic;

import com.lambton.finalproject.impl.IFixedBasedPartTime;
import com.lambton.finalproject.model.FixedBasedPartTime;
import com.lambton.finalproject.model.PartTime;

/**
 *
 * @author Kalpana Ramanan
 */
public class FixedBasedPartTimeImpl implements IFixedBasedPartTime {

    @Override
    public double calculateFixedBasedPartTime(PartTime partTime, FixedBasedPartTime fixedBasedPartTime) {

        return (partTime.getRate() + partTime.getNoOfHoursWorked() + fixedBasedPartTime.getFixedAmount());
    }

}
