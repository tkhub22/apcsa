import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel00 extends JPanel
{
	private JButton buttonNorth;
	private JButton buttonEast;
	private JButton buttonSouth;
	private JButton buttonWest;
	private JButton cButton;
	
	private ImageIcon picture;
	
	private JTextField southText;
	
	public Panel00()
	{
		setLayout(new BorderLayout());
		
		southText = new JTextField(240);
		
		
		picture = new ImageIcon("/Users/MacBook/Downloads/Owl.jpg");
		cButton = new JButton(picture);
		add(cButton, BorderLayout.CENTER);
		
		buttonNorth = new JButton("North button");
		add(buttonNorth, BorderLayout.NORTH);
		buttonNorth.setForeground(Color.red);
		buttonNorth.setBackground(Color.green);
		buttonNorth.setFont(new Font("Helvetica", Font.ITALIC, 24));
		buttonNorth.addActionListener(new Listener1());
		
		buttonEast = new JButton("<HTML>top line<br>second line</HTML>");
		add(buttonEast, BorderLayout.EAST);
		buttonEast.setForeground(Color.blue);
		buttonEast.setBackground(Color.black);
		buttonEast.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		
		buttonSouth = new JButton("South button");
		add(buttonSouth, BorderLayout.SOUTH);
		buttonSouth.setForeground(Color.white);
		buttonSouth.setBackground(Color.orange);
		buttonSouth.add(southText);
		southText.addActionListener(new Listener2());
		
		buttonWest = new JButton("West button");
		add(buttonWest, BorderLayout.WEST);
		buttonWest.setForeground(Color.pink);
		buttonWest.setBackground(Color.cyan);
		
	}

	private class Listener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("afdasdf");
			picture = new ImageIcon("/Users/MacBook/Downloads/a.gif");
			cButton.setIcon(picture);
		}
	}
	
	private class Listener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			southText.setText("the end");
		}
	}
}