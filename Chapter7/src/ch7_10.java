import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ch7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Shape> v = new Vector<Shape>();
		Shape shape = null;
		
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
	      while(true) {
	         System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
	         int num = sc.nextInt();
	         switch(num) {
	         case 1:
	            System.out.print("Line(1), Rect(2), Circle(3) >> ");
	            num = sc. nextInt();
	            switch(num) {
	            case 1:
	            	shape = new Line();
	            	break;
	            case 2:
	            	shape = new Rect();
	            	break;
	            case 3:
	            	shape = new Circle();
	            	break;
	            }
	            v.add(shape);
	            break;
	         case 2:
	            System.out.print("삭제할 도형의 위치 >> ");
	            num = sc.nextInt();
	            if(v.size() == 0 || v.size() <= num)
					System.out.println("삭제할 수 없습니다.");
				else 
					v.remove(num);
	            break;
	         case 3:
	           	Iterator<Shape> it = v.iterator();
	           	while(it.hasNext())
	           		it.next().draw();
	            break;
	         case 4:
	            System.out.println("beauty을 종료합니다.");
	            sc.close();
	            return;
	         }
	      }
	      
	}

}

abstract class Shape {
	private Shape next;
	public Shape() { next = null; }
	public void setNext(Shape obj) { next = obj; } //링크 연결
	public Shape getNext() { return next; }
	public abstract void draw();
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
