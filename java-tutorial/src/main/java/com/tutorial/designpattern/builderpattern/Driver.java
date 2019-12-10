package com.tutorial.designpattern.builderpattern;

public class Driver {

	public static void main(String[] args) {

		Computer computer = new Computer.ComputerBuilder("500gb", "16gb").setBluetoothEnabled(true)
				.setGraphicsEnabled(true).build();

		System.out.println(computer);

	}

}
