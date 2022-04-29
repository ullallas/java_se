package operator;

public class Operator {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a); //false
		System.out.println("!a = " + !a); //true
		System.out.println();
		
		String b = "apple"; //리터럴 생성
		String c = new String("apple");
		
		//주소
		System.out.println(b == c ? "같다" : "다르다"); //다르다 - 메모리에 들어가있는 위치가 다름
		
		//문자열
		System.out.println(b.equals(c) ? "같다" : "다르다"); //같다
		System.out.println(!b.equals(c) ? "같다" : "다르다"); //다르다
		
		
	}

}


/*
literal
1. 문자형 literal - 'A', 't' ...
2. 정수형 literal - 25, -100 ...
3. 실수형 literal - 35.6, -78.3 ...
4. 문자열 literal - "car", "apple" ...
 */
