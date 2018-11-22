/********************************************************************************
Aditya Tikhe
Period 7
Lab 2
Due Date: Sept 16
Date Submitted: Sept 16
What I learned: 
- Java is case sensitive. (String needs to be capitalized because it is a class.)
- How to print and create Strings and integers.
- Have to use ';' after every line.
This program is working with integers and printing them with strings. Its function
is to print the same integer in different formats. (American format and European format) 
********************************************************************************/

public class Date
{ 
   public static void main (String [] args)
   {
      String day = "Monday"; 
      int date = 12;
      String month = "September";
      int year = 2016;
   
      System.out.println ("American format:");
      System.out.println (day + ", " + month+ " " + date + ", " + year);
      System.out.println ("European format:");
      System.out.println (day + " " + date + " " + month + ", " + year);
      
   } //end of main
} //end of Date

/*******************************
    American format:
 Monday, September 12, 2016
 European format:
 Monday 12 September, 2016

*******************************/

