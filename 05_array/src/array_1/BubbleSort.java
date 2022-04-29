package array_1;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {40, 78, 36, 55, 50};
		
		System.out.print("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data + "  ");
		} //for
		System.out.println();
		
		int temp;
		for(int i=0; i<(ar.length-1); i++) { //전체 돌아가는 횟수
			for(int j=0; j<((ar.length-1)-i); j++) {
				if(ar[j] > ar[j+1]) { //부등호 바꾸면 내림차순
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				} //if
			} //for j
			
			//중간 결과
			for(int data : ar) {
				System.out.print(data + "  ");
			} //for data
			
			System.out.println();
			
		} //for i
			
		System.out.print("정렬 후 : ");
		
		for(int data : ar) {
			System.out.print(data + "  ");
		} //for
		
		System.out.println();
	}

}
