import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel06 extends JPanel
{
   JPanel northPanel;
   private JButton button1;
      
   public Panel06()
   {
      setLayout(new BorderLayout());
      
      northPanel = new JPanel(new FlowLayout());
      add(northPanel, BorderLayout.NORTH);
      button1 = new JButton("Color");
      setBackground(Color.RED);
      northPanel.add(button1);

      
      button1.addActionListener(new Listener1());

    }
      
      
      private class Listener1 implements ActionListener
      {
         public void actionPerformed (ActionEvent e)
         {
            
            if(getBackground().equals(Color.RED))
               setBackground(Color.GREEN);
            else if(getBackground().equals(Color.GREEN))
               setBackground(Color.BLUE);
            else if(getBackground().equals(Color.BLUE))
               setBackground(Color.GRAY);
            else if(getBackground().equals(Color.GRAY))
               setBackground(Color.RED);
            else if(getBackground().equals(Color.RED))
               setBackground(Color.GREEN);
            else if(getBackground().equals(Color.GREEN))
               setBackground(Color.BLUE);
            else if(getBackground().equals(Color.BLUE))
               setBackground(Color.GRAY);
            else if(getBackground().equals(Color.GRAY))
               setBackground(Color.RED);
            else if(getBackground().equals(Color.RED))
               setBackground(Color.GREEN);
            else if(getBackground().equals(Color.GREEN))
               setBackground(Color.BLUE);
            else if(getBackground().equals(Color.BLUE))
               setBackground(Color.GRAY);
            else if(getBackground().equals(Color.GRAY))
               setBackground(Color.RED);
               
         }
      }
}