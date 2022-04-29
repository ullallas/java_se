package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class SunkJukService {
	private Scanner scan = new Scanner(System.in);
	private ArrayList<SungJukDTO> list; //다른 곳에 new해서 불러오기. 이 문장 고치지X

	public SunkJukService() {
		list = new ArrayList<SungJukDTO>();
	}
	
	public void menu() {
		int num;

		while(true) {
			System.out.println();
			System.out.println("**********************");
			System.out.println("	1. 입력");
			System.out.println("	2. 출력");
			System.out.println("	3. 검색");
			System.out.println("	4. 삭제");
			System.out.println("	5. 정렬");
			System.out.println("	6. 끝");
			System.out.println("**********************");
			System.out.print("	번호 : ");
			num = scan.nextInt();
			if(num == 6) break; //while을 벗어나라
			if(num < 1 || num > 6) {System.out.println("1~6 중에 선택하세요"); continue;} 
			
			if(num == 1) {
				insertArticle();
			}else if(num == 2) {
				printArticle();
			}else if(num == 3) {
				searchArticle();
			}else if(num == 4) {
				deleteArticle();
			}else if(num == 5) {
				sortArticle();
			}
		
		} //while
		
		System.out.println();
		
	} //menu()

	private void sortArticle() {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("1. 이름으로 오름차순");
			System.out.println("2. 총점으로 내림차순");
			System.out.println("3. 이전메뉴");
			System.out.print("	번호 : ");
			num = scan.nextInt();
			if(num == 3) break; //while을 벗어나라
			
			if(num == 1) {
				Collections.sort(list);
				this.printArticle();
				
			}else if (num == 2){
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						//조건 연산자
						
						return s1.getTot() < s2.getTot() ? 1 : -1;
					}
				};
				Collections.sort(list, com);
				this.printArticle();
			}
		} //while
		
	} //sortArticle()

	public void insertArticle() {
		
		System.out.print("번호 입력 : ");
		int no = scan.nextInt();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		int math = scan.nextInt();
		
		SungJukDTO dto = new SungJukDTO(no, name, kor, eng, math);
		dto.calc();		
		list.add(dto); //배열 대신 list에 보관 --> 데이터가 아닌 주소를 보관
		
		System.out.println("데이터를 저장하였습니다");
		
	} //insertArticle()

	public void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
//		System.out.println(list.get(0).getName()+"\t"+list.get(0).getKor());
		
//		for(SungJukDTO dto : list) {
//			System.out.println(dto.getNo()+"\t"
//							  +dto.getName()+"\t"
//							  +dto.getKor()+"\t"
//							  +dto.getEng()+"\t"
//							  +dto.getMath()+"\t"
//							  +dto.getTot()+"\t"
//							  +dto.getAvg());
//		} //for i
		
		for(SungJukDTO dto : list) {
			System.out.println(dto); //주소를 찍어라
		}
	
	} //printArticle()

	public void searchArticle() {
		System.out.println();
		System.out.print("검색 할 이름 입력 : ");
		String name = scan.next();
		
		int sw = 0; //switch
		
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				if(sw==0) System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(dto);
				sw=1;
			} //if
	
		} //for
		
		if(sw==0) System.out.println("찾고자 하는 이름이 없습니다.");
	
	} //searchArticle()

	public void deleteArticle() {
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.next();
		
		int count=0;
		Iterator<SungJukDTO> it = list.iterator(); //사랑의 작대기..?ㅋㅎ
		while(it.hasNext()) { //항목이 있으면 T, 없으면 F
			SungJukDTO dto = it.next(); //it가 가리키는 곳의 항목을 꺼내서 보관하고, it는 다음으로 이동
		
			if(dto.getName().equals(name)) {
				it.remove(); //it가 가리키는 곳의 항목을 지우는게 아니라, 아까 꺼내놓은 dto를 지운다
				count++;
			} //if
		} //while
		
		if(count==0) {
			System.out.println("삭제하고자 하는 이름이 없습니다.");
		}else {
			System.out.println("데이터를 " + count + "건 삭제하였습니다.");
		}
		
	} //deleteArticle()
	
}
