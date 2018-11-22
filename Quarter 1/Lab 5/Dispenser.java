/************************************************
Aditya Tikhe
Period 7
Lab 5
Due Date: Sept 26
Date Submitted: Sept 26
What I learned: 
   a. I learned how to use the '%' operator and use it to find the remainder of each bit of change.
      
      
Purpose: The purpose of this program is to simulate a vending machine. First one inserts a number 
between 25 and 100 (which is divisible by 5). Then the program finds the amount of change. 
Finally, finding the minimum number of quarters, dimes, and nickels from the change.

***********************************************/

import java.util.Scanner;

public class Dispenser
{
   public static void main (String [] args)
   {
      int dollar = 100;
      Scanner console = new Scanner (System.in);
   
      System.out.println ("Please insert a number from 25 to 100:");
      int number = console.nextInt();
      
      int change = dollar-number;
      int quarter = change/25;
      int dime = (change%25)/10;
      int nickel = ((change%25)%10)/5;
   
      System.out.println ("You bought an item for " + number + " cents and gave me a dollar, so your change is:\n");
      System.out.println (quarter + " quarter(s),");
      System.out.println (dime + " dime(s), and");
      System.out.println (nickel + " nickel(s)");
   
   
   
   }
}

/*******************************************
Please insert a number from 25 to 100:
 45
 You bought an item for 45 cents and gave me a dollar, so your change is:
 
 2 quarter(s),
 0 dime(s), and
 1 nickel(s)
 
*******************************************/