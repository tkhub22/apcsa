/*
Aditya Tikhe P:7 Tic Tac Toe
Due Date: Feb 28 Date Submitted Feb 28
What I learned in this lab:
   a: I practiced how to work with 2D arrays.
   b: I learned how to write methods that see if certain elements were the same
What I think of this lab:
   a: I think this lab is practical because tictactoe is common game
   b: The lab also focuses alot on working with 2d arrays rather than other aspects.
*/
public class TicTacToe
{
   private char [] [] board;
   private static final int ROWS = 3, COLUMNS = 3;
   public TicTacToe()
   {
      board = new char [ROWS][COLUMNS];
      for (int i = 0; i < ROWS; i++)
      {
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = ' ';
      }
   }  // default constructor

// post-condition: set a field in the board. The field must be unoccupied
   public void set (int i, int j, char player)
   {
      if (board [i][j] != ' ')
         throw new IllegalArgumentException ("Position occupied");
      board[i][j] = player;
   }  // set
   public String toString()
   {
      String r = "";
      for (int i = 0; i < ROWS; i++)
      {
         r = r + "|";
         for (int j = 0; j < COLUMNS; j++)
         {
            r = r + board[i][j] + "|";
         }
         r = r + "\n";
      }
      return r;
   } // toString
   public char getWinner ()
   {
      //rows
      int c = 0;
      boolean flag = false;
      char winner = ' ';
      for(int r = 0; r < board.length; r++)
      {  
         if( board[r][c] !=' ')
         {
            if ((board[r][c] == board[r][c+1] ) && ( board[r][c]== board[r][c+2]))
            {
               winner = board[r][c]; 
               flag = true; 
               break;          
            }
         }
      }
      //column
      int ro = 0;
      for(c = 0; c < board.length; c++)
      {  
         if( board[ro][c] !=' ')
         {
            if ((board[ro][c] == board[ro+1][c])&& (board[ro][c]== board[ro+2][c]))
            {
               winner = board[ro][c]; 
               flag = true; 
               break;          
            }
         }
      }
      //diagnal
      if( board[0][0] !=' ')
      {
         if((board[0][0] == board[1][1])&&(board[0][0] == board[2][2]))
         {
            winner = board[0][0];
            flag = true;
         }
      }
      if(board[0][2] != ' ')
      {
         if((board[0][2] == board[1][1])&&(board[0][2] == board[2][0]))
         {
            winner = board[0][0];
            flag = true;
         }
      }
      boolean allchecked = true;
      
      //check if all checked
      
      for( int r=0; r<ROWS;r++)
      {
         for( c=0; c<COLUMNS;r++)
         {
            if(  board[r][c] == ' ')
            {
               allchecked = false;
               break;
            }
         }     
      }
      if( flag == false && allchecked == true)
         winner = 't';
      return winner;  
   }
}