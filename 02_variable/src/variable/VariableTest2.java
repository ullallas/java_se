package variable;

public class VariableTest2 {
	// 필드
	int a;
	static int b;
	
	public static void main(String[] args) {
		int a = 10; // 지역변수
		System.out.println("지역변수 a = " + a);
		
		
		// int a; - error (이미 a가 있음)
		
		VariableTest2 vt = new VariableTest2(); // 생성
		
		System.out.println("전역변수 b = " + b);
		System.out.println("전역변수 b = " + vt.b);
		System.out.println("전역변수 b = " + VariableTest2.b);
		System.out.println("전역변수 a = " + vt.a);
	}

}



/*
변수
local variable (지역변수) 
 - 메소드 단위
 - 쓰레기값 존재, 반드시 초기화해야 함

필드 (전역변수)
 - 이미 초기화 되어 있음 (0)
 */