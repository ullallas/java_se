package _for;

import java.io.IOException;

public class GuGuDan {

	public static void main(String[] args) throws IOException {
		System.out.print("원하는 단을 입력 : ");
//		int dan = System.in.read()-48; //1개 문자 입력
		int dan = System.in.read()-'0'; //1개 문자 입력
		
		if (dan >= 2 && dan <= 9) {
			for (int i=1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			} //for
		} else System.out.println("범위 초과");
			
	}

}

/*
[문제] 구구단
-> 2 ~ 9까지만 구구단을 구하시오
-> System.in.read() 사용

[실행결과]
원하는 단을 입력 : -5
범위 초과
------------------------
원하는 단을 입력 : 7
7 * 1 = 7
7 * 2 = 14

7 * 9 = 63
*/