/******************
Aditya Tikhe
Period 7
Lab 13
Due Date: Oct 26
Date Submitted: Oct 26
What I learned: 
   a. I learned how to work with while loops.
   b. I also practiced nesting an if statement in the while loop. 
  
Purpose: The purpose of this program is to find the drug potency of a drug every month. It calculates
         the 4% of effectiveness lost every month, and if it is below 50 percent it should be discarded. 

******************/

public class Potency
{
   public static void main (String [] args)
   {
      double effective = 100.0;
      int month = 0;
      System.out.println ("month: " + month + " effectiveness: " + effective); 
      while(effective > 50.0)
      {
         effective = effective * 0.96;
         month++; 
         System.out.println ("month: " + month + " effectiveness: " + effective); 
         if(effective <= 50.0)
         {
            System.out.println ("month: " + month + " effectiveness: " + effective + " DISCARDED");
         } 
      }
   
   }
}

/*
 month: 0 effectiveness: 100.0
 month: 1 effectiveness: 96.0
 month: 2 effectiveness: 92.16
 month: 3 effectiveness: 88.47359999999999
 month: 4 effectiveness: 84.93465599999999
 month: 5 effectiveness: 81.53726975999999
 month: 6 effectiveness: 78.27577896959998
 month: 7 effectiveness: 75.14474781081599
 month: 8 effectiveness: 72.13895789838334
 month: 9 effectiveness: 69.253399582448
 month: 10 effectiveness: 66.48326359915008
 month: 11 effectiveness: 63.82393305518407
 month: 12 effectiveness: 61.27097573297671
 month: 13 effectiveness: 58.82013670365764
 month: 14 effectiveness: 56.46733123551133
 month: 15 effectiveness: 54.20863798609088
 month: 16 effectiveness: 52.04029246664724
 month: 17 effectiveness: 49.95868076798135
 month: 17 effectiveness: 49.95868076798135 DISCARDED
*/