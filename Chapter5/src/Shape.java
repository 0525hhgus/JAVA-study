abstract class Shape {
   private Shape next;
   public Shape() { next = null; }
   public void setNext(Shape obj) { next = obj; } // 링크 연결
   public Shape getNext() { return next; }
   public abstract void draw();
}


class Line extends Shape {
   String name ="line";
   public void draw() {
      System.out.println("Line");
   }
}

class Rect extends Shape {
	   String name ="Rect";
	   public void draw() {
	      System.out.println("Rect");
	   }
}

class Circle extends Shape {
	   String name ="circle";
	   public void draw() {
	      System.out.println("Circle");
	   }
}
