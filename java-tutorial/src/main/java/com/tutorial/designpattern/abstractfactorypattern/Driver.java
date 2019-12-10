package com.tutorial.designpattern.abstractfactorypattern;

public class Driver {
	public static void main(String args[])
	{
		Computer pc=ComputerFactory.getComputer(new PCFactory("1","2","3"));
		Computer server=ComputerFactory.getComputer(new ServerFactory("4","5","6"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}

}
