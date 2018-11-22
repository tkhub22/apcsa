import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ResetListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		JButton xButton = (JButton) e.getSource();		
		JFrame frame = (JFrame) SwingUtilities.getRoot(xButton);
		JPanel northpanel = (JPanel) frame.Jpanel;
		JPanel southpanel = (JPanel) frame.Jpanel;
		JButton[][] pennies = northpanel.pennies;
		
		
		for(int r = 0; r < 5; r++)
		{
			for(int c = 0; c < 5; c++)
			{
				if(r == 2 && c == 2)
					panel.pennies[r][c].setText("3");
				else if(r == 0 || r == 5 || c == 0 || c == 5)
					panel.pennies[r][c].setText("1");
				else
					panel.pennies[r][c].setText("2");
			}
		}
		
		xButton.setEnabled(false);
		southpanel.total.setText("");
		
		for(int r = 0; r < 5; r++)
		{
			for(int c = 0; c < 5; c++)
			{
				if(r == 2 && c == 2)
				{
					pennies[r][c].setText("3");
					pennies[r][c].setBackground(Color.YELLOW);
				}
				else if((r > 0 && r < 4) && (c > 0 && c < 4))
				{
					pennies[r][c].setText("2");
					pennies[r][c].setBackground(Color.YELLOW);
				}
				else
				{
					pennies[r][c].setText("1");
					pennies[r][c].setBackground(Color.YELLOW);
				}
			}
		}
		
		southpanel.throwPenny.setEnabled(true);
		southpanel.numThrows = 0;
		northpanel.totalAmount = 0;
		southpanel.total.setText("0");
	}
}
