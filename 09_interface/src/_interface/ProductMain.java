package _interface;

public class ProductMain {

	public static void main(String[] args) {
		Product productService  = new ProductService(); //다형성, 부모 = 자식
		productService.menu();
		System.out.println("프로그램을 종료합니다.");
	}

}
