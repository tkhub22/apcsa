//go to coursematerials/after ap exam/ segment of code for code to work on mac 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
   
public class Battleship extends JPanel
{
   private JButton[][] board;
   private int[][] matrix;
   private int hits, torpedoes;
   private JLabel label;
   private JButton reset;
   public int count; 
   
   public Battleship()
   {
      setLayout(new BorderLayout());
      hits = 0;
      torpedoes = 20;
      count = 0;
      
      JPanel north = new JPanel();
      north.setLayout(new FlowLayout());
      add(north, BorderLayout.NORTH);
      label = new JLabel("You have 20 torpedoes.");
      north.add(label);
   
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(10,10));
      add(center, BorderLayout.CENTER);
      board = new JButton[10][10];
      matrix = new int[10][10];
        
      for(int r = 0; r < 10; r++)
      {
         for(int c = 0; c < 10; c++)
         {
            matrix[r][c] = 0;
            board[r][c] = new JButton();
            board[r][c].setBackground(Color.BLUE);
            board[r][c].addActionListener(new Handler1(r, c) );
            center.add(board[r][c]);
         }
      }
   
      reset = new JButton("Reset");
      reset.addActionListener( new Handler2() );
      reset.setEnabled(false);
      add(reset, BorderLayout.SOUTH);
      
      placeShip();
   }
   
   private void placeShip()
   {
      int coin = (int)((Math.random() * 2) + 1);
    	  
      int shipLength = 4;
    	  
      boolean isVertical; 
      if(coin == 1)
         isVertical = true;
      else
         isVertical = false; 
    	  
    	  
      int startRow = (int)Math.floor(Math.random() * 10);
      int startCol = (int)Math.floor(Math.random() * 10);
    	  
      int currRow = startRow;  
      int currCol = startCol;
   
   
      while(isVertical == true && shipLength > 0)
      {
         if(currRow < 10 && currCol < 10)
         {
            matrix[currRow][currCol++] = 1;
            shipLength--;
         }
         else
         {
            for(int r = 0; r < matrix.length; r++)
            {
               for(int c = 0; c < matrix[0].length; c++)
               {
                  matrix[r][c] = 0;
               
               }
            }
         	  
            shipLength = 4;
         	  
            startRow = (int)(Math.random() * 9);
            startCol = (int)(Math.random() * 9);
          	  
            currRow = startRow;  
            currCol = startCol;
         }
      }
   
      while(isVertical == false && shipLength > 0)
      {
         if(currRow < 10 && currCol < 10)
         {
            matrix[currRow++][currCol] = 1;
            shipLength--;
         }
         else
         {
            for(int r = 0; r < matrix.length; r++)
            {
               for(int c = 0; c < matrix[0].length; c++)
               {
                  matrix[r][c] = 0;
               }
            }
         	  
            shipLength = 4;
         	  
            startRow = (int)Math.floor(Math.random() * 10);
            startCol = (int)Math.floor(Math.random() * 10);
          	  
            currRow = startRow;  
            currCol = startCol;
         }
      }
   }
   
   private class Handler1 implements ActionListener
   {
      private int myRow, myCol;
      public Handler1(int r, int c)
      {
         myRow = r;
         myCol = c;
      }
      public void actionPerformed(ActionEvent e)
      {
         if(torpedoes > 0)
         {
            torpedoes--;
         
            if(matrix[myRow][myCol] == 1)
            {
               label.setText("You have " + torpedoes + " torpedoes left." + " Hit!");
               board[myRow][myCol].setBackground(Color.red);
               board[myRow][myCol].setEnabled(true);
               count++;
               if(count == 4)
               {
                  label.setText("You knocked down the ship. You win!");
                  reset.setVisible(true);
                  reset.setEnabled(true);
                  for(int r = 0; r < matrix.length; r++)
                  {
                     for(int c = 0; c < matrix[0].length; c++)
                     {
                        board[r][c].setEnabled(false);
                     }
                  }
               }
            	 
            }
            else
            {
               label.setText("You have " + torpedoes + " torpedoes left." + " Miss!");
               board[myRow][myCol].setEnabled(true);
               board[myRow][myCol].setBackground(Color.white);
               board[myRow][myCol].setEnabled(false);
       
             
               if (torpedoes==0)
               {
                  label.setText("You have no torpedoes left. You lose!");
                  reset.setVisible(true);
                  reset.setEnabled(true);
                  for(int i = 0; i <board.length; i++)
                     for(int k = 0; k< board[i].length; k++)
                     {
                        if(matrix[i][k]==1)
                           board[i][k].setBackground(Color.red);
                           
                     }					 
               }
            }
         }
      
      }   
   }
      
   private class Handler2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         for(int r = 0; r < matrix.length; r++)
         {
            for(int c = 0; c < matrix[0].length; c++)
            {
               matrix[r][c] = 0;
               board[r][c].setBackground(Color.blue);
               board[r][c].setEnabled(true);
            }
         }
       
         hits = 0;
         label.setText("You have 20 torpedoes.");
         torpedoes = 20;
         count = 0;
         placeShip();
      }  
   }

   public static void main(String[] args)
   {
   boolean USE_CROSS_PLATFORM_UI = true;
      if(USE_CROSS_PLATFORM_UI){
            try{UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());}
         catch (Exception e) {e.printStackTrace();}
         }

      JFrame frame = new JFrame("Battleship!");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setContentPane(new Battleship());
      frame.setVisible(true);
      frame.getContentPane().setBackground(Color.YELLOW);
         }
}
