/******************
Aditya Tikhe
Period 7
Lab 9
Due Date: Oct 12
Date Submitted: Oct 12
What I learned: 
   a. I learned to use the && operator to make sure multiple 
      conditions are fulfilled for the statement to be true.
   b. I also learned how to generate a random number. 
   c. I practiced more with the if loops.
  
Purpose: The purpose of this lab was to simulate a 3 digit lock. The lock generates 3 numbers. 
         The user enters 3 numbers, and if they are within 3 numbers of the actual number, the lock 
         will be "opened". 
         
******************/

import java.util.Scanner;

public class Lock
{
   static Scanner console = new Scanner (System.in);
   public static void main (String [] args)
   {
      int first;
      int second;
      int third;
   //generates three numbers between 1-50 (inclusive)
      first = (int)(Math.random () *50 +1);
      second = (int)(Math.random () *50 + 1);
      third = (int)(Math.random () *50 + 1);
   
      System.out.println(first + ", " + second + ", " + third);
   
   
      System.out.println("It is \"" + theLockIsOpen (first, second, third) + "\"  that the lock is open.");
   }
   
   public static boolean theLockIsOpen (int first, int second, int third)
   {
      System.out.println("Input first number: ");
      int firstNum = console.nextInt();
      System.out.println("Input second number: ");
      int secondNum = console.nextInt();
      System.out.println("Input third number: ");
      int thirdNum = console.nextInt();
   
      if ((Math.abs(first - firstNum) <=3)&&(Math.abs(second - secondNum) <= 3)&&(Math.abs(third - thirdNum) <= 3))
      {
         return true; 
      }
      else 
         return false; 
   }
}

/*
 5, 20, 47
 Input first number: 
 8
 Input second number: 
 17
 Input third number: 
 47
 It is "true"  that the lock is open.
*/


/*
   40, 31, 10
 Input first number: 
 2
 Input second number: 
 2
 Input third number: 
 2
 It is "false"  that the lock is open. 
*/