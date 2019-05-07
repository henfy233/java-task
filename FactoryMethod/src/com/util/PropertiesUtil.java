package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * ����ClassLoder��ȡ�����ļ�
 * https://www.cnblogs.com/sebastian-tyd/p/7895182.html
 * @author luhenghui
 *
 */
public class PropertiesUtil {
	public static String read() {
		try {
			Properties props = new Properties();
			// ʹ��ClassLoader����properties�����ļ����ɶ�Ӧ��������
			InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties");
			// ʹ��properties�������������
			props.load(is);
			 //��ȡkey��Ӧ��valueֵ
			String name = (String) props.get("bear");
			return name;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
