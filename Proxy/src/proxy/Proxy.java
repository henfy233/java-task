package proxy;

public class Proxy implements Star{
	private RealStar realStar = new RealStar("������");
	public void display(){
		realStar.display();
	}
}
