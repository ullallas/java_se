package constructor;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		dan = scan.nextInt();
	}
	
	public void output() {
		StringBuffer buffer = new StringBuffer(); //append(), delete()

		for(int i=1; i<=9; i++) {
//			System.out.println(dan + "*" + i + "=" + dan*i);
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer);
			
			buffer.delete(0, buffer.length());  //buffer의 내용 지우기
			
		} //for
	}

	public static void main(String[] args) {
		StringBufferMain sbm = new StringBufferMain();
		sbm.input();
		sbm.output();

	}

}

/*
원하는 단을 입력 : 7	input()
-----------------------------
7*1=7				output()
7*2=14
~~~
7*9=63
*/