package com.tutorial.designpattern.abstractfactorypattern;

public class PC extends Computer {
	
	private String ram;
	private String cpu;
	private String graphics;

	public PC(String ram, String cpu, String graphics) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.graphics = graphics;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public String getGraphics() {
		// TODO Auto-generated method stub
		return this.graphics;
	}

	@Override
	public String toString() {
		return "PC [ram=" + this.ram + ", cpu=" + this.cpu + ", graphics=" + this.graphics + "]";
	}
	
	

}
