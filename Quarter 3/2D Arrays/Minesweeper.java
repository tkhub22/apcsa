/*
Aditya Tikhe
Period: 7
Minesweeper
Due Date: Feb 24
Date Submitted Feb 24
What I learned in this lab:
a: How to work with 2D Arrays. I learned how to pass them
What I think of this lab:
a: I think it is a great introduction to 2D arrays and good practice for it.
b: I struggled a bit with working with the methods but overall 
   working with 2D arrays is a great challenge.
*/
import java.util.Scanner;
public class Minesweeper
{
   public static void main (String [] args)
   {
      int  size = welcomeAndAskForSizeOfField();
      int  [] [] minesfield = new int [size] [size];
      char [] []outputField = new char [size][size];
      			
      init (minesfield, outputField);
      displayBombs(minesfield);
      displayOutput(outputField);
   
      boolean gameOver = false;
      while (gameOver != true)
      {
         gameOver = playGame(minesfield, outputField);
         displayOutput(outputField);		
      }
    // display the bombs when game is over
      displayBombs(minesfield);
   	
   }  // main
	
   //*********************************************  welcomeAndAskForSizeOfField
   public static int welcomeAndAskForSizeOfField()
   {
      // your code goes here
      Scanner console = new Scanner (System.in);
      System.out.println("Welcome to Minesweeper! \n Choose size of grid (Press 1 for 5x5, Press 2 for 10x10)");
      int number = console.nextInt();
      
      if(number ==1)
      {
         return 5;
      }
      else 
      {
         return 10;
      }
   } 	
   //*********************************************  init
   public static void init (int [] [] mines, char [] [] output)
   {
      for (int r = 0; r < output.length; r++)
      {
         for (int c = 0; c < output[0].length; c++)
            output[r][c] = ' ';
      }
      // generate a random mine field
      for (int r = 0; r <  mines.length; r++)
      {
         for (int c = 0; c < mines[0].length; c++)
            mines[r][c] = (int)(Math.random() * 2);
      }
   }  // init
	
   //*********************************************  displayOutput   
   public static void displayOutput (char [] [] output)
   {
      for (int r = 0; r < output.length; r++)
      {
         for (int c = 0; c < output[0].length; c++)
            System.out.print ("[" + (char)output[r][c] + "]");
         System.out.println();
      } 
   }	
   //*********************************************  countMines		
   public static int countMines (int [] [] mines, int r, int c)
   {
      int count = 0;
      if( r>0 &&c>0){
         if (mines[r-1][c-1]==1)
            count++;
      }
      if( c>0){
         if (mines[r][c-1]==1)
            count++;
      }
      if( r>0 ){
         if (mines[r-1][c]==1)
            count++;
      }
      if (mines[r+1][c+1]==1)
         count++;
      if (mines[r+1][c] ==1)
         count++;
      if (mines[r][c+1]==1)
         count++;        
      return count;   
      // why > return 0;
   }  // countMines
   //*********************************************  playGame
		
   public static boolean playGame (int [][] mines, char [] [] outputBoard)
   {
      // your code goes here
      Scanner console = new Scanner (System.in);
      
      System.out.println("Enter the row and column of the cell you want to open[row col]");
      int row = console.nextInt();
      int col = console.nextInt();
      
      if( mines[row][col] == 1)
      {
         outputBoard [row][col] = 'X';
         System.out.println("Oops you stepped on a bomb, Sorry! Game over");
         return true;
      }
      else
      {
         int ctMines= countMines(mines,row, col);
         outputBoard[row][col] = (ctMines +"").charAt(0) ;           
         mines[row][col]= -1;
         return checkStatus(mines);
      }
   }  // playGame
	
	// post: if all the cells that do not contain bombs have
	//       been marked, returns true; otherwise, returns false
   private static boolean checkStatus (int [] [] mines)
   {
      for(int r = 0; r < mines.length; r++)
      {
         for(int c = 0; c < mines[0].length; c++)
         {
            if( mines [r][c] == 0)
               return false; 
         }
      } 
      return true; 
   }
   
   public static void displayBombs (int [] [] mines)
   {
   //System.out.println("First:"+ mines.length +"Second:"+mines[0].length);
      for (int r = 0; r < mines.length; r++)
      {
         for (int c = 0; c < mines[0].length; c++)
         {
            //System.out.print ("[" + mines[r][c] + "]");
         }
         System.out.println();
      } 
   }
} // Minesweeper
/*
 Welcome to Minesweeper! 
  Choose size of grid (Press 1 for 5x5, Press 2 for 10x10)
 1
 
 
 
 
 
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter the row and column of the cell you want to open[row col]
 2
 3
 Oops you stepped on a bomb, Sorry! Game over
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][X][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
*/
/*
 Welcome to Minesweeper! 
  Choose size of grid (Press 1 for 5x5, Press 2 for 10x10)
 1
 
 
 
 
 
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter the row and column of the cell you want to open[row col]
 2
 3
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][5][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter the row and column of the cell you want to open[row col]
 1
 1
 Oops you stepped on a bomb, Sorry! Game over
 [ ][ ][ ][ ][ ]
 [ ][X][ ][ ][ ]
 [ ][ ][ ][5][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
*/