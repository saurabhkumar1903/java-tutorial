package com.tutorial.designpattern.factorypattern;

public class ComputerFactory {
	
	public static Computer getComputer(String type,String ram,String graphics,String hdd)
	{
		if(type.equalsIgnoreCase("PC"))
			return new Pc(ram,graphics,hdd);
		else 
			return new Server(ram,graphics,hdd);
	}

}
