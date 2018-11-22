/*******************************************************************
Aditya Tikhe
Period 7
Lab 6
Due Date: Oct 4 
Date Submitted: Oct 4 
What I learned: 
   a. How to use, invoke, and write different methods.
   
Purpose: The purpose of this program is to use different methods to acheive the same
result as Lab 2.2, printing the date in American and European format.
 
*******************************************************************/

public class Date__
{ 
   public static void main (String [] args)
   { 
      
      String day = "Monday"; 
      int date = 12;
      String month = "September";
      int year = 2016;
      
      System.out.println ("American Format:");
      printAmerican(day, date, month, year);
      System.out.println ("European Format:");
      printEuropean(day, date, month, year);
      
   }
  
         
   public static void printAmerican (String day, int date, String month, int year) 
   {
      System.out.println (day + ", " + month+ " " + date + ", " + year);
   }
   
   public static void printEuropean (String day, int date, String month, int year)
   { 
      System.out.println (day + " " + date + " " + month + ", " + year);
   }
} 

/*********************************

 American Format:
 Monday, September 12, 2016
 European Format:
 Monday 12 September, 2016
 
*********************************/