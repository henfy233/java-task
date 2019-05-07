package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 基于ClassLoder读取配置文件
 * https://www.cnblogs.com/sebastian-tyd/p/7895182.html
 * @author luhenghui
 *
 */
public class PropertiesUtil {
	public static String read() {
		try {
			Properties props = new Properties();
			// 使用ClassLoader加载properties配置文件生成对应的输入流
			InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties");
			// 使用properties对象加载输入流
			props.load(is);
			 //获取key对应的value值
			String name = (String) props.get("bear");
			return name;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
