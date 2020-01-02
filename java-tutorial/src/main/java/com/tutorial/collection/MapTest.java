package com.tutorial.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MapTest <T> implements Iterable<T> {
	
	private int a;
	public void run()
	{
		a++;
	}
	public static <T> void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		Stream.of(map);
		map.keySet();
		MapTest<T> m=new MapTest<>();
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
