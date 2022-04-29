package _abstract;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest {
	private int year, month, lastDay, startWeek;
	
	public CalendarTest() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
	}
	
	public void calc() { //마지막 일, 시작 요일 계산
		Calendar day = Calendar.getInstance(); //메소드 - 기준은 시스템 날짜로 생성(2022.04.27)
		
		//기준을 원하는 날짜로 변경
		day.set(year, month-1, 1); 
		
		startWeek = day.get(Calendar.DAY_OF_WEEK); //시작요일
		lastDay = day.getActualMaximum(Calendar.DAY_OF_MONTH); //마지막 일
	}
	
	public void display() {
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토\t\n");
		
//		int day = 1;
//		switch(startWeek) {
//		case 7: System.out.print(" \t");
//		case 6: System.out.print(" \t");
//		case 5: System.out.print(" \t");
//		case 4: System.out.print(" \t");
//		case 3: System.out.print(" \t");
//		case 2: System.out.print(" \t");
//		}
		
		for(int i=1; i<startWeek; i++) {
			System.out.print("\t");
		}
		
		//시작 위치 지정
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i + "\t");
			if(startWeek%7 == 0)
				System.out.println();
				startWeek++;
		} //for
		
	}
	
	
}
//---------
public class CalendarMain {

	public static void main(String[] args) {
		CalendarTest c = new CalendarTest();
		c.calc();
		c.display();
	}

}

/*
[문제] 만년달력
1. 년, 월을 입력하여 달력을 출력하시오
2. 클래스 : CalendarTest
   필드
   생성자 : 입력
   메소드 : calc() -> 월마다 끝나는 일(28, 29, 30, 31)을 구하기
                  -> 월마다 시작하는 요일을 구하기
           display()

[실행결과]
년도 입력 : 2002
월 입력 : 10

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31
*/