
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PennyPitch extends JPanel
{
   private JButton throwButton, resetButton;
   private JTextField textField;
   private JPanel center;
   private JPanel buttons;
   private Square[][] board;
   private JButton[][] matrix;
   int sum = 0;
   int count = 0;
    
   public PennyPitch()
   {
      setLayout(new BorderLayout());
    	
      center = new JPanel();
      center.setLayout(new GridLayout(5,5));
      add(center, BorderLayout.CENTER);
        
      buttons = new JPanel();
      add(buttons, BorderLayout.SOUTH);
        
      throwButton = new JButton("THROW");
      buttons.add(throwButton);
        
      textField = new JTextField("0", 10);
      buttons.add(textField);
        
      resetButton = new JButton("RESET");
      buttons.add(resetButton);
   
      board = new Square[5][5];
      matrix = new JButton[5][5];
        
      generateBoard();
        
      resetButton.setEnabled(false);
        
      throwButton.addActionListener(new Listener());
      resetButton.addActionListener(new Listener());
   }
    
    
   private void generateBoard()
   {
      for(int r = 0; r < 5; r++)
      {
         for(int c = 0; c < 5; c++)
         {
            if (r==0 || r==board.length-1)
            {
               board[r][c] = new Square(1,false);
               matrix[r][c] = new JButton("1");
            }
            else if (c==0 || c==board.length-1)
            {
               board[r][c] = new Square(1,false);
               matrix[r][c] = new JButton("1");
            }
             		
            else if (r==2 && c==2)
            {
               board[r][c] = new Square(3,false);
               matrix[r][c] = new JButton("3");
            
            }
            else
            {
               board[r][c] = new Square(2, false);
               matrix[r][c] = new JButton("2");
            }
            matrix[r][c].setBackground(Color.YELLOW);
            center.add(matrix[r][c]);
         }
      }
   }
    
    
   private void pennyToss()
   {
      int r = (int)(Math.random()*board.length);
      int c = (int)(Math.random()*board.length);
    	
      if (board[r][c].getValue() == true)
      {
         return;
      }
      else
      {
         matrix[r][c].setText("P");
         matrix[r][c].setBackground(Color.RED);
         board[r][c].setValue(true);
      
         sum += board[r][c].getNumber();
         textField.setText(sum + "");
      
         count++;
      }
   }
   
    
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == throwButton)
         {
            pennyToss();
         	
            if (count >= 5)
            {
               throwButton.setEnabled(false);
               resetButton.setEnabled(true);
            }
         }
         
         else if (e.getSource() == resetButton)
         {
            for(int r = 0; r < 5; r++)
            {
               for(int c = 0; c < 5; c++)
               {
                  board[r][c] = null;
               }
            }
            resetButton.setEnabled(false);
         	
            for(int r = 0; r < 5; r++)
            {
               for(int c = 0; c < 5; c++)
               {
                  if (r==0 || r==board.length-1)
                  {
                     board[r][c] = new Square(1,false);
                     matrix[r][c].setText("1");
                  }
                  else if (c==0 || c==board.length-1)
                  {
                     board[r][c] = new Square(1,false);
                     matrix[r][c].setText("1");
                  }
                   		
                  else if (r==2 && c==2)
                  {
                     board[r][c] = new Square(3,false);
                     matrix[r][c].setText("3");
                  
                  }
                  else
                  {
                     board[r][c] = new Square(2, false);
                     matrix[r][c].setText("2");
                  }
                  matrix[r][c].setBackground(Color.YELLOW);
                  center.add(matrix[r][c]);
               }
            }
                 
            textField.setText("0");
            count = 0;
            sum = 0;
         	
            throwButton.setEnabled(true);
         }
      }
   }
   
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Penny Pitcher!");
      frame.setSize(300, 220);
      frame.setLocation(200, 100);
      frame.setContentPane(new PennyPitch());
      frame.setVisible(true);
   
   }

}