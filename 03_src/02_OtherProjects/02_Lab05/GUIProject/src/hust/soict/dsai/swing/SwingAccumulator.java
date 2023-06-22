package hust.soict.dsai.swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingAccumulator extends JFrame{
	JTextField tfInput = new JTextField(10);
	JTextField tfOutput = new JTextField(10);
	private int sum = 0;
	
	public SwingAccumulator() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2,2));
		cp.add(new JLabel("Enter the input: "));
		
		cp.add(tfInput);
		tfInput.addActionListener(new myListener());
		
		cp.add(new JLabel("The Accumulated Sum is: "));
		
		cp.add(tfOutput);
		tfOutput.setEditable(false);
		
		setTitle("Swing Accumulator");
		setSize(350,120);
		setVisible(true);
	}
	
	private class myListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int NumberInt = Integer.parseInt(tfInput.getText());
			sum += NumberInt;
			tfInput.setText("");
			tfOutput.setText(sum + "");
		}
		
	}
	
	public static void main(String args[]) {
		new SwingAccumulator();
	}
}
