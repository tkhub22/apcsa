/******************
Aditya Tikhe
Period 7
Lab 14
Due Date: Oct 26
Date Submitted: Oct 26
What I learned: 
   a.  I learned how to use while loops.
   b.  I worked with assignment operators such as -= and +=.
  
Purpose:  The purpose of this program is to ask for a monthly payment. Then 
           write the balance and total payment for every month until the balance is zero or less. 

******************/

import java.util.Scanner;
public class CreditCardBill
{
   static Scanner console = new Scanner (System.in);
   public static void main (String [] args)
   {
      System.out.println ("Please enter the monthly payment: ");
      int payment = console.nextInt();
      
      double balance = 1015;
      int months = 0;
      double total = 0.0;
      while (balance > 0)
      {
         balance -= payment;
         total += payment; 
         months++;
         System.out.println("Month: " + months + "  balance: " + balance + " total payment: " + total);
         balance = 1.015*balance;
      }
   }
}

/*
 Please enter the monthly payment: 
 100
 Month: 1  balance: 915.0 total payment: 100.0
 Month: 2  balance: 828.7249999999999 total payment: 200.0
 Month: 3  balance: 741.1558749999998 total payment: 300.0
 Month: 4  balance: 652.2732131249998 total payment: 400.0
 Month: 5  balance: 562.0573113218746 total payment: 500.0
 Month: 6  balance: 470.48817099170265 total payment: 600.0
 Month: 7  balance: 377.54549355657815 total payment: 700.0
 Month: 8  balance: 283.2086759599268 total payment: 800.0
 Month: 9  balance: 187.45680609932566 total payment: 900.0
 Month: 10  balance: 90.26865819081553 total payment: 1000.0
 Month: 11  balance: -8.377311936322243 total payment: 1100.0
*/