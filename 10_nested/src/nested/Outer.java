package nested;

public class Outer {
	private String name;
	
	public void output() {
		Inner in = new Inner();
		System.out.println("이름 : " + this.name + "\t나이 : " + in.age); //setter & getter 필요 없음
	}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름 : " + Outer.this.name + "\t나이 : " + this.age);
		}
	} //class Inner
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "임창균";
		System.out.println("이름 = " + ou.name);
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 25;
		in2.disp();
		
		Outer.Inner in3 = ou.new Inner();
//		in2.name = "코난"; - static 안에서는 불가능
		in3.age = 30;
		in3.disp();
		
		Outer.Inner in4 = new Outer().new Inner();
		in4.age = 35;
		in4.disp();
		
	}

}
