package inheritance;

public class SubTest extends SuperTest {
	private String name;
	private int age;
	
	public SubTest(String n, int a, double w, double h) {
		//부모 생성자 호출
		super(w, h);
		
		System.out.println("SubTest 생성자");
		this.name = n;
		this.age = a;
		this.weight = w;
		this.height = h;
	}

	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
//		System.out.println("몸무게 = " + weight);
//		System.out.println("키 = " + height);
		this.disp();
	}

	public static void main(String[] args) {
		//Sub class를 생성하면 나와 내 부모를 같이 생성한다 => 생성자 2번 호출 ***중요!***
		SubTest aa = new SubTest("홍길동", 25, 72.8, 183.6); //1:1관계, 결합도100%
		aa.output();
		System.out.println("----------");
		aa.disp();
		System.out.println();
		
		SuperTest bb = new SubTest("코난", 13, 52.3, 162.5); //부모 = 자식 (다형성, 결합도 낮추기)
//		bb.output(); - error
		bb.disp();
		
		
	}

}

//String a = new String("apple");
//String b = a;
//String a = new String("apple");
