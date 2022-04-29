package zoo;

public class Zoo2 {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.giraffe(); 
		z.elephant();
//		z.lion(); --> private 이라서 안됨
	}

}
