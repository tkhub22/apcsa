import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel05 extends JPanel
{
   JPanel northPanel;
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   
   public Panel05()
   {
      setLayout(new BorderLayout());
      
      northPanel = new JPanel(new FlowLayout());
      add(northPanel, BorderLayout.NORTH);
      button1 = new JButton("Red");
      northPanel.add(button1);
      button2 = new JButton("Green");
      northPanel.add(button2);
      button3 = new JButton("Blue");
      northPanel.add(button3);
      button4 = new JButton("Gray");
      northPanel.add(button4);
      
      button1.addActionListener(new Listener1());
      button2.addActionListener(new Listener2());
      button3.addActionListener(new Listener3());
      button4.addActionListener(new Listener4());
    }
      
      
      private class Listener1 implements ActionListener
      {
         public void actionPerformed (ActionEvent e)
         {
            setBackground(Color.RED);
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed (ActionEvent e)
         {
            setBackground(Color.GREEN);
         }
      }
      private class Listener3 implements ActionListener
      {
         public void actionPerformed (ActionEvent e)
         {
            setBackground(Color.BLUE);
         }
      }
      private class Listener4 implements ActionListener
      {
         public void actionPerformed (ActionEvent e)
         {
            setBackground(Color.GRAY);
         }
      }
}
   

   
   
