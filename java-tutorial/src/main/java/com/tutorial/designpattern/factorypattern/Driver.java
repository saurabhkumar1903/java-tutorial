package com.tutorial.designpattern.factorypattern;

public class Driver {
	
	public static void main(String args[])
	{
		
		Computer pc=ComputerFactory.getComputer("PC", "1", "1", "1");
		System.out.println("-----------PC CONFIGURATION----------");
		System.out.println(pc);
	}

}
