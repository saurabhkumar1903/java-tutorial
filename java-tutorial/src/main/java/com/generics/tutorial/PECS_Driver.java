package com.generics.tutorial;

import java.util.ArrayList;
import java.util.List;

public class PECS_Driver {
	public static void main(String[] args) {

		final List<? extends Fruit> list;
		final List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
		// list.add(new Fruit());
		// list.add(new Apple());
		list = apples;
	}

}
