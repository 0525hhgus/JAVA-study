import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pnumPanel extends JPanel{
	
	private JLabel titleLabel, inputLabel, outputLabel;
	private JTextField inputField, outputField;
	private JButton exe;


	public pnumPanel() {
		titleLabel = new JLabel("���α׷��� ���� #3 ������ �Ǵ�");
		inputLabel = new JLabel("�ڿ����� �Է��ϼ���");
		outputLabel = new JLabel("��� : ");
		inputField = new JTextField(10);
		outputField = new JTextField(5);
		exe = new JButton("����");
		
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
				outputField.setText("������");
			else if(sum > num)
				outputField.setText("������");
			else if(sum < num)
				outputField.setText("���׼�");
			
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
				outputField.setText("������");
			else if(sum > num)
				outputField.setText("������");
			else if(sum < num)
				outputField.setText("���׼�");
		}
	}
	
}
