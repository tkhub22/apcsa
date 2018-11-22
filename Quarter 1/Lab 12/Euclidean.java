/******************
Aditya Tikhe
Period 7
Lab 12
Due Date: Oct 24
Date Submitted: Oct 24
What I learned: 
   a. How to use while loops.
   b. Working with 'if' loops to determine which number is bigger.
  
Purpose: The purpose of this program is to use the Euclidean algorithm to find the greatest common divisor.
         The GCD is the largest positive integer that divides the number without a remainder.  

******************/

import java.util.Scanner;
public class Euclidean
{
   static Scanner console = new Scanner (System.in);
   public static void main (String [] args)
   {
      System.out.println ("Enter the first number here: ");
      int n1 = Math.abs (console.nextInt());
      System.out.println ("Enter the second number here: ");
      int n2 = Math.abs(console.nextInt());
      
      int remainder =0;
      int big;
      int small;
      
      if (n1 > n2)
      {
         big = n1;
         small = n2;
      
      }
      else if (n2 > n1)
      {
         big = n2;
         small = n1;
      }
      
      else 
      {
         big = n1;
         small = n1;
      }
      
      while (small > 0)
      {
         remainder = big%small;
         big = small;
         small = remainder;
      }
      System.out.println("The GCD of the two numbers, " + n1 + " and " + n2 + ", is: " + big);
   }
}

/*
n1>n2

 Enter the first number here: 
 12
 Enter the second number here: 
 6
 The GCD of the two numbers, 12 and 6, is: 6
*/

/*
n2>n1

 Enter the first number here: 
 6
 Enter the second number here: 
 12
 The GCD of the two numbers, 6 and 12, is: 6
*/

/*
n1 = n2

 Enter the first number here: 
 6
 Enter the second number here: 
 6
 The GCD of the two numbers, 6 and 6, is: 6
*/

/*
-n1 > -n2

 Enter the first number here: 
 -6
 Enter the second number here: 
 -12
 The GCD of the two numbers, 6 and 12, is: 6
*/

/*
n1  -n2

 Enter the first number here: 
 6
 Enter the second number here: 
 -12
 The GCD of the two numbers, 6 and 12, is: 6
*/

/*
-n1 n2

 Enter the first number here: 
 -6
 Enter the second number here: 
 12
 The GCD of the two numbers, 6 and 12, is: 6
*/
