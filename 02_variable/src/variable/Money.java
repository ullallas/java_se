package variable;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.print("현금 입력 : ");
		int money = scan.nextInt(); 
		
		int thousand = money / 1000;
		int hundred = (money % 1000) / 100;
		int ten = (money % 100) / 10; // = money % 1000 % 100 / 10
		int one = money % 10; 		  // = money % 1000 % 100 % 10
		
		System.out.println("현금 " + df.format(money) + "원" );
		System.out.println("천의 자리 : " + thousand + "장" );
		System.out.println("백의 자리 : " + hundred + "개" );
		System.out.println("십의 자리 : " + ten + "개" );
		System.out.println("일의 자리 : " + one + "개" );
		
	}

}





/*
[문제] 현금을 입력하여 천의 자리, 백의자리, 십의자리, 일의자리를 각각 뽑아주시오

[실행결과]
현금 입력 : 1234

현금 1,234원
천의 자리 : 1장
백의 자리 : 2개
십의 자리 : 3개
일의 자리 : 4개
*/

