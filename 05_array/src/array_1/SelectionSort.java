package array_1;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {40, 78, 36, 55, 50};
		int temp;
		
		System.out.print("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data + "  ");
		} //for
		System.out.println();
		
		for(int i=0; i<(ar.length-1); i++) {
			for(int j=(i+1); j<ar.length; j++) {
				if(ar[i] > ar[j]) { //부등호 바꾸면 내림차순
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				} //if
			} //for j
			
			//중간 결과
			for(int data : ar) {
				System.out.print(data + "  ");
			} //for
			
			System.out.println();
			
		} //for i
			
		System.out.print("정렬 후 : ");
		
		for(int data : ar) {
			System.out.print(data + "  ");
		} //for
		
		System.out.println();
	}

}


/*
정렬(sort)
- 오름차순(Ascending)
- 내림차순(Descending)
*/