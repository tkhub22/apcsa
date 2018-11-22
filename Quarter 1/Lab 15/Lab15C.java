/******************
Aditya Tikhe
Period 7
Lab 15C
Due Date: Oct 28
Date Submitted: Oct 28
What I learned: 
   a.  I practiced how to write a method to return an integer. 
   b.  I also practiced while loops. 
  
Purpose:  The purpose of this program is to find the aliquot sum for any
          integer larger than 1.
******************/

import java.util.Scanner;
public class Lab15C
{
   static Scanner console = new Scanner (System.in);
   public static void main (String [] args)
   {
      System.out.println ("Please enter an integer greater than one: ");
      int x = console.nextInt();
      int sum = computeAliquotSum(x);
      System.out.println("The Aliquot sum of " + x + " is: " + sum);
   }
   public static int computeAliquotSum (int number)
   {
      int sum = 0;
      int i = 1;
      while (i < number)
      { 
         if(number%i==0)
         {
            sum+=i; 
         }
         i++;
      }
       
      return sum;
   }
}
/*
 Please enter an integer greater than one: 
 6
 The Aliquot sum of 6 is: 6
*/

/*
 Please enter an integer greater than one: 
 8
 The Aliquot sum of 8 is: 7
*/