package _while;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, i, mul=1;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			num = scan.nextInt();
			
			if(num == 0) break; //while을 벗어나라
			if(num < 0) continue; //while문 처음으로
			
			for(i=1; i<=num; i++) {
				mul *= i;
			} //for i

			System.out.println(num + "!" + " = " + mul);
			mul = 1; //초기화
		
		} //while
		
		System.out.println("프로그램 종료합니다.");
	
	} //main

}

/*
[문제] 팩토리얼 계산 - while, for, break, continue
- 0이 입력되면 종료한다
- 음수가 들어오면 다시 입력한다

[실행결과]
숫자 입력 : 3
3! = 6
숫자 입력 : 5
5! = 120
숫자 입력 : -5
숫자 입력 : -100
숫자 입력 : 3
3! = 6
숫자 입력 : 0
프로그램 종료합니다.
*/