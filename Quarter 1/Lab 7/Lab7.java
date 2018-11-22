/*******************************************************************
Aditya Tikhe
Period 7
Lab 7
Due Date: Oct 6
Date Submitted: Oct 6
What I learned: 
   a.  I learned how to use multiple methods to make one formula work simultaneously.  
  
Purpose: The purpose of the program is to input an amount borrowed and
          find the amount needed to be paid each month. 
 
*******************************************************************/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab7
{
   static Scanner console = new Scanner (System.in);
   public static void main (String [] args)
   {
   
      int years;
      double amount;
      double rate;
      double payment;
   
      amount = getAmount();
      rate = getRate();
      years = getYears();
      payment = findPayment (amount, rate, years);
      displayMethod (payment);
   }
      
   public static double getAmount ()
   {
      System.out.println ("Enter the amount to be borrowed: ");
      double amount = console.nextDouble();
      if (amount < 0 || amount > 100000)
      {
         System.out.print("invalid. Enter a valid amount: ");
         amount = console.nextDouble();
      }
      return amount;
   }
  
   public static double getRate ()
   {
      System.out.println ("Enter the annual interest rate as a percent: ");
      double rate = console.nextDouble();
      return rate/1200;
   }
   
   public static int getYears ()
   {
      System.out.println ("Enter the length of the loan in years");
      int years = console.nextInt();
      return years; 
   }
   
   public static double findPayment(double amount, double rate, int years)
   {
      int months = years*12;
      
      return amount*rate*(Math.pow(rate + 1, months)/(Math.pow(rate + 1, months)-1));
   } 
   
   public static void displayMethod (double payment)
   {
      DecimalFormat d = new DecimalFormat("0.00");
      System.out.println("Monthly payment: $" + d.format(payment));
   }
   
}

/*
 Enter the amount to be borrowed: 
 10500
 Enter the annual interest rate as a percent: 
 9.5
 Enter the length of the loan in years
 4
 Monthly payment: $263.79
*/ 