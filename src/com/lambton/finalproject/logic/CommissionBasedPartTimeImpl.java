/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.finalproject.logic;

import com.lambton.finalproject.impl.ICommisionBasedPartTime;
import com.lambton.finalproject.model.CommissionBasedPartTime;
import com.lambton.finalproject.model.PartTime;

/**
 *
 * @author Kalpana Ramanan
 */
public class CommissionBasedPartTimeImpl implements ICommisionBasedPartTime {

    @Override
    public double calculateCommissionBasedPartTime(PartTime partTime, CommissionBasedPartTime commissionBasedPartTime) {

        return ((partTime.getRate() * partTime.getNoOfHoursWorked()) + ((commissionBasedPartTime.getCommissionPercentage() / 100) * (partTime.getRate() * partTime.getNoOfHoursWorked())));
        //return (partTime.getRate() + partTime.getNoOfHoursWorked() + commissionBasedPartTime.getCommissionPercentage());
    }

}
