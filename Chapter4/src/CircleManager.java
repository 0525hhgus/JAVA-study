import java.util.Scanner;

public class CircleManager {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      Circle c[] = new Circle[3]; // 3���� Circle �迭 ����
      int max = 0;
      for(int i=0; i < c.length; i ++) {
         System.out.print("x, y, radius >>");
         double x = sc.nextDouble(); // x�� �б�.
         double y = sc.nextDouble(); // y�� �б�.
         int radius = sc.nextInt(); // radius�� �б�.
         c[i] = new Circle(x, y, radius); // Circle ��ü ����
      }
      for(int i=0; i<c.length; i++) 
         if(max < c[i].getRadius())
        	 max = c[i].getRadius();
      for(int i=0; i<c.length; i++) 
          if(max == c[i].getRadius()) {
        	  System.out.print("���� ������ ū ���� ");
         	 c[i].show();
          }
      sc.close();
   }

}
