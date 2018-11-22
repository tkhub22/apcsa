import javax.swing.*;
public class Driver04
{
   public static void main (String [] args)
   {
      JFrame frame = new JFrame ("Assignment 4");
      frame.setSize(400,350);
      frame.setLocation(200,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel04());
      frame.setVisible(true);
   }
}