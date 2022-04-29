package inheritance;

public class ChildTest extends SuperTest {
	private String name;
	private int age;
	
	public ChildTest(String n, int a, double w, double h) {
		super(w, h);
		
		System.out.println("Child 생성자");
		this.name = n;
		this.age = a;
		this.weight = w;
		this.height = h;
	}
	
	public void disp() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		super.disp();
	}

	public static void main(String[] args) {
		ChildTest aa = new ChildTest("홍길동", 25, 72.8, 183.6);
		aa.disp();
		System.out.println();
		
		SuperTest bb = new ChildTest("코난", 13, 52.3, 162.5);
		bb.disp();
	}

}
