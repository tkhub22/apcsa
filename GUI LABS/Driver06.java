import javax.swing.*;
public class Driver06
{
   public static void main (String [] args)
   {
      JFrame frame = new JFrame ("Assignment 6");
      frame.setSize(400,350);
      frame.setLocation(200,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel06());
      frame.setVisible(true);
   }
}