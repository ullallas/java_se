package _switch; // 조건이 없음 (>,<,>= 사용안됨), 값의 나열

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		int days;
		
//		if(month == 1) days = 31;
//		else if(month == 12) days = 28;
//		~~~
//		else if(month == 12) days = 31;
//		else days = 0;

		switch(month) {
		case 1 :  
		case 3 : 
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 :
		case 12 : days = 31; break;
		case 2 : days = 28; break;
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : days = 30; break;
		default : days = 0;
		}
		System.out.println(month + "월은 " + days + "일 입니다.");
		
		
	}

}
