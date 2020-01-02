package com.tutorial.collectortutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class FlatMapTest {
	
	public static void main(String[] args) {
		Employee employee1=new Employee("a","a",1d,"a");
		Employee employee2=new Employee("a","a",1d,"a");
		Employee employee3=new Employee("a","a",1d,"a");
		Employee employee4=new Employee("a","a",1d,"a");
		List<Employee> list=new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		NavigableSet<Integer> set=new TreeSet<>(Collections.reverseOrder());
		set.add(null);
		Hashtable<String, Integer> hashtable=new Hashtable<>();
		HashSet<Integer> hashSet=new HashSet<>();
		System.out.println(set);
		//Stream<String> flatMap = list.stream().flatMap(emp->Stream.of(emp.getEmpId()));
				//.forEach((x)->System.out.println(x));;
		//Stream<String> map = list.stream().map(emp->emp.getEmpId());
	}

}
