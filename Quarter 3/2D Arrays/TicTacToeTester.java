import javax.swing.JOptionPane;

public class TicTacToeTester
{
   public static void main (String [] args)
   {
      char winner=' ';
      char player = 'x';
      TicTacToe game = new TicTacToe();
      while (true)
      {
         System.out.println (game);
         String input = JOptionPane.showInputDialog ("Row for " +
                        player + " (from 0-2 and press Cancel to exit)");
         if (input == null) System.exit(0);
      	
         int row = Integer.parseInt (input);
         input = JOptionPane.showInputDialog ("Column for " + player +
                                              " from 0-2 and press Cancel to exit)") ;
         int column = Integer.parseInt (input);
         game.set (row, column, player);
         winner = game.getWinner();
         
         if(winner != ' ')
         {   
            if( winner !='t')
               System.out.println(winner+" is the winner \n Thanks for playing");
            else
               System.out.println("Tie");
         
            break;
         }           
         //System.out.println("winnr = " +winner);
         if (player == 'x')
            player = 'o';
         else
            player = 'x';
      }// while
   }  // main
} // TicTacToeTester
/*
 | | | |
 | | | |
 | | | |
 
 |x| | |
 | | | |
 | | | |
 
 |x| | |
 |o| | |
 | | | |
 
 |x|x| |
 |o| | |
 | | | |
 
 |x|x| |
 |o| |o|
 | | | |
 //last x was 0,2
 x is the winner 
  Thanks for playing
*/
/*
 | | | |
 | | | |
 | | | |
 
 |x| | |
 | | | |
 | | | |
 
 |x| | |
 |o| | |
 | | | |
 
 |x| | |
 |o|x| |
 | | | |
 
 |x|o| |
 |o|x| |
 | | | |
 //last x was 2,2
 x is the winner 
  Thanks for playing
*/
/*
 | | | |
 | | | |
 | | | |
 
 | | | |
 | | | |
 | | |x|
 
 | | | |
 | | | |
 | |o|x|
 
 | | |x|
 | | | |
 | |o|x|
 
 | | |x|
 | |o| |
 | |o|x|
 //last spot was 1,2
 x is the winner 
  Thanks for playing
*/