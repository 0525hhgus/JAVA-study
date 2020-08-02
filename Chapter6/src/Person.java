import java.util.Random;

public class Person {

	public String name;
	private int n1, n2, n3;
	
	public Person(String name) {
		this.name = name;
	}
	
	public boolean game() {
		Random r = new Random();
		n1 = r.nextInt(3) + 1;
		n2 = r.nextInt(3) + 1;
		n3 = r.nextInt(3) + 1;
		
		System.out.print("\t"+n1+"  "+n2+"  "+n3+"  ");
		
		if(n1 == n2 && n2 == n3)
			return true;
		else 
			return false;
	}
}
