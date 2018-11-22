import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Button extends JPanel
{
   private JButton nButton, cButton;
   private ImageIcon picture;
   
   public Button ()
   {
      nButton = new JButton("Top");
      picture = new ImageIcon("karel.gif");
      cButton = new JButton(picture);
      add(nButton, BorderLayout.NORTH);
      add(cButton, BorderLayout.CENTER);
      nButton.setForeground(Color.green);
      nButton.setBackground(Color.blue);
      nButton.setFont(new Font("Helvetica", Font.ITALIC,24));
   }
}