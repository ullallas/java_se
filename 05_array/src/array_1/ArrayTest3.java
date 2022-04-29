package array_1;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력 : ");
		str = scan.next();
		
		int index = str.length() / 2; //함수 // arg.length - 명령어
		
		System.out.println("가운데 문자 = " + str.charAt(index));
		
	}

}


/*
[문제] 문자열을 입력받아서 가운데 문자만 출력하시오

[실행결과]
문자열 입력 : 호랑이
가운데 문자 = 랑

문자열 입력 : 바다코끼리
가운데 문자 = 코

문자열 입력 : 이구아나
가운데 문자 = 아
*/