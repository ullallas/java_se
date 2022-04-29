package constructor;

public class ConstructorTest {
	private String name; //필드, 초기화(null)
	private int age; //초기화(0)
	
	public ConstructorTest() { //Overload
		System.out.println("기본 생성자"); //new로 생성
		System.out.println("this = " + this);
	}
	public ConstructorTest(String name) { //Overload
		this();
		this.name = name; //name이 여기값인지 클래스 값인지 모름 -> this써서 클래스 값이라고 알려줌
		System.out.println("this = " + this);
	}
	public ConstructorTest(int age) { //Overload
		this("네오"); //Overload된 다른 생성자를 호출
		this.age = age;
		System.out.println("this = " + this);
	}
	
	public String getName(){
		return this.name; //name이 클래스 값임이 분명함 -> this 안써도 됨 
	}
	public int getAge(){
		return this.age;
	}
	
}
