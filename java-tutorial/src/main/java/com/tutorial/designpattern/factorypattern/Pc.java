package com.tutorial.designpattern.factorypattern;

public class Pc extends Computer {
	private String ram;
	private String graphics;
	private String hdd;

	public Pc(String ram, String graphics, String hdd) {

		this.ram = ram;
		this.graphics = graphics;
		this.hdd = hdd;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getGraphics() {
		// TODO Auto-generated method stub
		return this.graphics;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return this.hdd;
	}
}
