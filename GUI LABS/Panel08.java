import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel08 extends JPanel
{
   JPanel southPanel;
   
   private JButton buttonRd;
   private JButton buttonC;
   private JButton buttonR;
   private JButton buttonQ;

   private JTextField box;
   
   public Panel08()
   {
      
      setLayout(new BorderLayout());
      JPanel north = new JPanel();
      JPanel south = new JPanel();
      
      box = new JTextField("0.0");
      box.setHorizontalAlignment(SwingConstants.RIGHT);
      add(box);
      
      southPanel = new JPanel(new FlowLayout());
      add(southPanel, BorderLayout.SOUTH);
      buttonRd = new JButton("Random");
      southPanel.add(buttonRd);
      buttonC = new JButton("Cube Root");
      southPanel.add(buttonC);
      buttonR = new JButton("Reciprocal");
      southPanel.add(buttonR);
      buttonQ = new JButton("Quit");
      southPanel.add(buttonQ);
      
      buttonRd.addActionListener(new Listener1());
      buttonC.addActionListener(new Listener2());
      buttonR.addActionListener(new Listener3());
      buttonQ.addActionListener(new Listener4());
      
      
   }
   
   private class Listener1 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         double d = Double.parseDouble(box.getText());
         buttonRd.setText(""+ Math.sqrt(d));
      }
   }
   
   private class Listener2 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         double d = Double.parseDouble(box.getText());
         buttonC.setText(""+ Math.pow(d, 1.0/3.0));
      }
   }
   
   private class Listener3 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         double d = Double.parseDouble(box.getText());
         buttonR.setText(""+ 1/d);
      }
   }
   private class Listener4 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         System.exit(0);
      }
   }
}