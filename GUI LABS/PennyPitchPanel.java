import java.awt.*;
import javax.swing.*;

public class PennyPitchPanel extends JPanel
{
	public JButton[][] pennies; 
	public int totalAmount, numThrows; 
	private JButton throwPenny, reset; 
	public JTextField total;  
	public JPanel north, south; 
	
	public PennyPitchPanel() 
	{
		north = new JPanel();
        north.setLayout(new GridLayout(5, 5, 0, 0));
        add(north, BorderLayout.NORTH);
        
        south = new JPanel();
        south.setLayout(new FlowLayout());
        add(south, BorderLayout.SOUTH);
        this.
        
        totalAmount = 0;
		total = new JTextField(totalAmount);
		add(total, south);
		
		JButton[][] pennies = new JButton[5][5];
		for(int r = 0; r < 5; r++)
		{
			for(int c = 0; c < 5; c++)
			{
				if(r == 2 && c == 2)
				{
					pennies[r][c] = new JButton("3");
					add(pennies[r][c]);
					pennies[r][c].setBackground(Color.YELLOW);
				}
				else if((r > 0 && r < 4) && (c > 0 && c < 4))
				{
					pennies[r][c] = new JButton("2");
					//add(pennies[r][c], north);
					add(pennies[r][c], new GridLayout(5, 5, 0, 0));
					pennies[r][c].setBackground(Color.YELLOW);
				}
				else
				{
					pennies[r][c] = new JButton("1");
					//add(pennies[r][c], north);
					add(pennies[r][c], new GridLayout(5, 5, 0, 0));
					pennies[r][c].setBackground(Color.YELLOW);
				}
			}
		}
		
		throwPenny = new JButton("THROW");
		add(throwPenny, south);
		if(numThrows >= 5)
		{
			throwPenny.setVisible(false);
			throwPenny.addActionListener(new ThrowListener());
		}
		
		reset = new JButton("RESET");
		reset.enable(false);
		add(reset, south);
		if(numThrows == 5)
		{
			total.setText("" + totalAmount);
			reset.enable(true);
			reset.addActionListener(new ResetListener());
		}
	}
}
