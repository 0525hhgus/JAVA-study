import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
	      
	    int find = 0;
	    
	    while(true) {
	    	System.out.print("�ѱ� �ܾ�?");
	    	String word = sc.next();
	    
	    	if(word.equals("�׸�"))
	    		break;
	    	
	    	String eng = Dictionary.kor2Eng(word);
	    	
	    	if(eng.equals("0"))
	    		System.out.println(word + "��(��) ���� ������ �����ϴ�.");
	    	else
	    		System.out.println(word + "��(��) " + eng);
	    	
		  
	    }
	    
	    sc.close();
	}

}
