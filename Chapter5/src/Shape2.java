
public interface Shape2 {
   final double PI = 3.14; // ���
   void draw(); // ������ �׸��� �߻� �޼ҵ�
   double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�
   default public void redraw() { // ����Ʈ �޼ҵ�
      System.out.print("--- �ٽ� �׸��ϴ�.");
      draw();
   }
   
   
}

