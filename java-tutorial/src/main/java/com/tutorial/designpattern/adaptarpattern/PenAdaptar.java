package com.tutorial.designpattern.adaptarpattern;

public class PenAdaptar implements Pen {

	private ReynoldsPen reynoldsPen;

	public void setReynoldsPen(ReynoldsPen reynoldsPen) {
		this.reynoldsPen = reynoldsPen;
	}

	@Override
	public void write(String str) {

		reynoldsPen.scribble(str);

	}

}
