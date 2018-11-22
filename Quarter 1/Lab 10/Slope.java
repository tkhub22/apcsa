/******************
Aditya Tikhe
Period 7
Lab 10
Due Date: Oct 14
Date Submitted: Oct 14
What I learned: 
   a. I learned how to work with if statements. 
   b. I worked with the && operator some more.
  
Purpose: The purpose of this program is to ask the user for two points and tell the slope.
         If the slope is horizonal or vertical it will alert the user. 
         
******************/

import java.util.Scanner;

public class Slope
{
   static Scanner console = new Scanner (System.in);
   public static void main (String [] args)
   {
      
      System.out.println("Input first x coordinate");
      int x1  = console.nextInt();
      System.out.println("Input first y coordinate");
      int y1  = console.nextInt();
      System.out.println("Input second x coordinate");
      int x2  = console.nextInt();
      System.out.println("Input second y coordinate");
      int y2  = console.nextInt();
      
      int numerator = y2 - y1;
      int denomenator = x2 - x1;
      double slope = (double)numerator/denomenator; 
      
      if (x1 == x2 && y1 == y2)
      {
         System.out.println ("Sorry, input two different coordinates");
      }
      else 
      {
      
      
         if (slope == 0.0)
         {
            System.out.println ("Alert! The line is horizontal");
         }
         else if (denomenator == 0)
         {
            System.out.println ("Alert! The line is vertical");
         }
         else
         {
            System.out.println ("The slope of the line is: " + slope);
         }
      }
   }  
}

/*
 Input first x coordinate
 6
 Input first y coordinate
 -8
 Input second x coordinate
 6
 Input second y coordinate
 12
 Alert! The line is vertical
*/

/*
 Input first x coordinate
 -3
 Input first y coordinate
 7
 Input second x coordinate
 5
 Input second y coordinate
 7
 Alert! The line is horizontal
*/

/*
 Input first x coordinate
 3
 Input first y coordinate
 5
 Input second x coordinate
 5
 Input second y coordinate
 8
 The slope of the line is: 1.5
*/

/*
//this is to test what will happen if both coordinates are the same.
 
 Input first x coordinate
 5
 Input first y coordinate
 6
 Input second x coordinate
 5
 Input second y coordinate
 6
 Sorry, input two different coordinates
*/

