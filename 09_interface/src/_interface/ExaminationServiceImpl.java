package _interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExaminationServiceImpl implements ExaminationService {
	private List<ExaminationDTO> list;

	private Scanner scan = new Scanner(System.in);
	
	ExaminationServiceImpl(){
		list = new ArrayList<ExaminationDTO>(); //부모 = 자식
	}
	
	public void menu() {
		
		while(true) {
			System.out.println();
			System.out.println("**********************");
			System.out.println("	1. 입력");
			System.out.println("	2. 출력");
			System.out.println("	3. 끝");
			System.out.println("**********************");
			System.out.print("	번호 : ");
			int num = scan.nextInt();
			if(num == 3) break; //while을 벗어나라
			
			if(num == 1) {
				insertArticle();
			}else if(num == 2) {
				printArticle();
			}
		} //while
		System.out.println();
	} //menu
	
	
	@Override
	public void insertArticle() {
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("답 입력 (5글자 제한) : ");
		String dap = scan.next();
		
		ExaminationDTO dto = new ExaminationDTO();
		dto.setName(name);
		dto.setDap(dap);
		dto.compare();
		
		list.add(dto);
		System.out.println("입력이 완료되었습니다.");
	}

	@Override
	public void printArticle() {
		System.out.println("이름\t1 2 3 4 5 \t점수");

//		for(int i=0; i<list.size(); i++) {
//		for(ExaminationDTO dto : list) {
//			System.out.print(dto.getName()+ "\t");
//			for(int i=0; i<dto.getOx().length; i++) {
//				System.out.print(dto.getOx()[i] + "  ");
//			} //for i
//			
//			System.out.println("\t" + dto.getScore());
//		} //for
		
		for(ExaminationDTO dto : list) {
			System.out.println(dto);
		}
	}

}


//부모 = 자식
//List<ExaminationDTO> list = new ArrayList<ExaminationDTO>();