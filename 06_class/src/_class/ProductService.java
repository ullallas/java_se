package _class;

import java.util.Scanner;

public class ProductService {
	private ProductDTO[] ar = new ProductDTO[5];
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("**********************");
			System.out.println("	1. 물건 담기");
			System.out.println("	2. 담은 물건 보기");
			System.out.println("	3. 종료");
			System.out.println("**********************");
			System.out.print("	번호 선택 : ");
			num = scan.nextInt();
			if(num == 3) break; //while을 벗어나라
			
			if(num == 1) {
				insertPrduct();
			}else if(num == 2) {
				displayProduct();
			}
		} 
	} //menu()

	private void insertPrduct() {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<ar.length; i++) {
			if(ar[i] == null) {
				ar[i] = new ProductDTO();

				System.out.print("상품명 입력 : ");
				ar[i].setItem(scan.next());
				System.out.print("단가 입력 : ");
				ar[i].setPrice(scan.nextInt());
				System.out.print("개수 입력 : ");
				ar[i].setQty(scan.nextInt());
				
				ar[i].calc(); //계산
				
				break; //for를 벗어나라
			}
		} //for
	} //insertPrduct()
	private void displayProduct() {
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				System.out.println(ar[i].getItem() + "\t"
								 + ar[i].getPrice() + "\t"
								 + ar[i].getQty() + "\t"
								 + ar[i].getTotal());
			}
		}
	} //displayProduct()

	

}
