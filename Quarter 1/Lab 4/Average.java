/**
Aditya Tikhe
Period 7
Lab 4a
Due Date: Sept 22
Date Submitted: Sept 26 (I submitted late because I was out (sick)
                        for one class and you told me to turn the lab in
                        next class (sept 26). 
What I learned: 
   a. How to work with a scanner some more.
   b. How to find the average of numbers. 
   
Purpose: The purpose of the experiment is to find
the average of three numbers. 

**/

import java.util.Scanner;

public class Average
{
   public static void main (String [] args)
   {
   
   Scanner console = new Scanner (System.in);
   
   System.out.println ("Enter first number here:");
      int first = console.nextInt();
      
   System.out.println ("Enter second number here:");
      int second = console.nextInt();
      
   System.out.println ("Enter third number here:");
      int third = console.nextInt();
   
   System.out.println ((first+second+third)/3);
   } //end of main
} // end of Average

/*********
Enter first number here:
 2
 Enter second number here:
 3
 Enter third number here:
 4
 3
*********/