package constructor;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; //literal 생성
		String b = "apple"; //똑같은 문자열 literal은 2번 이상 잡히지 않음
		if(a == b) System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다");
		
		if(a.equals(b)) System.out.println("a와 b의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		String c = new String ("apple");
		String d = new String ("apple");
		if(c == d) System.out.println("c와 d의 참조값은 같다");
		else System.out.println("c와 d의 참조값은 다르다");
		
		if(a.equals(d)) System.out.println("c와 d의 문자열은 같다");
		else System.out.println("c와 d의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 " + 2022 + 4 + 22;
		System.out.println("문자열 = " + e);
		System.out.println("문자열 크기 = " + e.length());
		
		System.out.println("첫번째 문자 = " + e.charAt(0));
		System.out.println("두번째 문자 = " + e.charAt(1));
		System.out.println("마지막 문자 = " + e.charAt(13));

		System.out.println("부분 문자열 추출 = " + e.substring(7));
		System.out.println("부분 문자열 추출 = " + e.substring(7, 11)); //2022 -> 7번부터 11번 이전까지 (7~10)
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜")); //4
		System.out.println("문자열 검색 = " + e.indexOf("날짜")); //3
		System.out.println("문자열 검색 = " + e.indexOf("개바부")); //-1 (찾는 문자열이 없을 때) ***왕중요!!!
		System.out.println("문자열 검색 = " + e.indexOf("2")); //7
		System.out.println("문자열 검색 = " + e.indexOf("2", 0)); //7
		System.out.println("문자열 검색 = " + e.indexOf("2", 8)); //9 - 시작위치를 8번부터 찾아라
		
		System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));
	}

}
/*
문자열은 편집이 안되므로 메모리 4번 생성된다
JVM에 의해서 삭제 시 Garbage Collector로 보낸다
Garbage Collector가 실행(휴지통 비우기)되면 컴퓨터는 멈춘다

"오늘 날짜는 "
"오늘 날짜는 2022"
"오늘 날짜는 20224"
"오늘 날짜는 2022422"  ---> StringBuffer 사용해서 불필요한 메모리의 낭비를 줄임
 */




