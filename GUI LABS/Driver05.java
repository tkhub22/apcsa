import javax.swing.*;
public class Driver05
{
   public static void main (String [] args)
   {
      JFrame frame = new JFrame ("Assignment 5");
      frame.setSize(400,350);
      frame.setLocation(200,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel05());
      frame.setVisible(true);
   }
}