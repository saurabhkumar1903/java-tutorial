package com.tutorial.designpattern.adaptarpattern;

public class Driver {

	public static void main(String[] args) {

		AssingmnetWork assingmnetWork = new AssingmnetWork();
		PenAdaptar penAdaptar = new PenAdaptar();
		penAdaptar.setReynoldsPen(new ReynoldsPen());
		assingmnetWork.setPen(penAdaptar);
		assingmnetWork.doAssingment("homework");
	}

}
