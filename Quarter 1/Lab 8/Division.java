/*******************************************************************
Aditya Tikhe
Period 7
Lab 8
Due Date: Oct 12
Date Submitted: Oct 12
What I learned: 
   a. I learned how to make a basic if/else condition.  
   b. I practiced working with division and modulus operators. 
  
Purpose: The purpose of this lab is to input 2 positive integers and divide them.
         Then, print out the quotient with a remainder. Also, it would always divide
         the bigger number by the smaller number.

*******************************************************************/

import java.util.Scanner;

public class Division
{
   static Scanner console = new Scanner (System.in);
   public static void main (String [] args)
   {
   
      System.out.println ("Enter the first number here (positive int): ");
      int num1 = console.nextInt();
      
      System.out.println ("Enter the second number here (positive int): ");
      int num2 = console.nextInt();
      
      if (num1 > num2)
      {
         System.out.println("answer: " + num1/num2 + "r" + num1%num2);
      }
      else System.out.println("answer: " + num2/num1 + "r" + num2%num1);
   }
}
   
/*

 Enter the first number here (positive int): 
 9
 Enter the second number here (positive int): 
 2
 answer: 4r1


*/

/*

 Enter the first number here (positive int): 
 2
 Enter the second number here (positive int): 
 9
 answer: 4r1

*/