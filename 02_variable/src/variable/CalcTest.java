package variable;

import java.text.DecimalFormat;

public class CalcTest {

	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		
		DecimalFormat df = new DecimalFormat();
		
		short sum = (short)(a + b); // 형변환, int sum = a + b;
		short sub = (short)(a - b);
		int mul = a * b;
		double div = (double)a / b;
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + df.format(mul));
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div)); // 소수이하 2째자리
	}

}


/*
[문제] 변수를 이용하여 320, 258의 합, 차, 곱 몫을 구하시오
 */