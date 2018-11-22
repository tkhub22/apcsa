/************************************************
Aditya Tikhe
Period 7
Lab 4b
Due Date: Sept 22
Date Submitted: Sept 26 (I submitted late because I was out (sick)
                        for one class and you told me to turn the lab in
                        next class (sept 26). 
What I learned: 
   a. I learned to use the % operator. 
      This operator gives the remainder of what is being divided.

Purpose: The purpose of this experiment is to input a four digit number, and
insert each of the digits on a seperate line. 

***********************************************/

import java.util.Scanner;

public class DisplayVertical
{
   public static void main (String [] args)
   {
   Scanner console = new Scanner (System.in);
   
   System.out.println ("Please insert a 4 digit number:");
      int number = console.nextInt(); 
      
   System.out.println (number/1000);
   System.out.println ((number%1000)/100);
   System.out.println ((number%100)/10);
   System.out.println ((number%10)/1);
   
   } //end of main
} //end of DisplayVertical
   
   /********************
   Please insert a 4 digit number:
 1234
 1
 2
 3
 4
   
   ********************/