import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("한영 단어 검색 프로그램입니다.");
	      
	    int find = 0;
	    
	    while(true) {
	    	System.out.print("한글 단어?");
	    	String word = sc.next();
	    
	    	if(word.equals("그만"))
	    		break;
	    	
	    	String eng = Dictionary.kor2Eng(word);
	    	
	    	if(eng.equals("0"))
	    		System.out.println(word + "은(는) 저의 사전에 없습니다.");
	    	else
	    		System.out.println(word + "은(는) " + eng);
	    	
		  
	    }
	    
	    sc.close();
	}

}
