package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain2 {
	
	private int dan;
	
	public void input() throws IOException { //구현 - 호출부에도 throws
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
			System.out.print("원하는 단을 입력 : ");
			dan = Integer.parseInt(br.readLine());
		 
	}
	
	public void output() {
		if(dan>=2 && dan<=9) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			} //for
		} else {
			// System.out.println("범위초과");
			
			try {
				//개발자가 강제로 Exception 발생
//				throw new Exception("범위초과"); //throws는 백신, throw는 바이러스
				throw new MakeException("범위초과"); 
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		ExceptionMain2 em = new ExceptionMain2();
		em.input(); //호출
		em.output();
	}

}
