package constructor;

public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorTest aa = new ConstructorTest();
		System.out.println("객체 aa = " + aa);
		System.out.println(aa.getName()+", "+aa.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("홍길동");
		System.out.println("객체 bb = " + bb);
		System.out.println(bb.getName()+", "+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);
		System.out.println("객체 cc = " + cc);
		System.out.println(cc.getName()+", "+cc.getAge());
		System.out.println();
	}

}
