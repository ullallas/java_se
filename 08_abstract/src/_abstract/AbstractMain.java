package _abstract;

public class AbstractMain extends AbstractTest {
	
	public void setName(String name) { //Override 필수!
		this.name = name;
	}


	public static void main(String[] args) {
//		AbstractTest at = new AbstractTest(); - error
		AbstractTest at = new AbstractMain(); //다형성
		at.setName("홍길동");
		System.out.println(at.getName());
	}

}

/*
생성
- 추상클래스는 new를 할 수 없다.
- 추상클래스를 생성하려면 1. 상속
					2. 메소드
					3. 익명 Inner class
- 반드시 추상메소드 재구현(Override)해야 한다.
*/