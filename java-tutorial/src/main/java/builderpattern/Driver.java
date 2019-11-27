package builderpattern;

import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		Integer a=Integer.valueOf(-108);
		Integer b=Integer.valueOf(-108);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
		List<Integer> lists=Collections.emptyList();
		int a1=1_65;
		System.out.println(a1);
		
		
		
		//------------------------------------------------
		
		Computer computer=new Computer.ComputerBuilder("500gb","16gb")
				.setBluetoothEnabled(true)
				.setGraphicsEnabled(true)
				.build();
		
		
		System.out.println(computer);
		
	
				

	}

}
