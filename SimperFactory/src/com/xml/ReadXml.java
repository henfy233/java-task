package com.xml;

import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

public class ReadXml {
	public static String getXML() {
		try {
			// �����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(new File("src/config.xml"));
			// ��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("name");
			Node classNode = nl.item(0).getFirstChild();
			return classNode.getNodeValue();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
