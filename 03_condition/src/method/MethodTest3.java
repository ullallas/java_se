package method;

import java.util.Arrays;
import java.util.Random;

public class MethodTest3 {

	public static void main(String[] args) {
		System.out.println("절대값 = " + Math.abs(-25));
		System.out.println("최소값 = " + Math.min(12.3, 36.5));
		
		System.out.println("난수 = " + Math.random());
		
		//Random 클래스의 nextDouble()을 사용
		Random r = new Random();
		System.out.println("난수 + " + r.nextDouble());
		
		//배열
//		int[] ar = new int[5];
//		ar[0] = 25;
//		ar[1] = 12;
//		ar[2] = 35;
//		ar[3] = 78;
//		ar[4] = 30;
		
		int[] ar = {25, 12, 35, 78, 30};
		//소트 - 오름차순
		Arrays.sort(ar);
		System.out.println(ar[0]+", "+ar[1]+", "+ar[2]+", "+ar[3]+", "+ar[4]);
		

	}

}

//난수 - 컴퓨터가 불규칙하게 발생시키는 수
//abs(-25) - 자신이 속해 있는 클래스에서 메소드를 찾음