package array_1;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ar;
		int sum=0;
		int max, min;
		
		System.out.print("배열 크기를 입력 : ");
		int size = scan.nextInt();
		ar = new int[size];
		
		//입력
		for(int i=0; i<size; i++) {
			System.out.print("ar[" + i + "]의 값을 입력 : ");
			ar[i] = scan.nextInt();
			
			sum += ar[i];
		} //for
		System.out.println();
		
		max = min = ar[0]; //초기값
		for(int i=1; i<size; i++) {
			if(ar[i] > max) max = ar[i];
			if(ar[i] < min) min = ar[i];
		}
		
		//출력
		for(int data : ar) {
			System.out.print(data + "  ");
		}

		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}

}
