package com.factory;

import com.toy.Bear;
import com.toy.Toy;

public class BearFactory implements Factory{
	public Toy newToy(){
		System.out.println("正在创建玩具熊");
		return new Bear();
	}
}
