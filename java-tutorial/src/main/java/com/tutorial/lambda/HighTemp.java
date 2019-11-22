package com.tutorial.lambda;

class HighTemp {
	private final int hTemp;

	HighTemp(int ht) {
		hTemp = ht;
	}
	
	boolean sameTemp() {
		return false;
	}

	boolean sameTemp(HighTemp ht2) {

		System.out.println("v1:" + hTemp + "  v2:" + ht2.hTemp);
		return hTemp == ht2.hTemp;
	}

	boolean lessThanTemp(HighTemp ht2) {
		System.out.println("v1:" + hTemp + "  v2:" + ht2.hTemp);
		return hTemp < ht2.hTemp;
	}

	boolean diff(HighTemp ht1, HighTemp ht2) {
		return false;
	}

	boolean lessThanTempNoArg() {
		return false;
	}

	boolean threeArgs(HighTemp highTemp, HighTemp a, String b) {
		return false;

	}
}