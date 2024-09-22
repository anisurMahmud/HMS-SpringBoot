/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Anis
 */
@Entity
public class PathologicalTest extends LabTest{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String reAgent;
    
    public PathologicalTest(String title,
                    double cost,
                    boolean isAvailable){ 
//        this.title = title;
//        this.cost = cost;
//        this.isAvailable = isAvailable;
            super(title,cost,isAvailable);
            }

    public PathologicalTest() {

    }

    @Override
    public boolean setIsAvailable() {
        return false;
    }

    public PathologicalTest(String title,
                    double cost,
                    boolean isAvailable,
                    String reAgent){
        //this.title = title;
        //this.cost = cost;
        //this.isAvailable = isAvailable; 
        super(title, cost, isAvailable);
        this.reAgent = reAgent;
    }

    @Override
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
//    public void setTitle(String title) {
//        this.title = title;
//    }

    /**
     * @return the cost
     */
    @Override
    public double getCost() {
        return cost;
    }
    public String getReagent() {
        return reAgent;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the isAvailable
     */
    @Override
    public boolean getAvailable() {
        return isAvailable;
    }



//    public double calcTotal() {
//        return this.cost - (this.cost*discountPercentage)/100;
////        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//
//    }

//    @Override
//    public double calcDue() {
//        return 0;
//    }

//    @Override
//    public String returnLabTestInfo() {
//        return "Test name: "+ this.getTitle()+ "\r\n"
//                + "Cost: "+ this.getCost()+"\r\n"
//                + "Availability: "+ this.getAvailable() + "\r\n"
//                + "ReAgent: " + this.getReagent();
//    }





    
}
