package com.factory;

import com.toy.Bear;
import com.toy.Toy;

public class BearFactory implements Factory{
	public Toy newToy(){
		System.out.println("���ڴ��������");
		return new Bear();
	}
}
