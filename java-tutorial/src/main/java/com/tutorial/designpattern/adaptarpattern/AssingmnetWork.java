package com.tutorial.designpattern.adaptarpattern;

public class AssingmnetWork {

	private Pen pen;

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void doAssingment(String str) {
		pen.write(str);
	}

}
