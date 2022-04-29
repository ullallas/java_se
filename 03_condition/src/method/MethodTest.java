package method;

public class MethodTest {

//	int a; -> 가능. a라는 이름으로 방을 만드세요
//	a = 10; -> 안됨. 함수 안에 써야함 (보이드 메인)
//	System.out.println("") -> 안됨. 함수 안에 써야함
	
	public static void main(String[] args) { //구현
		output(); //호출
		MethodTest.output();
		
		MethodTest mt = new MethodTest(); //생성
		System.out.println("mt = " + mt); //@뒤 = 주소
		mt.disp(); //호출
		
	}
	
	public void disp() { //구현
		System.out.println("non_static method..");
		
	}
	
	public static void output() { //구현
		System.out.println("static method..");
		
	}

}

//main이 없어도 에러는 안뜬다. 문법이 틀린게 없기 때문. 하지만 실행은 불가
//main은 JVM이 실행 시 가져옴
