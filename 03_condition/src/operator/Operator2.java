package operator;

public class Operator2 {

	public static void main(String[] args) {
		int a = 5;
		a += 2; //a = a + 2; //덮어쓰기
		a *= 3; //a = a * 3;
		System.out.println("a = " + a); //21
		
		a++;
		System.out.println("a = " + a); //22
		
		int b = a++;
		System.out.println("a = " + a + ", b = " + b); //23, 22
		
		int c = ++a - b--;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c); //24, 21, 2
		
		System.out.println("a++ = " + a++); //24
//		System.out.println("a++ = " + a); //24
//		a++; //25
		
		System.out.println("a = " + a); //25
	}

}

/*
a = a + 1 -> a += 1 -> ++a(선헹) 또는 a++(후행)
a = a - 1 -> a -= 1 -> --a(선행) 또는 a--(후행)


a = a + 3 -> a += 3
a = a - 3 -> a -= 3
a = a * 3 -> a *= 3
a = a / 3 -> a /= 3


 */
