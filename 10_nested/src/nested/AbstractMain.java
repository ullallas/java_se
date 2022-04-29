package nested;

/*
// 1
public class AbstractMain implements InterA {

	@Override
	public void aa() {}
	
	@Override
	public void bb() {}
	
	public static void main(String[] args) {
		
	}

}
*/

// 2
/*
public class AbstractMain {

	public static void main(String[] args) {
		InterA in = new InterAImpl();
		in.aa();
	}

}
*/

// 3
public class AbstractMain {

	public static void main(String[] args) {
		InterA in = new InterA() { //익명 이너클래스, 1회용
			public void aa() {}
			public void bb() {}
		}; //세미콜론 필수!
		
		//AbstractTest at = new AbstractTest(); - error
		//생성하려고 1. 자식 클래스
		//		   2. 익명 Inner Class
		
		AbstractTest at = new AbstractTest() {
			public void setName(String name) {
				this.name = name;
			}
		};
		
		AbstractExam ae = new AbstractExam() {};
	}


}