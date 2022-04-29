package constructor;

class Compute{
	private int x, y, sum, sub, mul;
	private double div;
	
	public Compute(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void calc() {
		sum = x + y;
		sub = x - y;
		mul = x + y;
		div = (double)x / y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public double getDiv() {
		return div;
	}
	
	
	
	
}
//-------------
public class ComputeMain {

	public static void main(String[] args) {
//		Compute aa = new Compute(320, 258);
//		Compute bb = new Compute(125, 110);
//		Compute cc = new Compute(578, 312);
		
		
//		Compute[] ar = new Compute[3];
//		ar[0] = new Compute(320, 258);
//		ar[1] = new Compute(125, 110);
//		ar[2] = new Compute(578, 312);
		

//		Compute[] ar = new Compute[] {new Compute(320, 258), 
//									  new Compute(125, 110), 
//									  new Compute(578, 312)};
	
		Compute[] ar = {new Compute(320, 258), 
						new Compute(125, 110), 
						new Compute(578, 312)};

	//		for(int i=0; i<ar.length; i++) 
			for(Compute c : ar) {
				c.calc();
				
				System.out.println(c.getX() + "\t"
								 + c.getY() + "\t"
								 + c.getSum() + "\t"
								 + c.getSub() + "\t"
							     + c.getMul() + "\t"
								 + String.format("%.3f", c.getDiv()));
		}
		
	}

}

/*
[문제] x, y의 합, 차, 곱, 몫을 구하시오

[실행결과]
   x      y      sum      sub      mul      div
   320       258
   125     110
   578     312   
*/