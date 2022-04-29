package collection;

class GenericTest<T> { // T --> 변수형이 정해지지 않았을 때 (T,E,K,V 4개만 사용가능)
	private T a;
	
	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
}
//----------------------
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<Integer> aa = new GenericTest<Integer>(); //기본형 int의 클래스화 -> Integer (Wrapper class)
		aa.setA(25);
		System.out.println("나이 = " + aa.getA());
		
		//aa.setA("홍길동"); - error
		
		GenericTest<String> bb = new GenericTest<String>();
		bb.setA("홍길동");
		System.out.println("이름 = " + bb.getA());
	}

}

