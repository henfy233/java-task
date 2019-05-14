package proxy;

public class Proxy implements Star{
	private RealStar realStar = new RealStar("≤Ã–Ï¿§");
	public void display(){
		realStar.display();
	}
}
