package _interface;

public class ExaminationDTO {
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	public static final String JUNG = "11111";
	
	public ExaminationDTO() {
		ox = new char[5];
	}
	public void compare() {
		for(int i=0; i<ox.length; i++) {
			if(dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			} else ox[i] = 'X';
			
		} //for
		
	}
	
	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDap() {
		return dap;
	}
	public void setDap(String dap) {
		this.dap = dap;
	}
	
	public char[] getOx() {
		return ox;
	}
	public void setOx(char[] ox) {
		this.ox = ox;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name + "\t" + ox[0] + " "+ ox[1] + " " + ox[2] + " " + ox[3] + " " + ox[4] + " \t" + score;
	}
	
	

}
