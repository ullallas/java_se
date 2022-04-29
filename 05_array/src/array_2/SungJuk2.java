package array_2;

import java.util.Scanner;

public class SungJuk2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int person = scan.nextInt();
		
		String[] name = new String[person];
		int subjectCnt;
		String[][] subject = new String[person][];
		int[][] jumsu = new int[person][];
		double[] avg = new double[person];
		
		for(int i=0; i<person; i++) { //인원수만큼 반복
			System.out.println((i+1) + "번째");
			
			System.out.print("이름 입력 : ");
			name[i] = scan.next();
			
			System.out.print("과목수 입력 : ");
			subjectCnt = scan.nextInt();
			
			subject[i] = new String[subjectCnt]; //가변길이 방 생성
			
			for(int j=0; j<subjectCnt; j++) {
				System.out.print("과목명 입력 : ");
				subject[i][j] = scan.next();
			} //for j
			
			jumsu[i] = new int[subjectCnt+1]; //마지막 방에 총점
			
			for(int j=0; j<subjectCnt; j++) {
				System.out.print(subject[i][j] + " 점수 입력 : ");
				jumsu[i][j] = scan.nextInt();
				
				//총점
				jumsu[i][subjectCnt] += jumsu[i][j];
			
			} //for j
			
			//평균
			avg[i] = (double)jumsu[i][subjectCnt] / subjectCnt;
			
			System.out.println("--------------");
		
		} //for i
		
		//출력
		for(int i=0; i<person; i++) { //인원수만큼 반복
			//타이틀
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j] + "\t");
			} //for j
			System.out.println("총점\t평균");
			
			//데이터
			System.out.print(name[i] + "\t");
			for(int j=0; j<jumsu[i].length; j++) { //과목수, 총점
				System.out.print(jumsu[i][j] + "\t");
			}
			
			System.out.println(String.format("%.2f", avg[i]));
			System.out.println();
			
		} //for i
		
	}

}


/*
[문제] - 가변길이(사람마다 과목이 달라서)
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2

 1번째
 이름입력 : 홍길동 (name)
 과목수 입력 : 2   (subjectCnt) - new int[]?
 과목명 입력 : 국어 (subject)
 과목명 입력 : 영어
 국어 점수 입력 : 95 (jumsu)
 영어 점수 입력 : 100
 
 2번째
 이름입력 : 이기자 (name)
 과목수 입력 : 3   (subjectCnt)
 과목명 입력 : 국어 (subject)
 과목명 입력 : 영어
 과목명 입력 : 자바
 국어 점수 입력 : 95 (jumsu)
 영어 점수 입력 : 100
 자바 점수 입력 : 100
 
 이름     국어     영어    총점     평균
홍길동    95        100      xxx    xx.xx

 이름      국어      영어     자바    총점      평균
이기자       95       100     100    xxx      xx.xx
*/