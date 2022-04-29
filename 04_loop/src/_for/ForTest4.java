package _for;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		
		for (int i=1; i<=num; i++) {
			if (num%i == 0)
				{ System.out.print(i + " "); count++; }
		} //for
		System.out.println();
		if(count == 2) System.out.println("소수이다");
		else System.out.println("소수가 아니다");
	}

}

/*
[문제] 약수, 소수(1과 자기 자신으로만 나누어지는 수)
숫자를 입력하여 입력한 숫자의 약수를 출력한다.

[실험결과]
숫자 입력 : 12
1 2 3 4 6 12
소수가 아니다

숫자 입력 : 8
1 2 4 8

숫자 입력 : 11
1 11
소수이다
*/






