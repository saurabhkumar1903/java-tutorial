package com.tutorial.generics;

public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;

	MinMaxImpl(T[] ts) {
		vals = ts;
	}

	@Override
	public T min() {
		T minT = vals[0];
		for (final T t : vals) {
			if (minT.compareTo(t) < 0) {
				minT = t;
			}
		}
		return minT;
	}

	@Override
	public T max() {
		T maxT = vals[0];
		for (final T t : vals) {
			if (maxT.compareTo(t) > 0) {
				maxT = t;
			}
		}
		return maxT;
	}

}
