/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public abstract class LabTest {
    protected String title;
    protected double cost;
    protected boolean isAvailable;
    @Getter
    @Setter
    @Id
    private Long id;

    public LabTest(){}
    public LabTest(String title, double cost, boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;   
    }
    
    public abstract boolean setIsAvailable();
    public abstract String getTitle();
    public abstract double getCost();
    public abstract boolean getAvailable();

    //    {
//        String output = "Test name: "+this.title+ "\r\n"
//                + "Cost: "+this.cost+"\r\n"
//                + "Availability: "+this.isAvailable;
//        return output;
//    }
}
    
