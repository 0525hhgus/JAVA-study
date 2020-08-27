import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HangMan {
	 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int random;
        BufferedReader in = null; // 파일을 읽어오는 버퍼
        char replay = 'y'; // 게임을 실행할 것인가
        int result; // 게임 결과
        Scanner s = new Scanner(System.in);
        try {
            while(replay=='y') {
                in = new BufferedReader(
                        new FileReader("D:\\eclipse-workspace\\Chapter8\\src\\words.txt"));
                random = (int)(Math.random()*25143);
                for(int i=0;i<random-1;i++) {
                    in.readLine();
                }
                String str = in.readLine(); // random 번째 문자열
                System.out.println("지금부터 행맨 게임을 시작합니다.");
                result = startGame(str);
                System.out.println(str); // 정답 문자열 알려주기
                if(result==0) {
                    System.out.println("5번 실패 하였습니다.");
                }
                System.out.print("Next(y/n)?");
                replay=s.next().charAt(0);
            }
             
        }catch(IOException e) {
            System.out.println("파일 입출력 오류");
        }
    }
    static int startGame(String str) {
        int fail=0; // 실패 횟수
        int success=0; // 성공 횟수
        int level=2; //몇 글자를 숨길 것인가
        char word[] = str.toCharArray();
        char hidden[] = str.toCharArray();
        int tmp[] = new int[level];
        Scanner s = new Scanner(System.in);
        char ch; // 플레이어에게 입력받는 한 글자
        for(int i=0;i<level;i++) { // 숨길 인덱스 랜덤 생성
            tmp[i]=(int)(Math.random()*str.length());
            for(int j=0;j<i;j++) { // 중복 제거
                if(tmp[j]==tmp[i]) {
                    tmp[i]=(int)(Math.random()*str.length());
                    j=-1;
                }
            }
            hidden[tmp[i]]='-';
        }
        int i;
        while(fail!=5) {
            System.out.println(hidden);
            System.out.print(">>");
            ch=s.next().charAt(0);
            for(i=0;i<tmp.length;i++) { 
                // 플레이어가 입력한 글자가 숨겨진 글자 중 하나와 일치하는지 검사 
                if(word[tmp[i]]==ch) {
                    hidden[tmp[i]]=ch;
                    success++; // 성공 카운트 하나 증가
                }
            }
            if(i==tmp.length) { // 숨겨진 글자 중 하나가 아니었을 시 
                fail++; // 실패 카운트 증가
            }
            if(success==level) { // 다 맞췄을 시 while문 빠져나가기
                break;
            }
        }
        if(fail==5) { // 실패 카운트가 5일 때
            return 0; // 실패를 반환
        } else { // 5가 아닐 때(5번 안에 성공했을 때)
            return 1; // 성공을 반환
        }
    }
 
}