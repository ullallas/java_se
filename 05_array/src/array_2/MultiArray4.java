package array_2;

public class MultiArray4 {

	public static void main(String[] args) {
		int[][] ar = {{1,2,3,0}, {4,5,6,0}, {7,8,9,0}, {0,0,0,0}};
		int sum = 0;
		
		//계산
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar[i].length-1; j++) {
				sum += ar[i][j]; //ar[i][3] += ar[i][j] 
								 //ar[3][i] += ar[j][i] || ar[3][j] += ar[i][j]
								 //ar[3][3] += ar[i][j]
			} //for j

			ar[i][3] = sum;
			sum=0;
			
		} //for i
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				sum += ar[j][i];
			} //for j
			
			ar[3][i] = sum;
			sum=0;
	
		} //for i
		
		
		//출력
		 for(int i=0; i<ar.length; i++) {
	         
	         for(int j=0; j<ar[i].length; j++) {
	            System.out.print(ar[i][j] + "\t");
	         }
	         System.out.println();

		} //for i

	}

}

/*
[문제] 합을 구하시오

1 2 3 0      1  2  3  6
4 5 6 0      4  5  6  15
7 8 9 0      7  8  9  24
0 0 0 0      12 15 18 45(1~9)
*/
