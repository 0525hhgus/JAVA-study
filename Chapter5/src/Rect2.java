public class Rect2 implements Shape2{
	private int x;
	private int y;
	public Rect2(int x, int y) {
	   this.x = x;
	   this.y = y;
	}
	public void draw() {
		System.out.println(x+"x"+y+"ũ���� �簢���Դϴ�.");
	}
	public double getArea() {
		return x*y;
	}
	
}
