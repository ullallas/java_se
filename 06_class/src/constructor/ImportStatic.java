package constructor;

//import static java.lang.Math.random;
//import static java.lang.Math.pow;

import static java.lang.Math.*; // * : (와일드 카드, 모든 것) 단, static에서만 허용(함수, 메소드)
import static java.lang.System.out;

//import static java.lang.*; // - error //클래스명에 와일드카드 X 

public class ImportStatic {

	public static void main(String[] args) {
		out.println("난수 = " + random());
		out.println("제곱 = " + pow(2, 5)); //2의 5제곱
	}

}
