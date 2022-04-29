package variable;

import java.util.Scanner;

public class SungJuk {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		int math = scan.nextInt();
		
		int tot = kor + eng + math;
		double avg = (double)tot / 3;
		
		char grade;  //학점 

//		if (avg >= 90) grade = 'A';
//		else if (avg >= 80) grade = 'B';
//		else if (avg >= 70) grade = 'C';
//		else if (avg >= 60) grade = 'D';
//		else grade = 'F';
		
		switch ((int)avg/10) {
		case 10:
		case 9: grade = 'A'; break; 
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default : grade = 'F';
		}
		
				
		System.out.println("\t*** " + name + " 성적표 ***");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println(kor+ "\t" + eng + "\t" + math + "\t" + tot + "\t" 
							+ String.format("%.3f", avg) + "\t" + grade);
	
	
	}

}


/*
[문제] 이름(name), 국어(kor), 영어(eng), 수학(math)을 입력하여 총점(tot)과 평균(avg)을 계산하시오
평균은 소수이하 3째자리까지 나온다.
Scanner 사용(nextInt(), nextDouble(), next())

총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수

[실행결과]
이름 입력 : 홍길동 (String)
국어 입력 : 95
영어 입력 : 100
수학 입력 : 73

       *** 홍길동 성적표 ***
국어      영어      수학      총점      평균
95      100      73      xxx      xx.xxx
*/