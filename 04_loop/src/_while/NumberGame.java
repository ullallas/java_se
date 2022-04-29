package _while;

import java.io.IOException;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int num, answer, count=0;
		
		System.out.println("1~100 사이의 난수를 발생하였습니다.\n맞추어보세요\n");
		
		while(true) {
			System.out.println();
			count = 0; //초기화
			
			num = (int)(Math.random() * 100) + 1;
			System.out.println(num);
			
			while (true) { //무한루프
				
				System.out.print("숫자 입력 : ");
				answer = scan.nextInt();
				
				count++;
				
				if (answer == num) break;
	
				if (answer < num) {
					System.out.println(answer + "보다 큽니다");
					System.out.println();
				}
				else {
					System.out.println(answer + "보다 작습니다");
					System.out.println();
				}
				
			}//while
			
			System.out.println();
			System.out.println("딩동댕! " + count + "번 만에 맞추셨습니다");
			
			System.out.println();
			System.out.print("계속(y/n) : ");
			int yn = System.in.read();
			if (yn == 'N' || yn == 'n') break;
		} //while
		System.out.println("프로그램을 종료합니다");
	
	} //main

}

/*
[문제] 숫자맞추기 게임
1~100 사이의 난수를 발생하여 발생한 난수를 맞추는 게임

[실행결과]
1~100 사이의 난수를 발생하였습니다. (85)
맞추어보세요

숫자 입력 : 50
50보다 큽니다.

숫자 입력 : 90
90보다 작습니다.
..
..
..
숫자 입력 : 85
딩동뎅..x번만에 맞추셨습니다.
*/