package _for;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mul = 1;
		
		System.out.print("x 입력 : ");
		int x = scan.nextInt();
		System.out.print("y 입력 : ");
		int y = scan.nextInt();
		
		for (int i=1; i<=y; i++) {
			mul *= x;
		}
		
		System.out.println(x + "의 " + y + "승은 " + mul);
	} //main

}

/*
[문제] 제곱 (x의 y승)

[실행결과]
x 입력 : 2
y 입력 : 5
2의 5승은 xxx
 */
