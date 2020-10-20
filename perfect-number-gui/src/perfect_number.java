import javax.swing.JFrame;

/*
GUI의 텍스트 필드를 사용하여 자연수를 입력받고, 
그 수가 완전수인지 부족수인지 과잉수인지 결과를 
텍스트 필드에 보여주는 프로그램을 작성하라
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
