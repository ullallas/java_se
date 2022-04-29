package inheritance;

enum EnumColor {
	RED, GREEN, BLUE
}

public class EnumMain {
//	public static final String RED = "빨강";
//	public static final String GREEN = "초록";
//	public static final String BLUE = "파랑";

	public static void main(String[] args) {
		System.out.println(EnumColor.RED);
		System.out.println();
		
		for(EnumColor data : EnumColor.values()) {
			System.out.println(data.ordinal() + "\t" + data);
		}
	}

}
