package inheritance;

class Test2 extends Object {
	
}
class Sample {
	@Override
	public String toString() {
		return getClass() + "@임창균"; 
	}
}

public class ObjectMain {

	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println("객체 t = " + t); //클@16진수
		System.out.println("객체 t = " + t.toString()); 
		System.out.println("객체 t = " + t.hashCode()); //10진수
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s.toString()); 
		System.out.println();
		
		String str = "apple";
		String text = new String("apple");
		System.out.println("객체 str = " + str);
		System.out.println("str == text : " + (str==text)); //주소 비교
		System.out.println("str.equals(text) : " + (str.equals(text))); //문자열 비교
		System.out.println();
		
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println("obj == obj2 : " + (obj==obj2)); //주소 비교
		System.out.println("obj.equals(obj2) : " + (obj.equals(obj2))); //주소 비교
		System.out.println();
	}

}

/*
class Object{
	public String toString(){} //클@16진수
	public boolean equals(Object obj){} //주소 비교
}

class String extends Object(){
	public String toString(){} //문자열
	public boolean equals(Object obj){} //문자열 비교
}
*/