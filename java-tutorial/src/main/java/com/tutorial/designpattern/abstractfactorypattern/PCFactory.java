package com.tutorial.designpattern.abstractfactorypattern;

public class PCFactory implements AbstractComputerFactory{

	
	private String ram;
	private String cpu;
	private String graphics;
	
	public PCFactory(String ram, String cpu, String graphics) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.graphics = graphics;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGraphics() {
		return graphics;
	}

	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram,cpu,graphics);
	}

	

}
