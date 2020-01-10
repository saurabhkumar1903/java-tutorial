package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
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
		
		List<Integer> list=new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3));
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		//	list.remove(2);
		}
		
		Hashtable hashtable=new Hashtable();
		hashtable.put(1, "one");
		hashtable.put(2, "one");
		hashtable.put(3, "one");
		Enumeration elements = hashtable.elements();
		while(elements.hasMoreElements())
			System.out.println(elements.nextElement());
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
