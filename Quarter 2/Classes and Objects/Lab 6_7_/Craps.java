/******************
Aditya Tikhe
Period 7
Lab 7
Due Date: Nov. 17
Date Submitted: Nov. 17
Pre-condition: The dice class is in the same folder as 
               the craps and craps tester lab.
Post-condition: none
What I learned: 
   a: By doing this lab I reviewed how to work with loops, if statements, and methods. 
   b: I also learned how to call a class and utilize it within another class.
Purpose: The purpose of this lab is to simulate a game of craps where one has
         to roll 2 die. If they roll a sum of 7 or 11 on the first turn they win
         or if they roll a sum of 2 or 12 they lose. After, the first roll, the sum
         becomes the set point and you have 4 other rolls to achieve the set point to win.
         If you don't win within 5 turns you lose!
******************/
public class Craps
{
   private Dice dice1;
   private Dice dice2;
   
   public Craps()
   {
      dice1 = new Dice();
      dice2 = new Dice();
   }
   public void crapsGame()
   {
      boolean win = false;
      int i=1;
      int setPoint = 0;
      for( i = 1; i <=5; i++)
      {
         dice1.roll();
         dice2.roll();
         int side1 = dice1.currentSide();
         int side2 = dice2.currentSide();
         int sum = side1 + side2;
        
         if (i ==1)//first turn
         {
            if((sum == 7) || (sum == 11))
            {
               System.out.println("You rolled a " + side1 + " and a " + side2);
               System.out.println("Congratulations - you rolled a " + sum + " first role to win!"); 
               System.out.println("Thanks for playing!");
               win = true;
               break;
            }
            else if ((sum ==2) || (sum == 12))
            {
               System.out.println("You rolled a " + side1 + " and a " + side2);
               System.out.println("I am sorry - you rolled a " + sum + " to lose");
               System.out.println("Thanks for playing!");
               win = false;
               break;
            }
            else 
            {
               System.out.println("You rolled a " + side1 + " and a " + side2);
               setPoint = sum; 
               System.out.println("Your set point is " + setPoint);
            }
         }
         else 
         {
            if (sum == setPoint)
            {
               System.out.println("You rolled a " + side1 + " and a " + side2);
               System.out.println("Congratulations - you rolled a " + sum + " to win!");
               win = true;
               break; 
            }
            else if ((sum ==7) || (sum == 11))
            {
               System.out.println("You rolled a " + side1 + " and a " + side2);
               System.out.println("I am sorry - you rolled a " + sum + " to lose");
               win = false;
               break;
            }
            else 
            {
               System.out.println("You rolled a " + side1 + " and a " + side2);
               win = false;
            }  
         }
      }//for loop
      System.out.println("Thanks for playing!");
      
      if(win)
      {
         System.out.println("Game over, you WON in " + i + " rolls ");  
      }
      else
      {
         System.out.println("Game over, you LOST in " + i + " rolls ");  
      }
   }//end of method
}