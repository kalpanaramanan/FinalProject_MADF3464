/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.finalproject.impl;

import com.lambton.finalproject.model.CommissionBasedPartTime;
import com.lambton.finalproject.model.PartTime;

/**
 *
 * @author Kalpana Ramanan
 */
public interface ICommisionBasedPartTime {
    
    public double calculateCommissionBasedPartTime(PartTime partTime,CommissionBasedPartTime commissionBasedPartTime);
}
