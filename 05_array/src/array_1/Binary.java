package array_1;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int[] binary = new int[32];
		int dec, i;
		
		Scanner scan = new Scanner(System.in);
		

		while(true) {
			System.out.print("10진수 입력 : ");
			dec = scan.nextInt(); //20
			if(dec == 0) break;
			if(dec < 0) continue;
			
			//2진수
			for(i=0; dec!=0; i++) { //몫이 0이 될때까지
				binary[i] = dec%2; //나머지
				dec = dec/2; //몫
				
			} //for i
			System.out.println("탈출 i = " + i);
			
			//출력 - 배열의 값을 거꾸로
			for(int j=i-1; j>=0; j--) {
				System.out.print(binary[j]);
				if(j%4==0) System.out.print(" ");
			} //for j
			
			System.out.println();
		
		} //while
		
		System.out.println("프로그램을 종료합니다");

	}

}


/*
[문제] 2진수 변환 프로그램 
10진수를 입력하여 2진수로 변환하시오
- 0이 입력되면 프로그램을 종료하시오
- 음수가 입력되면 재입력하시오
- 4개씩 끊어서 보여주기
- Integer.toBinaryString() 사용 X

10진수 입력 : -5

10진수 입력 : 12
1100

10진수 입력 : 250
1111 1010

10진수 입력 : -8

10진수 입력 : 0
프로그램을 종료합니다
*/