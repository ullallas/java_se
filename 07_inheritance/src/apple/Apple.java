package apple;

import zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		Zoo z = new Zoo();
		z.tiger();
//		z.giraffe(); --> public이 아니어서 안됨
//		z.elephant();
//		z.lion();
		
	}

}
