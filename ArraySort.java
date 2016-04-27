/*
** Bailey Spicer
** bes2725@email.vccs.edu
** 04/25/2016
** this program gets an input from a GUI and sorts it 
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ArraySort extends JFrame
{
	private JFrame frame;
	private JPanel panel;
	private JLabel label1;
	private JLabel label2;
	private JLabel sorted;
	private JButton btn;
	public JTextField txt[];
	public double num[];
	public double hold;

	public ArraySort()
	{
		frame = new JFrame("Assignment 7.1");
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());

		label1 = new JLabel();
		label2 = new JLabel();
		label1.setText("Enter ten numbers into an array: ");
		sorted = new JLabel();
		sorted.setText("-------------------");

		btn = new JButton("Sort it!");
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double[] num = new double[10];

				for (int i=0; i<10; i++)
				{
					System.out.println(txt[i].getText());
					num[i] = Double.parseDouble(txt[i].getText());
				}
	
				for (int i=0;  i<10; i++)
				{
			
					for (int j=i+1; j<10; j++)
					{
						if (num[i] < num[j])
						{	
							hold = num[i];
							num[i] = num[j];
							num[j] = hold;
						}
					}
				}

				sorted.setText("bonga");
			}
		});
		
		panel.add(label1);
		panel.add(label2);

		JLabel[] lbl = new JLabel[10];
		JTextField[] txt = new JTextField[10];

		for (int i=0; i<10; i++)
		{
			lbl[i] = new JLabel();
			lbl[i].setText(i + ": ");
			txt[i] = new JTextField(5);
			panel.add(lbl[i]);
			panel.add(txt[i]);
		}

		panel.add(btn);
		panel.add(sorted);
		frame.add(panel);

	}

	public static void main(String[] args)
	{
		new ArraySort();
	}
}


