package variable;

public class VariableTest {
	public static void main(String[] args) {
		boolean a = 25>36; // 대입문
		char b = 'A';
		int c = 65;
		double d = 25.8;
		
		char e = 65;
		int f = 'A';
		
		float g = 43.6f; // 43.6F (float형 상수)
		
		long h = 25; // 25 (int형 상수)
		long i = 25L; // 25l (long형 상수)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e); // A
		System.out.println(f); // 65
		System.out.println(g);
	}
}

/*
상수
정수형 - 25, 36, -15 (int)
실수형 - 25.8, 43.6, -15.2 (double)

해결방법
float g = 43.6; - error

1번 double g = 43.6;
2번 float g = 43.6f; // 43.6F (float형 상수)
 */







