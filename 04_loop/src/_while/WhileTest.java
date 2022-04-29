package _while;

public class WhileTest {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		int a=1;
		
		while(true) {
			
			System.out.print(a + " ");
			a++;
			if(a>10) break; //while문을 벗어나라
			
		} //while
		System.out.println("탈출");
	}

}
