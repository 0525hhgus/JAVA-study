/*
 * �Ӻ�������Ʈ���� ���α׷��� ���� #1
 * ü���� ����
 * ��ǻ��������Ű��а� 182571 ������
 */

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float weight = 0, height = 0;
		
		System.out.println("������(kg)�� Ű(cm)�� �Է��ϼ���.");
		weight = sc.nextFloat();
		height = sc.nextFloat();
		
		height = (float) (height * 0.01);
		float bmi = weight / (height * height); 
		
		if(bmi < 15.0)
			System.out.println("������ ��ü��");
		else if(bmi < 18.5)
			System.out.println("��ü��");
		else if(bmi < 23.0)
			System.out.println("����");
		else if(bmi < 27.5)
			System.out.println("��ü��");
		else if(bmi < 40.0)
			System.out.println("��");
		else
			System.out.println("������ ��");
		
	}

	
}
