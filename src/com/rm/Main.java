package com.rm;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = input.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = input.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = (principal* monthlyInterest) / (1-Math.pow(1+monthlyInterest, -numberOfPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);
    }
}