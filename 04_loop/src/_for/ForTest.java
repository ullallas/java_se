package _for;

public class ForTest {

	public static void main(String[] args) {
		int i;
		
		//반복 횟수 지정
		for(i=1; i<=10; i++) {
			System.out.println("Hello Java!! " + i);
		} //for
		
		System.out.println("탈출 i = " + i);
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1
		for(i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//A B C ~~ Z
		for(i='A'; i<='Z'; i++) {
			System.out.print((char)i+" ");
		}
	}

}

/*
local variable (지역변수)
- 자바는 구역 {} 단위
*/