package constructor;

import java.util.Scanner;

public class MemberService {
	private MemberDTO[] ar = new MemberDTO[5];
	Scanner scan = new Scanner(System.in);
	
	public void menu() {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("**********************");
			System.out.println("	1. 가입");
			System.out.println("	2. 출력");
			System.out.println("	3. 수정");
			System.out.println("	4. 탈퇴");
			System.out.println("	5. 끝내기");
			System.out.println("**********************");
			System.out.print("	번호 : ");
			num = scan.nextInt();
			if(num == 5) break; //while을 벗어나라
			
			if(num == 1) {
				insertMember();
			}else if(num == 2) {
				list();
			}else if(num == 3) {
				updateMember();
			}else if(num == 4) {
				deleteMember();
			}
		} //while
		System.out.println();
	} //menu()

	private void insertMember() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int i;
		
		for(i=0; i<ar.length; i++) {
			if(ar[i]==null) break;
		} //for i
		if(i == ar.length) {
			System.out.println("정원 초과");
			return; //메소드를 벗어나라
		}
		
		for(i=0; i<ar.length; i++) {
			
			if(ar[i] == null) {
				
				System.out.print("이름 입력 : ");
				String name = scan.next();
				System.out.print("나이 입력 : ");
				int age = scan.nextInt();
				System.out.print("핸드폰 입력 : ");
				String phone = scan.next();
				System.out.print("주소 : ");
				String address = scan.next();
				
				ar[i] = new MemberDTO(name, age, phone, address); 
	
				
				break; //for를 벗어나라
			} //if
		} //for
		int count=0;
		for(i=0; i<ar.length; i++) {
			if(ar[i]==null) count++;
		} //for i
		
		System.out.println("등록완료! " + count + "자리 남았습니다");
	
	} //insertMember()
	
	private void list() {
		System.out.println();
		System.out.println("이름\t나이\t핸드폰\t주소");
		for(int i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				System.out.println(ar[i].getName() + "\t"
								 + ar[i].getAge() + "\t"
								 + ar[i].getPhone() + "\t"
								 + ar[i].getAddress());
			}
		} //for
	} //list()

	private void updateMember() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) break;
			}
		} //for i
		
		if(i == ar.length) {
			System.out.println("찾고자 하는 회원이 없습니다");
			return;
		}
		
		System.out.println("이름\t나이\t핸드폰\t주소");
		System.out.println(ar[i].getName() + "\t"
				 + ar[i].getAge() + "\t"
				 + ar[i].getPhone() + "\t"
				 + ar[i].getAddress());
		
		System.out.println();
		System.out.print("수정할 이름 입력 : ");
		ar[i].setName(scan.next());
		System.out.print("수정할 나이 입력 : ");
		ar[i].setAge(scan.nextInt());
		System.out.print("수정할 핸드폰 입력 : ");
		ar[i].setPhone(scan.next());
		System.out.print("수정할 주소 입력 : ");
		ar[i].setAddress(scan.next());
		
		System.out.println();
		System.out.println("수정 완료!");
	} //updateMember()

	private void deleteMember() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) break;
			}
		} //for i
		
		if(i == ar.length) {
			System.out.println();
			System.out.println("찾고자 하는 회원이 없습니다");
			return;
		}
		ar[i] = null;
		System.out.println();
		System.out.println("탈퇴 완료!");
		
	} //deleteMember()


}
