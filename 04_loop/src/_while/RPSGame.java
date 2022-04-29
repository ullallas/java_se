package _while;

import java.io.IOException;
import java.util.Scanner;

public class RPSGame {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int com, user, money, total = 1000;
		
		
			while(true) {
				
				com = (int)(Math.random() * 3) + 1; //1~3 난수발생
//				System.out.println(com); //난수 출력
				
				System.out.print("가위(1),바위(2),보(3) 중 번호 입력 : ");
				user = scan.nextInt();
				
				do {
					System.out.print("배팅 금액 입력 : ");
					money = scan.nextInt();
					
					if(total >= money) break;
					else System.out.println("당신이 보유한 금액은 " + total + "원 입니다");
				
				} while(true);
				
					System.out.println("결과를 보시려면 Enter를 치세요...");
					System.in.read();
					System.in.read();
					
				if (com == 1 && user == 2) {
					System.out.println("컴퓨터 = 가위	나 = 바위");
					System.out.println("You Win!!");
					total = total + money;
				} else if(com == 1 && user == 3) {
					System.out.println("컴퓨터 = 가위	나 = 보");
					System.out.println("You Lose:(");
					total = total - money;
				} else if(com == 2 && user == 1) {
					System.out.println("컴퓨터 = 바위	나 = 가위");
					System.out.println("You Lose:(");
					total = total - money;
				} else if(com == 2 && user == 3) {
					System.out.println("컴퓨터 = 바위	나 = 보");
					System.out.println("You Win!!");
					total = total + money;
				} else if(com>=3 && user <=1) {
					System.out.println("컴퓨터 = 보	나 = 가위");
					System.out.println("You Win!!");
					total = total + money;
				} else if(com == 3 && user == 2) {
					System.out.println("컴퓨터 = 보	나 = 바위");
					System.out.println("You Lose:(");
					total = total - money;
				} else System.out.println("Draw");
				
				System.out.println("당신의 금액은 " + total + "원 입니다");
				System.out.println();
				
				if(total <= 0) {
					System.out.println("돈이 다 떨어졌어요 ㅠㅠ");
					System.out.print("다시 하시겠습니까? (y/n) : ");
					int yn = System.in.read();
					if (yn == 'N' || yn == 'n') {
						break;
				} else {
					System.out.print("Insert coin? ");
					int coin = scan.nextInt();
					total += coin;
					System.out.println();
					}
				} //if
		
			} //while
		
			System.out.println("프로그램을 종료합니다.");

	} //main

}


// if(com == 1) {
// 	if(user == 1) {
// 		System.out.println("컴퓨터 : 가위\t 나 = 가위");
// 		System.out.println("You Draw");
// 	} else if(user == 2) {
// 		System.out.println("컴퓨터 : 가위\t 나 = 바위");
// 		System.out.println("You Draw");
// 		total += money;
// 	}
// 	}
// }
 
 

/*
[문제] 가위, 바위, 보 게임 - while, if
- 가위(1), 바위(2), 보자기(3) 지정한다.
- 돈이 떨어지면 다시 게임할거냐고 물어보세요
- money=1000원을 무조건 가지고 시작한다.
- 현금이 마이너스이면 [또 할래(y/n)]
- 만약 또 한다면 insert coin? 현금을 입력받는다

[실행결과]
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
배팅 금액 입력 : 200
결과를 보시려면 Enter를 치세요 (선택) - Flush
컴퓨터 : 바위   나 : 보자기
You Win!!
당신의 금액 1200원 입니다.

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
배팅 금액 입력 : 500
컴퓨터 : 가위   나 : 보자기
You Lose!!
당신의 금액 700원 입니다.

가위(1),바위(2),보(3) 중 번호 입력 : 1 (user)
배팅 금액 입력 : 500
컴퓨터 : 가위   나 : 가위
You Draw!!
당신의 금액 700원 입니다.

또 할래? (y/n)

insert coin?

*/