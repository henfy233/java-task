package com.test;

import com.factory.ToysFactory;
import com.toys.Toys;
import com.xml.ReadXml;

public class SimperFactoryTest {
	public static void main(String[] args) {
		String name = ReadXml.getXML();
		Toys toys = ToysFactory.getInstance(name);
		toys.show();
	}
}
