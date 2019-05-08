package huawei;

import factory.AbstractFactory;
import factory.PC;
import factory.Phone;

public class HuaWeiFactory implements AbstractFactory{
	public Phone createPhone(){
		System.out.println("Creating HuaWeiPhone");
		return new HuaWeiPhone();
	}
	public PC createPC(){
		System.out.println("Creating HuaWeiPC");
		return new HuaWeiPC();
	}
}
