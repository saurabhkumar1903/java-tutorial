package com.tutorial.designpattern.factorypattern;

public abstract class Computer {
	public abstract String getRam();
	public abstract String getGraphics(); 
	public abstract String getHdd();
	@Override
	public String toString() {
		return "Computer [ram=" + this.getRam() + ", graphics=" + this.getGraphics()+ ", hdd=" + this.getHdd() + "]";
	}
	
	

}
