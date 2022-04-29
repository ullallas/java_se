package _abstract;

public abstract class AbstractTest { //POJO형식 (Plain Old Java Object)
	String name;
	
	public abstract void setName(String name); //추상메소드 --> 클래스에도 abstract 필요
	
	public String getName() {
		return name;
	}

}
