import java.util.Scanner;

// 12���� �°� ����
public class ch6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�׺� ���ӿ� ������ ���� ����>>");
		int num = sc.nextInt();
		
		Person[] person = new Person[num];
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"��° ���� �̸�>>");
			String name = sc.next();
			person[i] = new Person(name);
		}
		
		String buffer = sc.nextLine();
		
		while(true) {
			for(int i=0; i<num; i++) {
				System.out.print("["+person[i].name+"]:<Enter>");
				buffer = sc.nextLine();
				if(person[i].game()) {
					System.out.println(person[i].name+"���� �̰���ϴ�!");
					sc.close();
					return;
				}
				System.out.println("�ƽ�����!");
			}
			
		}
		
	}

}
