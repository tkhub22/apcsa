/*******************************************************************
Aditya Tikhe
Period 7
Lab 6 
Due Date: Oct 4
Date Submitted: Oct 4 
What I learned: 
   a. How to invoke different methods.
   b. How to use different math operators to be plugged into an equation.
      As well as learning the syntax of the math operators. 
  
Purpose: The purpose of the program is to take in three operands and
          compute in the a*b+c format. 
 
*******************************************************************/

public class Multadd
{
   public static void main (String [] args)
   {
   
      System.out.println(multAdd(1.0,2.0,3.0));
   
      
      double a = Math.sin(1/4);
      double b = Math.PI/180.0;
      double c = Math.cos(Math.toRadians((Math.PI/4)*.5));
      System.out.println(multAdd(a,b,c));
      double d = Math.log10(10);
      int e = 1;
      double f = Math.log10(20);
      System.out.println(multAdd(d,e,f));
      System.out.println(yikes(0));
      System.out.println(yikes(1));
   
   }
   
   public static double multAdd (double a, double b, double c)
   {
      return a*b+c;
   }
   
   public static double yikes (double x)
   {
      double e = Math.E;
      double a = x;
      double b = Math.pow(e, -x);
      double c = Math.sqrt(1-b);
      multAdd(a,b,c);
      return a*b+c;
   }
   
}

/*********************

 5.0
 0.9999765121745486
 2.3010299956639813
 0.0
 1.1629395387920924
 
*********************/