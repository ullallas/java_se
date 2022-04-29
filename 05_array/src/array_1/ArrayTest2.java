package array_1;

public class ArrayTest2 {


	public static void main(String[] args) { //구현
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
			System.out.println("args[" + i + "]의 문자열 크기 = " + args[i].length());
			System.out.println("args[" + i + "]의 첫번째 문자 = " + args[i].charAt(0));
			System.out.println();
		} //for
		System.out.println();
		
		System.out.println("확장 for");
		for(String data : args) {
			System.out.println(data);
			System.out.println("문자열 크기 = " + data.length());
			System.out.println("첫번째 문자 = " + data.charAt(0));
			System.out.println();
		}
		
	}

}

