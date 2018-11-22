import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ThrowListener implements ActionListener
{
	private int row, col; 
	
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "Throw Listener Listener", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
		JButton xButton = (JButton) e.getSource();		
		JFrame frame = (JFrame) SwingUtilities.getRoot(xButton);
		JPanel northpanel = (JPanel) frame.Jpanel;
		JPanel southpanel = (JPanel) frame.Jpanel;
		PennyPitchPanel panel = (PennyPitchPanel) frame.getContentPane();
		
		row = (int)(Math.random() * 5);
		col = (int)(Math.random() * 5);
				
		JOptionPane.showMessageDialog(null, "row " + row + "col" + col, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
		
		while(northpanel.pennies[row][col].getText().equals("P"))
		{
			row = (int)(Math.random() * 5);
			col = (int)(Math.random() * 5);
		}
		
		northpanel.totalAmount += Integer.parseInt(northpanel.pennies[row][col].getText());
		northpanel.pennies[row][col].setText("P");
		northpanel.pennies[row][col].setBackground(Color.ORANGE);
		
		southpanel.total.setText("" + northpanel.totalAmount);
		southpanel.numThrows++;
		
		if (southpanel.numThrows >=5)
		{
			southpanel.throwPenny.setEnabled(false);
			southpanel.reset.setEnabled(true);
		}
	}
}

