package array_1;

import java.io.IOException;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int[] com = new int[3];
		int[] user = new int[3];
		int yn;
		int strike, ball;
		int count=0;
		
		do {
			System.out.print("게임을 실행하시겠습니까(Y/N) : ");
			yn = System.in.read();
			System.in.read();
			System.in.read();
		} while(yn!='Y' && yn!='y' && yn!='N' && yn!='n');
			
		if (yn == 'Y' || yn == 'y') {
			System.out.println("\n 게임을 시작합니다");
				
			//난수발생
			for(int i=0; i<com.length; i++) {
				com[i] = (int)(Math.random() * 9) + 1; //1 ~ 9 사이의 난수
	
				//중복체크
				for(int j=0; j<i; j++) {
					if(com[i] == com[j]) {
						i--; 
						break;
					} //if
				} //for j
			} //for i
//			System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
			
			//발생한 숫자 맞추기
			while(true) {
				//사용자 입력	
				System.out.print("숫자입력 : ");
				for(int i=0; i<user.length; i++) {
					user[i] = System.in.read()-'0'; //1개 문자 입력
				} //for i
				System.in.read();
				System.in.read();
//				System.out.println(user[0] + ", " + user[1] + ", " + user[2]);
				
				//비교
				count++;
				strike = ball = 0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						if(com[i] == user[i]) {
							if(i == j) strike++;
							else ball++;
						}
					} //for j
				} //for i
				
				//마무리
				System.out.println(strike+"스트라이크  "+ball+"볼");
				if(strike == 3) {
					System.out.println("\n 축하합니다! 몇 "+count+"번 만에 맞추셨습니다!");
					break; //while을 벗어나라
				}
			} //while
		}else {
			System.out.println("프로그램을 종료합니다.");
		}
	} //main
}


/*
야구 게임 - 숫자 맞추기 게임 (while, for, if)
- 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
- 난수는 중복을 허용하지 않는다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : q
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

(while)
숫자입력 : 123
1스트라이크 0볼

숫자입력 : 182
0스트라이크 2볼

...

숫자입력 : 428
3스트라이크 0볼

축하합니다...몇x번만에 맞추셨습니다.
*/