
public class Dictionary {
   private static String[] kor = {"»ç¶û", "¾Æ±â", "µ·", "¹Ì·¡", "Èñ¸Á"};
   private static String[] eng = {"love", "baby", "money", "future","hope"};
   public static String kor2Eng(String word) { 
	   for(int i = 0; i < 5; i++) {
		   if(word.equals(kor[i])) {
			   return eng[i];
		   }
	   }
	   return "0";
   }
}
