package operator;

import java.util.Scanner;

public class CompTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 입력 : ");
		int a = scan.nextInt();
		System.out.print("b의 값 입력 : ");
		int b = scan.nextInt();
		
		int max = a > b ? a : b;
		System.out.println("큰 값 = " + max);
		
	}

}

/*
[문제] 데이터 2개를 입력 받아서 큰값을 출력하시오

[실행결과]
a의 갑 입력 : 25 
b의 갑 입력 : 78
큰 값 = 78

a의 갑 입력 : -25 
b의 갑 입력 : -78
큰 값 = -25
 */
