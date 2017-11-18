/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.finalproject.impl;

import com.lambton.finalproject.model.FixedBasedPartTime;
import com.lambton.finalproject.model.PartTime;

/**
 *
 * @author Kalpana Ramanan
 */
public interface IFixedBasedPartTime {

    public double calculateFixedBasedPartTime(PartTime partTime, FixedBasedPartTime fixedBasedPartTime);
}
