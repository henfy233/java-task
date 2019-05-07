package com.factory;

import com.toys.Toys;
import com.toys.ToysBear;
import com.toys.ToysDog;

/**
 * ���𴴽�����������Ķ���
 * @author ICTUSER44
 *
 */
public class ToysFactory {
	private static final String bear = "bear";
	private static final String dog = "dog";
	public static Toys getInstance(String type){
		if(bear.equals(type)){
			return new ToysBear();
		}else if(dog.equals(type)){
			return new ToysDog();
		}
		return null;
	}
}
