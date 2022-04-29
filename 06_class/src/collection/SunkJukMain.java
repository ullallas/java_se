package collection;

public class SunkJukMain {

	public static void main(String[] args) {
		SunkJukService sunkJukService = new SunkJukService();
		sunkJukService.menu(); //호출
		System.out.println("프로그램을 종료합니다");
		
	}

}

/*
[문제] 성적관리 프로그램
1. 번호(no), 이름(name), 국어(kor), 영어(eng), 수학(math)점수를 입력하여 총점(tot)과 평균(avg)을 구하시오
2. 평균은 소수이하 2째자리까지 출력
   소수이하 자리값이 0이면 출력하지 않는다
   ex) 92.000 → 92로 출력하시오
3. 번호는 중복되지 않게 입력한다
4. 이름은 중복되어도 된다 (똑같은 이름을 입력하세요)

[실행결과]
menu()
*****************
   1. 입력
   2. 출력
   3. 검색
   4. 삭제
   5. 정렬
   6. 끝
*****************
   번호 : 8
1~6중에 선택하세요

[1번인 경우] - insertArticle(), 생성자를 이용
번호 입력 :
이름 입력 :
국어 입력 :
영어 입력 :
수학 입력 :

데이터를 저장하였습니다

[2번인 경우] - printArticle()
번호      이름      국어      영어      수학      총점      평균
15      홍길동   90      92      91      xxx      xx.xx
30      또치      85      92      100      xxx      xx.xx

[3번인 경우] - searchArticle()
검색 할 이름 입력 : 코난
찾고자 하는 이름이 없습니다

검색 할 이름 입력 : 홍길동
번호      이름      국어      영어      수학      총점      평균
15      홍길동   90      92      91      xxx      xx.xx
16      홍길동   89      45      78      xxx      xx.xx

[4번인 경우] - deleteArticle() - 똑같은 이름이 있으면 모두 삭제
삭제 할 이름 입력 : 홍길동

데이터를 삭제하였습니다

[5번인 경우] - sortArticle(), 기준은 이름으로
1. 이름으로 오름차순
2. 총점으로 내림차순 - comparator
3. 이전메뉴
*/