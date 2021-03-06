package constructor;

public class MemberMain {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		memberService.menu();
		System.out.println("프로그램을 종료합니다");
	}

}

/*
[문제] 회원관리 프로그램
클럽의 회원관리 프로그램 작성하려고 한다.
여기는 코로나로 인한 폐쇄적인 모임으로 회원은 총 5명으로 한다. (객체배열)
회원의 정보는 이름(name), 나이(age), 핸드폰(phone), 주소(address)로 설정한다.
회원 가입, 출력, 수정, 탈퇴 프로그램을 작성하시오.

menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 
  
  
1번 가입을 눌렀을 때 처리 - insertMember()
이름 입력 : 
나이 입력 :    
핸드폰 입력 : 
주소 입력 : 

등록 완료..4자리 남았습니다
-----------
만약에 5명이 다 차면 "정원 초과"라고 메세지 띄운다.  


2번 출력을 눌렀을 때 처리 - list()
→ 총 5명중에서 등록된 회원만 보여준다

이름      나이      핸드폰      주소


3번 수정을 눌렀을 때 처리 - updateMember()
→ 회원이 없을 때
핸드폰 번호 입력 : 010-123-1234
찾고자 하는 회원이 없습니다

-------------------------------
→ 회원이 있을 때
핸드폰 번호 입력 : 010-123-1234

이름      나이      핸드폰         주소
홍길동   25      010-123-1234   서울

수정 할 이름 입력 : 
수정 할 나이 입력 :    
수정 할 핸드폰 입력 : 
수정 할 주소 입력 :

수정 완료


4번 삭제를 눌렀을 때 처리 - deleteMember()
→ 회원이 없을 때
핸드폰 번호 입력 : 010-123-1234
찾고자 하는 회원이 없습니다

-------------------------------
→ 회원이 있을 때
핸드폰 번호 입력 : 010-123-1234

삭제 완료

*/