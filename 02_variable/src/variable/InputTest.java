package variable;

import java.io.IOException;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) throws IOException {
		System.out.print("데이터 입력 : ");
		int data = System.in.read(); //1개 문자로 입력받음
		
		System.out.println(data);
		
		Scanner scan = new Scanner(System.in); // 키보드를 통해 입력
		System.out.print("정수 입력 : ");
		int a = scan.nextInt();
		System.out.print("실수 입력 : ");
		double b = scan.nextDouble();
		
		System.out.println(a + " + " + b + " = " + (a+b));
	}

}


/*
Exception (예외처리)
- 생각지도 않은 에러 발생
- 예) 자동차 보험
*/