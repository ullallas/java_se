package collection;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); 
//		list.add(25);
//		list.add(43.8); //실수, 정수 노상관
		list.add("호랑이"); //중복허용, 순서
		list.add("사자");
		list.add("기린");
		list.add("호랑이");
		list.add("코끼리");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}// for i
		System.out.println("-----------");
		
		for(String data : list) {
			System.out.println(data);
			
		}
				
	}

}
