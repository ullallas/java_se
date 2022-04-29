package operator;

import java.io.IOException;
//import java.util.Scanner;

public class CompTest3 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("문자 입력 : ");
		int ch = System.in.read();
		
		int result = ch >= 'A' && ch <= 'Z' ? ch+32 : ch-32;
		System.out.println((char)ch + " -> " + (char)result);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("문자 입력 : ");
//		String ch = scan.next();
//		result = ch >= 'A' && ch <= 'Z' ? ch+32 : ch-32;
		
	}

}
