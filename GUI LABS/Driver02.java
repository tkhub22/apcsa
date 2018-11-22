import javax.swing.*;

public class Driver02
{
   public static void main(String [] args)
   {
      JFrame frame = new JFrame("Assignment 2");
      frame.setSize(1000,1000);
      frame.setLocation(200,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelSqrt());
      frame.setVisible(true);
   }
}