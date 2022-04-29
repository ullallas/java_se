package _switch;

import java.io.IOException;
import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 데이터 입력 : ");
		int a = scan.nextInt();
		System.out.print("연산자 입력 : ");
//		String op = scan.next();
		int op = System.in.read(); //1개 문자 입력
		System.out.print("두번째 데이터 입력 : ");
		int b = scan.nextInt();
		
//		switch(op) {
//		case "+" : System.out.println(a + op + b + "=" + (a+b)); break;
//		case "-" : System.out.println(a + op + b + "=" + (a-b)); break;
//		case "*" : System.out.println(a + op + b + "=" + (a*b)); break;
//		case "/" : System.out.println(a + op + b +"=" + (double)(a/b)); break;
//		default : System.out.println("연산자 에러");
//		} // switch 가독성
		
		String op2 = (char)op+"";
		switch(op) {
		case '+' : System.out.println(a + "+" + b + "=" + (a+b)); break;
		case '-' : System.out.println(a + "-" + b + "=" + (a-b)); break;
		case '*' : System.out.println(a + ((char)op+"") + b + "=" + (a*b)); break;
		case '/' : System.out.println(a + op2 + b +"=" + (double)(a/b)); break;
		default : System.out.println("연산자 에러");
		} // switch 가독성
	}

}
