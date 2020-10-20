import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pnumPanel extends JPanel{
	
	private JLabel titleLabel, inputLabel, outputLabel;
	private JTextField inputField, outputField;
	private JButton exe;


	public pnumPanel() {
		titleLabel = new JLabel("프로그래밍 숙제 #3 완전수 판단");
		inputLabel = new JLabel("자연수를 입력하세요");
		outputLabel = new JLabel("결과 : ");
		inputField = new JTextField(10);
		outputField = new JTextField(5);
		exe = new JButton("실행");
		
		inputField.addActionListener(new pnumListener());
		exe.addActionListener(new ButtonListener());
		
		add(titleLabel);
		add(inputLabel);
		add(inputField);
		
		add(exe);
		add(outputLabel);
		add(outputField);
		
		
		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.CYAN);
		
	}
	
	private class pnumListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			String text = inputField.getText();
			
			int num = Integer.parseInt(text);
			int sum = 0;
			
			for(int i = 1; i < num; i++) {
				if(num % i == 0)
					sum += i;
			}
			
			if(sum == num)
				outputField.setText("완전수");
			else if(sum > num)
				outputField.setText("부족수");
			else if(sum < num)
				outputField.setText("과잉수");
			
		}
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String text = inputField.getText();
			
			int num = Integer.parseInt(text);
			int sum = 0;
			
			for(int i = 1; i < num; i++) {
				if(num % i == 0)
					sum += i;
			}
			
			if(sum == num)
				outputField.setText("완전수");
			else if(sum > num)
				outputField.setText("부족수");
			else if(sum < num)
				outputField.setText("과잉수");
		}
	}
	
}
