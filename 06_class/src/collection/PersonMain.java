package collection;

import java.util.ArrayList;

public class PersonMain {
	
	
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("네오", 30);
		PersonDTO cc = new PersonDTO("프로도", 35);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
	}
	
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		ArrayList<PersonDTO> list = pm.init();
		System.out.println("list = " + list); //주소나옴
		
		for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
		}
		System.out.println("---------");
		
		for(PersonDTO dto : list) {
			System.out.println(dto.getName() + ", " + dto.getAge());
		}
		
//		System.out.println(aa.getName() + ", " + aa.getAge());
//		System.out.println(bb.getName() + ", " + bb.getAge());
//		System.out.println(cc.getName() + ", " + cc.getAge());
	
	}
}


