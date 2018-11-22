import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel02 extends JPanel
{
   
   private JButton rightButton;
   private JButton leftButton;
   private JButton topButton;
   private JButton bottomButton;
   private JButton centerButton;
   private ImageIcon picture;
   private JTextField southText;
   private JButton sButton;
   
   public Panel02()
   {
      setLayout(new BorderLayout());
      
      rightButton = new JButton("Teddy is very cute!");
      add(rightButton, BorderLayout.EAST);
      rightButton.setForeground(Color.red);
      rightButton.setBackground(Color.yellow);
      rightButton.setFont(new Font("Helvetica", Font.ITALIC, 24));
      rightButton.addActionListener(new Listener1());
      
      leftButton = new JButton("His name is Teddy");
      add(leftButton, BorderLayout.WEST);
      leftButton.setForeground(Color.green);
      leftButton.setBackground(Color.yellow);
      leftButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
      leftButton.addActionListener(new Listener2());
      
      topButton = new JButton("Meet the new dog.");
      add(topButton, BorderLayout.NORTH);
      topButton.setForeground(Color.blue);
      topButton.setBackground(Color.pink);
      topButton.setFont(new Font("Helvetica", Font.ITALIC, 24));
      topButton.addActionListener(new Listener3());

      
      bottomButton = new JButton("We love Teddy!");
      add(bottomButton, BorderLayout.SOUTH);
      bottomButton.setForeground(Color.black);
      bottomButton.setBackground(Color.white);
      bottomButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
      bottomButton.addActionListener(new Listener4());
      
      picture = new ImageIcon("dog.jpg");
      centerButton = new JButton("Center");
      add(centerButton, BorderLayout.CENTER);
      centerButton.addActionListener(new Listener5());
      
      sButton = new JButton("This is before I hit the Enter key...");
      southText = new JTextField(240);
      sButton.add(southText);
      southText.addActionListener(new Listener6( ));
      
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         rightButton.setText("This is the East");
      }
   }
   private class Listener2 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         leftButton.setText("This is the West");
      }
   }
   private class Listener3 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         topButton.setText("This is the North");
      }
   }
   private class Listener4 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         bottomButton.setText("This is the South");
      }
   }
   private class Listener5 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         centerButton.setText("This is the Center");
      }
   }
   private class Listener6 implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         southText.setText("The end.");
      }
   }
}
