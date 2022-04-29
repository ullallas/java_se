package constructor;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수 = " + st.countTokens()); //3
		
		while(st.hasMoreTokens()) {		//현재 위치에 항목이 있다/없다 (T/F)
			System.out.println(st.nextToken());		//현재 위치의 항목을 꺼내주고 다음 위치로 이동
		} //while
		System.out.println("----------------");
		
		String[] ar = str.split(","); //제일 많이 사용!
		for(String data : ar) {
			System.out.println(data);
		}
	}

}
