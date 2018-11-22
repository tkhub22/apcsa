import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultipleButtons extends JPanel
{

   private JLabel label;
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   public MultipleButtons()
   {
      setLayout(new FlowLayout());
     
      
      label = new JLabel("0.0");
      label.setFont(new Font("Serif",Font.BOLD,40));
      label.setForeground(Color.red);
      
      add(label); 
      
      button1 = new JButton ("Random");
      add(button1);
      button1.addActionListener(new Listener1());
   
      button2 = new JButton ("Cube Root");
      add(button2);
      button2.addActionListener(new Listener2());
   
      button3 = new JButton ("Reciprocal");
      add(button3);
      button3.addActionListener(new Listener3());
   
      button4 = new JButton ("Quit");
      add(button4);      
      button4.addActionListener(new Listener4());
   }
       
   private class Listener1 implements ActionListener{
      public void actionPerformed(ActionEvent e)
      {
         double d = Double.parseDouble(label.getText());
         label.setText(""+ Math.random()*100);
      }
   }
      
   private class Listener2 implements ActionListener{
      public void actionPerformed(ActionEvent e)
      {
         double d = Double.parseDouble(label.getText());
         label.setText(""+ Math.pow(d, 1.0/3.0));
      }
   }
       
   private class Listener3 implements ActionListener{
      public void actionPerformed(ActionEvent e)
      {
         double d = Double.parseDouble(label.getText());
         label.setText(""+ (double)(1/d));
      }
   }
      
   private class Listener4 implements ActionListener{
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }

      
              
      
   
   
}