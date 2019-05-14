package proxy;

public class RealStar implements Star{
	private String name;

	RealStar(String name) {
		this.name = name;
	}
	public void display(){
		System.out.println(name+"ÔÚ³ª Ìø rap");
	}
}
