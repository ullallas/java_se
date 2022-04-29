package _abstract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("오늘 날짜 : " + date);
		System.out.println();
		
		//날짜 형식
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : " + sdf.format(date));
		System.out.println();
		
		//입력
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19930426052015"); //String -> Date 변환
		System.out.println("내 생일 : " + birth);
		System.out.println("내 생일 : " + sdf.format(birth));
		System.out.println();
		
//		Calendar cal = new Calendar(); - error 추상이라서
//		Calendar cal = new GregorianCalendar(); //자식 이용 //기준은 시스템 날짜와 시간
		Calendar cal = Calendar.getInstance();//메소드 이용
		
		//다른 나라의 시간을 기준으로 변경
//		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
		
		int year = cal.get(Calendar.YEAR);//int year = cal.get(1);
		int month = cal.get(Calendar.MONTH) + 1; //1월-0, 2월-1, 3월-2, ~~~, 12월-11
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int week = cal.get(Calendar.DAY_OF_WEEK); //일-1, 월-2, ~~~, 토-7
		
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "일"; break;
		case 2 : dayOfWeek = "월"; break;
		case 3 : dayOfWeek = "화"; break;
		case 4 : dayOfWeek = "수"; break;
		case 5 : dayOfWeek = "목"; break;
		case 6 : dayOfWeek = "금"; break;
		case 7 : dayOfWeek = "토"; break;
		} //switch
		
		System.out.print(year + "년 " + month + "월 " + day + "일 " + week + "요일 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
	}

}

/*
1 - Calendar.YEAR (상수)

*/








