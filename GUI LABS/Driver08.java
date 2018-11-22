import javax.swing.*;
public class Driver08
{
   public static void main (String [] args)
   {
      JFrame frame = new JFrame ("Multiple Listeners");
      frame.setSize(400,350);
      frame.setLocation(200,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new MultipleButtons());
      frame.setVisible(true);
   }
}