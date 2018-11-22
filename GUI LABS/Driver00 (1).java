import javax.swing.*;

public class Driver00
{
	public static void main(String[] args)
	{
		try
			{UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());}
		catch (Exception e)
			{e.printStackTrace();}
		JFrame frame = new JFrame("Tester");
		frame.setSize(800, 400);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel00());
		frame.setVisible(true);
	}
}
