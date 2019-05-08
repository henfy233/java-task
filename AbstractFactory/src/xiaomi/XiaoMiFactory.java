package xiaomi;

import factory.AbstractFactory;
import factory.PC;
import factory.Phone;

public class XiaoMiFactory implements AbstractFactory{
	public Phone createPhone(){
		System.out.println("Creating XiaoMiPhone");
		return new XiaoMiPhone();
	}
	public PC createPC(){
		System.out.println("Creating XiaoMiPC");
		return new XiaoMiPC();
	}
}
