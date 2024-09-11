/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author SIMEC IT INSTITUTE
 */
public interface CostCalculation {
    int discountPercentage = 25;

    double additionalCost = 0;
    double grandTotal = 0;
    double paidAmount = 0;

    public abstract double calcTotal();
    public abstract double calcDue();
    
}
