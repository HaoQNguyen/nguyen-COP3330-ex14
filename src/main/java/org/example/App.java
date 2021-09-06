/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final double TAX_RATE = 0.055;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double subtotal = input.nextDouble();
        System.out.print("What is the state? ");
        String state = input.next();

        if (state.equals("WI"))
        {
            double tax = subtotal * TAX_RATE;
            double total = subtotal + tax;
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", subtotal, tax, total);
        }

        if (!state.equals("WI"))
        {
            System.out.printf("The total is $%.2f.", subtotal);
        }
    }
}
