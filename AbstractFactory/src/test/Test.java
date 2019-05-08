package test;

import xiaomi.XiaoMiFactory;
import huawei.HuaWeiFactory;
import factory.AbstractFactory;

public class Test {
	public static void main(String[] args) {
		AbstractFactory xiaomi1 = new XiaoMiFactory();
		xiaomi1.createPhone().show();
		AbstractFactory huawei1 = new HuaWeiFactory();
		huawei1.createPhone().show();
		AbstractFactory xiaomi2 = new XiaoMiFactory();
		xiaomi2.createPC().show();
		AbstractFactory huawei2 = new HuaWeiFactory();
		huawei2.createPC().show();
	}
}
