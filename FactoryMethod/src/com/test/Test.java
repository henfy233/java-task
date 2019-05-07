package com.test;

import com.factory.Factory;
import com.util.PropertiesUtil;

public class Test {
	public static void main(String[] args) {
		try {
			String name = PropertiesUtil.read();
			Factory F = (Factory) Class.forName(name).newInstance();
			F.newToy().show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
