package _while;

public class DoWhileTest {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		int a=0;
		
		do {
			a++; //1
			System.out.print(a + " ");
			
		} while(a<10);
		System.out.println("\n");
		
		//A ~ Z까지 출력하되 1줄에 7개씩 출력하시오
		char ch = 'A';
		int count = 0;
		do {
			System.out.print(ch + " "); //A B ... X Y
			ch++; //B C ... Y Z
			count++; // 1 2 3 4 5 6 7 8 9
			if(count%7 == 0) System.out.println();
	
		} while(ch<='Z');
		
	}

}
