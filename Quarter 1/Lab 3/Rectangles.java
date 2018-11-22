/**
Aditya Tikhe
Period 7
Lab 3
Due Date: Sept 20
Date Submitted: Sept 20
What I learned: 
   a. How to use and import a scanner. A scanner
       is used for the programmer to import a value.
   b. How to multiply and add variables. Also, learned
       that parenthesis are necessary. 
   
Purpose: The purpose of this program is to insert 2 integers and print
 out the area and perimeter of them.

**/

import java.util.Scanner;

public class Rectangles
{
   public static void main (String [] args)
   {
      
   Scanner console = new Scanner (System.in);
   
   System.out.println ("Insert a width here =>"); 
   
      int width = console.nextInt(); //enter width
      
   System.out.println ("Insert a height here =>");
   
      int height = console.nextInt(); //enter height
   
   
   System.out.println ("Area:" + height*width);
   System.out.println ("Perimeter:" + (2*height + 2*width));
   
   } // end main
} // end of Rectangles

/****************
Insert a width here =>
 4
 Insert a height here =>
 5
 Area:20
 Perimeter:18

****************/
