package abstractfactorypattern;

public class ComputerFactory {
	
	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory)
	{
		return abstractComputerFactory.createComputer();
	}

}
