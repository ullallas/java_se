package multiFor;

public class MultiForTest {

	public static void main(String[] args) {
		int i, j;
		
		//총 6번 실행
		for(i=2; i<=4; i+=2) { //i=2, i=4 2번
			
			for(j=1; j<=3; j++) { //j=1, j=2, j=3 3번
				System.out.println("i=" + i + " j=" + j);
			} //for j
		
			System.out.println();
		
		}//for i
	}

}
