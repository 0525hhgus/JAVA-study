public class Circle2 implements Shape2 {

	
	private int radius;
	public Circle2(int radius) {
	   this.radius = radius;
	}
	public void draw() {
	   System.out.println("반지름이 "+radius+"인 원입니다.");
	}
	public double getArea() {
	    return Math.PI*radius*radius;
	}
	
	

}



