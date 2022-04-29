package _class;

class Person{ //메뉴판
	//필드, 초기화
	private String name = null; //외부에서 접근금지! class 안에서만 접근가능
	private int age = 0; //클래스는 기본적으로 null or 0으로 초기화 되어있음
	
	//메소드 - 동전투입구
	public void setName(String n){ //구현
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setData(String n, int a) { //String과 int자리 바뀌면 안됨 //Overload
		name = n;
		age = a;
	}
	public void setData() {} //Overload(쌍둥이)
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
//-------------
public class PersonMain {

	public static void main(String[] args) {
		Person p; //객체
		p = new Person(); //생성
		System.out.println("객체 p = " + p);
		p.setName("홍길동"); //호출
		p.setAge(25); //호출
		System.out.println(p.getName() + ", " + p.getAge());
		System.out.println();
		
		Person p2 = new Person(); //생성
		System.out.println("객체 p2 = " + p2);
		p2.setName("코난"); //호출
		p2.setAge(13); //호출
		System.out.println(p2.getName() + ", " + p2.getAge());
		System.out.println();
		
		Person p3 = new Person(); //생성
		System.out.println("객체 p3 = " + p3);
		p3.setData("둘리", 100);
		System.out.println(p3.getName() + ", " + p3.getAge());
		System.out.println();
		
		Person p4 = new Person(); //생성
		System.out.println("객체 p4 = " + p4);
		p4.setData();
		System.out.println(p4.getName() + ", " + p4.getAge());
		System.out.println();
	}

}
