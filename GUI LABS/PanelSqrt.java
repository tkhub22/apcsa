import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelSqrt extends JPanel
{
   private JLabel label;
   private JTextField box;
   private JButton button;
   public PanelSqrt()
   {
      setLayout(new FlowLayout());
      
      
      box = new JTextField("0.0");
      box.setHorizontalAlignment(SwingConstants.RIGHT);
      add(box);
      
      
      button = new JButton ("SQRT");
      button.addActionListener(new Listener()
      {
      @Override
      public void actionPerformed(ActionEvent e)
      {
      double d = Double.parseDouble(box.getText());
      label.setText(""+ Math.sqrt(d));
      }
      });
      add(button);
      
      
      label = new JLabel("0.0");
      label.setFont(new Font("Serif",Font.BOLD,20));
      label.setForeground(Color.blue);
      add(label); 
        
      
   }
   
}