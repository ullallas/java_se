package _for;

public class ForTest2 {

	public static void main(String[] args) {
		int sum = 0; //지역변수, 쓰레기값(반드시 초기화)
		int mul = 1;
		for(int i=1; i<=10; i++) {
			sum += i; //sum = sum + i;
			mul *= i; //mul = mul * i;
			
			System.out.println(i + "\t" + sum + "\t" + mul);
		} //for
		
		System.out.println("1 ~ 10까지의 합 = " + sum);
	}

}

/*
i	sum		sum				mul
1	1		sum = sum + 1	1
2	1+2		sum = sum + 2	2
3	1+2+3	sum = sum + 3	6
4
5
 */
