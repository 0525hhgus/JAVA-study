/*
 * 임베디드소프트웨어 프로그래밍 숙제 #1
 * 체질량 지수
 * 컴퓨터정보통신공학과 182571 윤현서
 */

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float weight = 0, height = 0;
		
		System.out.println("몸무게(kg)와 키(cm)를 입력하세요.");
		weight = sc.nextFloat();
		height = sc.nextFloat();
		
		height = (float) (height * 0.01);
		float bmi = weight / (height * height); 
		
		if(bmi < 15.0)
			System.out.println("병적인 저체중");
		else if(bmi < 18.5)
			System.out.println("저체중");
		else if(bmi < 23.0)
			System.out.println("정상");
		else if(bmi < 27.5)
			System.out.println("과체중");
		else if(bmi < 40.0)
			System.out.println("비만");
		else
			System.out.println("병적인 비만");
		
	}

	
}
