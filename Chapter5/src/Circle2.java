public class Circle2 implements Shape2 {

	
	private int radius;
	public Circle2(int radius) {
	   this.radius = radius;
	}
	public void draw() {
	   System.out.println("�������� "+radius+"�� ���Դϴ�.");
	}
	public double getArea() {
	    return Math.PI*radius*radius;
	}
	
	

}



