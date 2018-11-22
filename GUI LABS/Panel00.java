import javax.swing.*;
import java.awt.*;

public class Panel00 extends JPanel
{
   private JLabel labelT, labelB, labelR, labelL;
   
   public Panel00()
   {
      setLayout(new BorderLayout());
      
      labelT = new JLabel("Top");
      labelT.setHorizontalAlignment(SwingConstants.CENTER);
      add(labelT, BorderLayout.NORTH);
      
      
      labelB = new JLabel("Bottom");
      labelB.setHorizontalAlignment(SwingConstants.CENTER);
      add(labelB, BorderLayout.SOUTH); 
      
      
      labelR = new JLabel("Right");
      add(labelR, BorderLayout.EAST);
      
      
      labelL = new JLabel("Left");
      add(labelL, BorderLayout.WEST);
      
      JLabel labelC = new JLabel("Center");
      labelC.setHorizontalAlignment(SwingConstants.CENTER);
      add(labelC, BorderLayout.CENTER); 

   }
}