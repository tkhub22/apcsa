/******************
Aditya Tikhe
Period 7
Lab 11
Due Date: Oct 20
Date Submitted: Oct 20
What I learned: 
   a. I learned how to use for loops.
   b. I learned how to nest if loops in for loops
   c. I learned how to round a double to 2 decimal places. 
  
Purpose: The purpose of the program is for the user to input the amount of hours they worked for 4 weeks.
         Then, the it will reduce that number by 30%, for taxes. Finally, telling them their take-home pay.

******************/

import java.util.Scanner;
import java.text.DecimalFormat;
public class Burger
{
   static Scanner console = new Scanner (System.in);
   public static void main (String [] args)
   {
      double total = 0.0;
      final double wage = 5.15;
      final double taxes = .7;
      double weeklySalary = 0.0;
      for (int i = 1; i <=4; i++)
      {
         System.out.println("How many hours did you work in week " + i + "?");
         int hours  = console.nextInt();
         if (hours < 0)
         {
            System.out.println("Number of hours can't be negative.");
            i--;
         }
         else
         {
            weeklySalary = (wage * hours)* taxes; 
            DecimalFormat twoDForm = new DecimalFormat("#.##");
            weeklySalary = Double.valueOf(twoDForm.format(weeklySalary));
            System.out.println ("Your take-home pay is $" + weeklySalary + "\n");
            total = total + weeklySalary;
         }
      } 
      System.out.println ("Your total pay for the month is $" + total);
      System.out.println ("Hope you enjoy working at Babbage Burgers.");
   }
}
 
/*
 How many hours did you work in week 1?
 35
 Your take-home pay is $126.17
 
 How many hours did you work in week 2?
 41
 Your take-home pay is $147.81
 
 How many hours did you work in week 3?
 37
 Your take-home pay is $133.38
 
 How many hours did you work in week 4?
 45
 Your take-home pay is $162.23
 
 Your total pay for the month is $569.59
 Hope you enjoy working at Babbage Burgers.
*/

/*
 How many hours did you work in week 1?
 45
 Your take-home pay is $162.23
 
 How many hours did you work in week 2?
 50
 Your take-home pay is $180.25
 
 How many hours did you work in week 3?
 35
 Your take-home pay is $126.17
 
 How many hours did you work in week 4?
 45
 Your take-home pay is $162.23
 
 Your total pay for the month is $630.88
 Hope you enjoy working at Babbage Burgers.
*/

/*
// this input contains a negative number

 How many hours did you work in week 1?
 45
 Your take-home pay is $162.23
 
 How many hours did you work in week 2?
 50
 Your take-home pay is $180.25
 
 How many hours did you work in week 3?
 35
 Your take-home pay is $126.17
 
 How many hours did you work in week 4?
 -45
 Number of hours can't be negative.
 How many hours did you work in week 4?
 45
 Your take-home pay is $162.23
 
 Your total pay for the month is $630.88
 Hope you enjoy working at Babbage Burgers.
*/