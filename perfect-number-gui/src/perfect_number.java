import javax.swing.JFrame;

/*
GUI�� �ؽ�Ʈ �ʵ带 ����Ͽ� �ڿ����� �Է¹ް�, 
�� ���� ���������� ���������� ���׼����� ����� 
�ؽ�Ʈ �ʵ忡 �����ִ� ���α׷��� �ۼ��϶�
 */

public class perfect_number {	
	
	public static void main (String[] args)
	{
		JFrame frame = new JFrame("Perfect Number");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnumPanel panel = new pnumPanel();

		
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
	
}
