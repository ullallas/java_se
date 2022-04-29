package method;

public class MethodTest2 {
	int a; //필드

	public static void main(String[] args) {
		int a; //지역변수
		MethodTest2 mt = new MethodTest2();
		
//		int s = mt.sum(25, 36); //호출
		System.out.println("합 = " + mt.sum(25, 36)); //호출
		System.out.println("차 = " + mt.sub(25, 36)); 
		System.out.println("곱 = " + mt.mul(25, 36)); 
		System.out.println("몫 = " + mt.div(25, 36)); 

	} //main
	
	public int sum(int a, int b) { //구현 //sum(매개변수 parameter, 인수 argument) // public과 sum 사이에는 반환값의 자료형
		return a+b; //반환
	} //sum(int a, int b)
	
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public double div(int a, int b) {
		return (double)a/b;
	}
}
