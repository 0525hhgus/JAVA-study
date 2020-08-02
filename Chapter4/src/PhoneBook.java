import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 >> ");
		int n = sc.nextInt();
		
		Phone p[] = new Phone[n];
		
		for(int i=0; i < p.length; i ++) {
	         System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸없이 입력) >>");
	         String name = sc.next();
	         String tel = sc.next();
	         p[i] = new Phone(name, tel);
	    }
		System.out.println("저장되었습니다...");
		
		while(true) {
	         System.out.print("검색할 이름 >>");	
	         String findName = sc.next();
	         
	         if(findName.equals("그만"))
	        	 break;
	         
	         int find = 0;
	         for(int i=0; i < p.length; i ++) {
		        if(p[i].getName().equals(findName)) {
		        	 System.out.println(findName+"의 번호는 "+p[i].getTel()+" 입니다.");
		             find = 1;
		             break;
		        }
	         }
	         if(find == 0)
	        	 System.out.println(findName + "이 없습니다.");
	         
	         
		}
		
		sc.close();
	}

}
