package com.tutorial.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		set.add(1);
		set.add(2);
		set.add(3);
		Iterator<Integer> iterator = set.iterator();
		findFinal(list);
		/*
		 * while (iterator.hasNext()) { int t; if ((t = iterator.next()) == 3) {
		 * System.out.println(t); set.remove(t); }
		 * 
		 * }
		 */
	}

	public static List<Integer> findFinal(final List<Integer> list) {
		list.add(4);
		System.out.println(list);
		return list;
	}
}
