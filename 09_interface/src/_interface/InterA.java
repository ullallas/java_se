package _interface;

public interface InterA {
	public static final String NAME = "홍길동"; //상수
	int AGE = 25;
	
	public abstract void aa(); //추상메소드만 가능
//	public void bb() {} - error
	public void bb(); //abstract 생략 가능
}
