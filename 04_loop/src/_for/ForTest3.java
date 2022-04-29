package _for;

public class ForTest3 {

	public static void main(String[] args) {
		
		int com = (int)(Math.random()*100); //0 ~ 99
		System.out.println(com);
		
		//a ~ b 사이의 난수 출력
		//(int)(Math.random() * (b-a+1)) + a
		
		com = (int)(Math.random() * (26)) + 65; //65 ~ 90 사이의 난수
		System.out.println(com);
		int count=0;
		
		//65 ~ 90 사이의 난수를 100개 발생하여 출력하시오
		for (int i=1; i<=100; i++) {
			com = (int)(Math.random() * (26)) + 65;
			System.out.print((char)com + " "); //A ~ Z
			
			//1줄에 10개씩 출력
			if(i%10 == 0) System.out.println();
			
			//100개의 문자 중에서 A가 몇 개 나왔는지
			if(com == 'A') count++;
			
		} //for
		System.out.println();
		System.out.println("A의 개수 = " + count);
		
	} //main

}

/*
난수 
- 컴퓨터가 불규칙하게 발생시키는 수
- 0 <= 난수 < 1		=> double
java.lang.Math.random()	- static
java.util.Random.nextDouble() - non_static -> new 생성 필수
*/