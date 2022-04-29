package inheritance;

class Test extends Object { //extends Object 생략가능
	int a, b; //default
	
	@Override
	public String toString() {
		return "Have a nice day!";
	}
}
//-------------
public class TestMain { //Object 생략

	public static void main(String[] args) {
		Test aa = new Test();
		System.out.println("객체 aa = " + aa);
		Test bb = aa;
		
		aa.a = 2;
		aa.b = 5;
		System.out.println(aa.a + "\t" + aa.b); //2 5
		System.out.println(bb.a + "\t" + bb.b); //2 5
		System.out.println();
		
		bb.a = 7;
		bb.b = 9;
		System.out.println(aa.a + "\t" + aa.b); //7 9
		System.out.println(bb.a + "\t" + bb.b); //7 9
		System.out.println();

		bb = new Test();
		bb.a = 10;
		bb.b = 20;
		System.out.println(aa.a + "\t" + aa.b); //7 9
		System.out.println(bb.a + "\t" + bb.b); //10 20
		System.out.println();
	}

}
