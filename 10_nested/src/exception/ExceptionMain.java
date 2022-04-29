package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain {

	public static void main(String[] args) throws IOException {
		if(args.length>=1) System.out.println("args[0] = " + args[0]);
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("정수 입력 : ");
//			int data = br.read(); //1개 문자
			int a = Integer.parseInt(br.readLine()); //enter치기 전까지가 1줄 //String -> int
		
			System.out.print("정수 입력 : ");
//			int data = br.read(); //1개 문자
			int b = Integer.parseInt(br.readLine()); //String -> int
		
			System.out.println(a + " / " + b + " = " + a/b);
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식만 입력하세요 제발~");
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없답니다^^");
		} finally {
			System.out.println("error가 있건 없건 무조건 실행!");
		}
	}

}
