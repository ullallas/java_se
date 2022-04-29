package constructor;

class StaticTest {
	//필드
	private int a; //인스턴스 변수
	static int b; //클래스 변수
	
	static{ 		//메모리를 잡아먹으니 많이 사용X
		System.out.println("초기화 영역");
		b=3;
	}
	
	public StaticTest() {
		System.out.println("StaticTest 기본 생성자");
		a=3;
	}
	
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a = " + a + " b = " + b);
	}
	public static void output() {
		System.out.println("static method...");
//		System.out.println("a = " + this.a + ", b = " + StaticTest.b); //static함수 안에서는 static변수만 사용 가능
	}
}
//--------------
public class StaticMain {

	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.calc(); 
		aa.disp(); //a=4 b=4
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp(); //a=4 b=5
		System.out.println();
	
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		System.out.println();
		
		StaticTest.output();
		aa.output();
		
//		System.out.println(StaticTest.b); 
	
	}

}
