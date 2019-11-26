package com.tutorial.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution2 {

	public static void main(String args[]) throws NumberFormatException, IOException {
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int numberOfDays = Integer.parseInt(br.readLine());
		final String ingredients[] = br.readLine().split(" ");
		final Map<String, Integer> ingredientMap = new HashMap<>();
		final Deque<String> dqueue = new LinkedList<>();
		String output = "";
		for (final String ingredient : ingredients) {

			dqueue.add(ingredient);
			if (ingredient.startsWith("FAT")) {
				ingredientMap.put("FAT", ingredientMap.getOrDefault("FAT", 0) + 1);
			}

			if (ingredient.startsWith("FIBER")) {
				ingredientMap.put("FIBER", ingredientMap.getOrDefault("FIBER", 0) + 1);
			}

			if (ingredient.startsWith("CARB")) {
				ingredientMap.put("CARB", ingredientMap.getOrDefault("CARB", 0) + 1);
			}

			if ((null != ingredientMap.get("FAT")) && ingredientMap.get("FAT") >= 2 && dqueue.size() >= 3) {
				output += "1";
				dqueue.remove(ingredient);
				ingredientMap.put("FAT", ingredientMap.get("FAT") - 1);
				removeOneFromTop(dqueue, ingredientMap);
				removeNext(dqueue, ingredientMap, "FAT");
			}
			else if ((null != ingredientMap.get("FIBER")) && ingredientMap.get("FIBER") >= 2 && dqueue.size() >= 3) {
				output += "1";
				dqueue.remove(ingredient);
				ingredientMap.put("FIBER", ingredientMap.get("FIBER") - 1);
				removeOneFromTop(dqueue, ingredientMap);
				removeNext(dqueue, ingredientMap, "FIBER");
			}
			else if ((null != ingredientMap.get("CARB")) && ingredientMap.get("CARB") >= 2 && dqueue.size() >= 3) {
				output += "1";
				dqueue.remove(ingredient);
				ingredientMap.put("CARB", ingredientMap.get("CARB") - 1);
				removeOneFromTop(dqueue, ingredientMap);
				removeNext(dqueue, ingredientMap, "CARB");
			} else {
				output += "0";

			}
			System.out.println("Processed :"+ingredient + " output :"+output);
		}
		// output=output.substring(0,output.length()-1);
		System.out.println(output);
	}

	private static void removeNext(Deque<String> dqueue, Map<String, Integer> ingredientMap, String ingredient) {
		if (ingredientMap.get(ingredient) != 0) {
			// we will pop first dish starts with ingr
			for (final String d : dqueue) {
				if (d.startsWith(ingredient)) {
					final String removed = dqueue.pop();
					ingredientMap.put(ingredient, ingredientMap.get(ingredient) - 1);
				}
			}
		} else {
			// we will pop top dish
			final String removed = dqueue.pop();
			ingredientMap.put(ingredient, ingredientMap.get(ingredient) - 1);
		}

	}

	private static void removeOneFromTop(Deque<String> dqueue, Map<String, Integer> ingredientMap) {
		for (final String deString : dqueue) {
			if (deString.startsWith("FAT")) {

				dqueue.remove(deString);
				ingredientMap.put("FAT", ingredientMap.get("FAT") - 1);
			}

			if (deString.startsWith("FIBER")) {

				dqueue.remove(deString);
				ingredientMap.put("FIBER", ingredientMap.get("FIBER") - 1);
			}
			if (deString.startsWith("CARB")) {

				dqueue.remove(deString);
				ingredientMap.put("CARB", ingredientMap.get("CARB") - 1);
			}
		}

	}

}
