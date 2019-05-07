package com.factory;

import com.toy.Car;
import com.toy.Toy;

public class CarFactory implements Factory{
	public Toy newToy(){
		System.out.println("正在创建玩具车");
		return new Car();
	}
}
