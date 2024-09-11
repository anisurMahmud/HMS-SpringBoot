package com.hms.controller;

import com.hms.model.LabTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.*;

public class LabTestController {
    private List<LabTest> tests = new ArrayList<>();

    public void addLabtTest(LabTest lt){
        tests.add(lt);
    }
    public void dateToString() throws ParseException {
        String sDate1="31/12/1998";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(date1);
    }
//    static LabTest[] arrayOfObjects;
//    //= new LabTest[5];
//
//    public void addObject(LabTest arrayOfObjects){
////        this.arrayOfObjects[0] = new LabTest("Test", 8.5, true);
//        this.arrayOfObjects[0] = new LabTest() {
//            @Override
//            public String returnLabTestInfo() {
//                return "oo";
//            }
//
//            @Override
//            public String getTitle() {
//                return "test";
//            }
//
//            @Override
//            public double getCost() {
//                return 8.5;
//            }
//
//            @Override
//            public boolean isIsAvailable() {
//                return true;
//            }
//        };
//    }
//
//    public static void main(String[] args) {
//        System.out.println(arrayOfObjects);
//    }

}

