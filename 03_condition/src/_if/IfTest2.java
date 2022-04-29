package _if;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 과목 점수 입력 : ");
		int a = scan.nextInt();
		System.out.print("두번째 과목 점수 입력 : ");
		int b = scan.nextInt();
		System.out.print("세번째 과목 점수 입력 : ");
		int c = scan.nextInt();
	
		double avg = (a+b+c) / 3.0;
		
		if(avg >= 60) 
			if(a>=40 && b>=40 && c>=40) System.out.println("합격");
			else System.out.println("과락으로 불합격");
		else System.out.println("불합격");
		
//		if ((a+b+c)/3 >= 60 && a >= 40 && b>= 40 && c >= 40) System.out.println("합격");
//		else if ((a+b+c)/3 < 60) System.out.println("불합격");
//		else System.out.println("과락으로 불합격");
	}

}
