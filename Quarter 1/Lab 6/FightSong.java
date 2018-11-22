/************************************************
Aditya Tikhe
Period 7
Lab 6 (fight song) 
Due Date: Oct 4
Date Submitted: Oct 4
What I learned: 
   a. How to implement static variables. Static variables are used to make programs less redundant.
   
Purpose: The purpose of the program is to abridge the fight song by using static variables.  

***********************************************/

public class FightSong 
{

   static String chorus = ("Go, team, go! \nYou can do it.");
   static String west = ("Go, team, go! \nYou can do it. \nYou're the best, \nIn the West. \nGo, team, go! \nYou can do it.\n");

   public static void main(String[] args) 
   {
   
      
      System.out.println(chorus);
      System.out.println();
      System.out.println(west);
      System.out.println(west);
      System.out.println(chorus);
   }
}

/*********************
 Go, team, go! 
 You can do it.
 
 Go, team, go! 
 You can do it. 
 You're the best, 
 In the West. 
 Go, team, go! 
 You can do it.
 
 Go, team, go! 
 You can do it. 
 You're the best, 
 In the West. 
 Go, team, go! 
 You can do it.
 
 Go, team, go! 
 You can do it.
 
************************/