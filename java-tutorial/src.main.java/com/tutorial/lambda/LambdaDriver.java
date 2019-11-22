package com.tutorial.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class LambdaDriver {
	static String s1 = "s1";
	private static String s2 = "s2";

	public static void main(String[] args) {

		String s3="s3";
		s3=s3+"55";
		final GenericInterface<String> genericInterface = StringUtils::reverse;
		System.out.println(genericInterface.fun("HEllo"));
		final List<String> lists = Arrays.asList("a", "baaaaaaaaaa");
		lists.stream().forEach(s -> System.out.println(s+s1));
		lists.stream().forEach(s -> System.out.println(s+s2));
		//lists.stream().forEach(s -> System.out.println(s+s3));
		System.out.println(Collections.max(lists, LambdaDriver::compare));
	}

	public static int compare(String s1,String s2) {
		return s1.compareTo(s2);
	}

}
