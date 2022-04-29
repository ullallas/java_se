package multiFor;

public class MultiForTest4 {

	public static void main(String[] args) {
		
		int dan, i;
		
		for(int w=2; w<=8; w+=3 ) { //3번
			for(i=1; i<=9; i++) {
				
				for(dan=w; dan<=w+2; dan++) {
					
					if(dan!=10) 
						System.out.print(dan + " * " + w + " = " + dan*w + "\t");
				
				} //for dan
				
				System.out.println();
			
			} //for i
			
			System.out.println();
		
		} //for w
	
	} //main
}
		



/*
[문제] 구구단
- 3단씩 끊어서 출력하세요
- 3중 for, if문 사용

[실행결과]
2*1=2   3*1=3   4*1=4

5*1=5   6*1=6   7*1=7

8*1=8   9*1=9  
*/