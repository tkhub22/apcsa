/******************
Aditya Tikhe
Period 7
Lab 6
******************/
public class DiceTester
{
   public static void main (String [] args)
   {
      Dice d = new Dice ();
      System.out.println(d.currentSide()); 
      
      for (int k =1; k <=5; k++)
      {
         d.roll();
         System.out.println("\nCurrent side: " + d.currentSide());
      }
   }
}

/*
 2
 
 Current side: 2
 
 Current side: 1
 
 Current side: 3
 
 Current side: 5
 
 Current side: 6
*/