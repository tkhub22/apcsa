import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel04 extends JPanel
{
   private JLabel label;
   public Panel04()
   {
      setLayout(new FlowLayout());
      
      label = new JLabel("0.000000000000000");
      label.setFont(new Font("Serif", Font.BOLD, 20));
      label.setForeground(Color.blue);
      add(label);
      
      JButton button = new JButton ("Random");
      button.addActionListener(new Listener());
      add(button);  
   }
   
   private class Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         double x = Math.random();
         label.setText("" + x);
      }
   }
}