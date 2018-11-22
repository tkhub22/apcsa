import java.awt.*;
import javax.swing.*;

public class PennyPitchDriver 
{	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Penny Pitcher");
		frame.setSize(450, 350);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setContentPane(new PennyPitchPanel());
		frame.setLayout(new GridLayout(5, 5, 0, 0));
		frame.setVisible(true);
	}
}
