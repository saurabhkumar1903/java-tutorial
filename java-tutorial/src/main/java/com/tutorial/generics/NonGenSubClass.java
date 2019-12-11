package com.tutorial.generics;

public class NonGenSubClass<T extends Number, V> extends Generic<T> {
	private final T[] ts;

	private final V v;

	public NonGenSubClass(T[] ts, V v) {
		super(ts);
		this.ts = ts;
		this.v = v;
	}

	void display() {
		for (final T t : ts) {
			System.out.print(t);
		}
		System.out.println(v);

	}

}
