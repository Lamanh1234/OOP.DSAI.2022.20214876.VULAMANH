package hust.soict.dsai.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
	TextField tfInput = new TextField(10);
	TextField tfOutput = new TextField(10);
	private int sum = 0;
	
	public AWTAccumulator(){
		setLayout(new GridLayout(2,2));
		
		add(new Label("Enter an Integer: "));
		add(tfInput);
		tfInput.addActionListener(new MyListener());
		
		add(new Label("The Accumulated Sum is: "));
		
		tfOutput.setEditable(false);
		add(tfOutput);
		
		setVisible(true);
		setTitle("Swing Accumulator");
		setSize(350,120);
	}
	
	private class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int NumberInt = Integer.parseInt(tfInput.getText());
			sum+= NumberInt;
			tfInput.setText("");
			tfOutput.setText(sum + "");
		}
	}
	
	public static void main(String args[]) {
		new AWTAccumulator();
	}
}
