package com.tutorial.ds;

public class CustomStack implements Comparable<CustomStack> {

	private int value;

	@Override
	public int compareTo(CustomStack o) {
		if (this.value < o.value) {
			return +1;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final CustomStack other = (CustomStack) obj;
		if (value != other.value) {
			return false;
		}
		return true;
	}

}
