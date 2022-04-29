package _interface;

public class ExaminationMain {

	public static void main(String[] args) {
//		ExaminationServiceImpl esi = new ExaminationServiceImpl(); //1:1관계
		ExaminationService es = new ExaminationServiceImpl(); //부모 = 자식
		es.menu();
		System.out.println("프로그램을 종료하니다.");
		
	}

}


/*
[문제] 사지선다형으로 입력된 답안지를 채점하는 프로그램을 작성하시오
- 총 문제수는 5문제이다
- 이름과 5개의 답을 입력하여 OX로 채점하시오
- 점수는 1문제당 20점이다.

클래스 : ExaminationDTO.java
필드 : String name
      String dap
      char[] ox
      score
      public static final String JUNG = "11111"; - 정답
메소드 : 생성자
       compare()
       setter / getter
       
인터페이스 : ExaminationService.java
추상메소드 : insertArticle();
           printArticle();
클래스 : ExaminationServiceImpl.java

[실행결과]
menu()
*****************
   1. 입력
   2. 출력
   3. 끝
*****************
   번호 : 1

[1번인 경우] - insertArticle(), 생성자를 이용
이름 입력 : 홍길동
답 입력 : 14123

[2번인 경우] - printArticle()
이름		1 2 3 4 5	점수
홍길동	O X O X X	40
코난		O O O O O	100
또치		O X X X X	20
*/