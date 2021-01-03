package com.example.projectone.com.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args){

        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        do {
            System.out.print("Principal = ");
            principal = scanner.nextInt();
            System.out.println("Enter a number between 1000 and 1000000");
        } while (principal<=1000 || principal>1000000);



        float annualInterestRate = 0;
        do {
            System.out.print("Annual Interest Rate = ");
            annualInterestRate = scanner.nextFloat();
            System.out.println("Enter a value greater than 0 and less than or equal to 30 ");
        } while (annualInterestRate>30 || annualInterestRate <=0);

        float monthlyInterest = ((annualInterestRate/PERCENT)/MONTHS_IN_YEARS);
        System.out.println("Your Monthly Interest is " + monthlyInterest);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String monthlyInterestRate = percent.format(annualInterestRate/12);
        System.out.println("Your Monthly Interest Rate is " + monthlyInterestRate);


        short periods =0;
        do {
            System.out.print("Periods (Years) = ");
            periods = scanner.nextShort();
            System.out.println("Enter a value between 1 and 30 ");
        } while (periods<=0 || periods>30);

        int numberOfPayments = periods * MONTHS_IN_YEARS;
        //System.out.println("You have entered No. of Years as " + periods);

        double result = principal * ((monthlyInterest * (Math.pow((1+monthlyInterest),numberOfPayments))) / ((Math.pow((1+monthlyInterest),numberOfPayments))-1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String value = currency.format(result);
        System.out.println("Your Mortage is " + value);
    }
}
