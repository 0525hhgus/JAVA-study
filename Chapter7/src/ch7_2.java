import java.util.*;
import java.lang.*;

public class ch7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> grade = new ArrayList<String>();
		float avg = 0;
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)");
		for(int i = 0; i < 6; i++) {
			grade.add(sc.next());
		}
		
		for(int i = 0; i < 6; i++) {
			if(grade.get(i).equals("A")) avg += 4;
			else if(grade.get(i).equals("B")) avg += 3;
			else if(grade.get(i).equals("C")) avg += 2;
			else if(grade.get(i).equals("D")) avg += 1;
		}
		
		avg /= 6;
		
		System.out.println(avg);

	}

}
