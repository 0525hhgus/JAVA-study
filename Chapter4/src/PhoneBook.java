import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο��� >> ");
		int n = sc.nextInt();
		
		Phone p[] = new Phone[n];
		
		for(int i=0; i < p.length; i ++) {
	         System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȭ��ȣ�� �� ĭ���� �Է�) >>");
	         String name = sc.next();
	         String tel = sc.next();
	         p[i] = new Phone(name, tel);
	    }
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
	         System.out.print("�˻��� �̸� >>");	
	         String findName = sc.next();
	         
	         if(findName.equals("�׸�"))
	        	 break;
	         
	         int find = 0;
	         for(int i=0; i < p.length; i ++) {
		        if(p[i].getName().equals(findName)) {
		        	 System.out.println(findName+"�� ��ȣ�� "+p[i].getTel()+" �Դϴ�.");
		             find = 1;
		             break;
		        }
	         }
	         if(find == 0)
	        	 System.out.println(findName + "�� �����ϴ�.");
	         
	         
		}
		
		sc.close();
	}

}
