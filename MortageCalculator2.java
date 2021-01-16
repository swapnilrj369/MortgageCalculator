package com.example.projectone.com.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator2 {


    public static void main(String[] args) {

        var calculateMortage = new CalculateMortage();

        calculateMortage.setPrincipal((int) calculateMortage.readNumber("Principal: ", 1000, 1_000_000));  // (int) calculateMortage.readNumber("Principal: ", 1000, 1_000_000);
        calculateMortage.setAnnualInterest((float) calculateMortage.readNumber("Annual Interest Rate: ", 1, 30)); // (float) calculateMortage.readNumber("Annual Interest Rate: ", 1, 30);
        calculateMortage.setYears((byte) calculateMortage.readNumber("Period (Years): ", 1, 30)); // (byte) calculateMortage.readNumber("Period (Years): ", 1, 30);

        calculateMortage.printMortgage();
        calculateMortage.printPaymentSchedule();

//        calculateMortage.printMortgage(principal, annualInterest, years);
//        calculateMortage.printPaymentSchedule(principal, annualInterest, years);


//        printMortgage(principal, annualInterest, years);
//        printPaymentSchedule(principal, annualInterest, years);
    }

 }

