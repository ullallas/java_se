package zoo.safari;

import zoo.Zoo;

public class Safari extends Zoo {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.tiger();
//		z.giraffe();
//		z.elephant();
//		z.lion();
		
		Safari s = new Safari();
		s.tiger();
		s.giraffe();
//		s.elephant();
//		s.lion();
	}

}
