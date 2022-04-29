package method;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PayTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("직급 입력 : ");
		String position = scan.next();
		System.out.print("기본급 입력 : ");
		int salary = scan.nextInt();
		System.out.print("수당 입력 : ");
		int incentive = scan.nextInt();
		
		PayTest pt = new PayTest(); //생성
//		int pay = salary - incentive;
		int pay = pt.calcPay(salary, incentive); //호출
		
		double rate;
		if (pay >= 4000000) rate = 0.03;
		else rate = 0.02;
		
//		int tax = (int)(pay * rate);
		int tax = pt.calcTax(pay, rate);
		
//		int mpay = pay - tax;
		int mpay = pt.calcmPay(pay, tax);
		
		System.out.println("\t*** " + name + " 월급 명세서 ***");
		System.out.println("직급 : " + position);
		System.out.println("기본급\t\t수당\t급여\t\t세율\t세금\t월급");
		System.out.println(df.format(salary)+ "\t" + df.format(incentive) + "\t" + df.format(pay) + "\t" 
							+ (int)(rate*100) + "% \t" + df.format(tax) + "\t" + df.format(mpay));
		
		
//		System.out.println("\t *** " + name + " 월급 명세서 ***");
//	    System.out.println("직급 : " + position);
//	    System.out.println("기본급\t\t수당\t급여\t\t세율\t세금\t월급");
//	      
//	    System.out.println(df.format(basePay) + "\t"
//	            + df.format(extraPay) + "\t"
//	            + df.format(totalPay) + "\t"
//	            + df.format((int)(taxRate*100)) + "% \t"
//	            + df.format(tax) + "\t"
//	            + df.format(pay));

		
	} //main
	


	public int calcPay(int s, int i) {
		return s + i;
	}
	public int calcTax(int pay, double rate) {
		return (int)(pay * rate);
	}
	private int calcmPay(int pay, int tax) {
		return pay - tax;
	}
	

}



/*
[문제] 월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 급여, 세금, 월급을 계산하시오
세율은 급여가 4,000,000원 이상이면 3% 아니면 2%로 한다 
if문 또는 조건 연산자 사용해도 된다.

급여 = 기본급 + 수당
세금 = 급여 * 세율
월급 = 급여 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4500000
수당 입력 : 200000

         *** 홍길동 월급 명세서 ***
직급 : 부장

기본급      수당         급여            세율      세금      월급
4,500,000     200,000     4,700,000      3%      xx,xxx   x,xxx,xxx
*/