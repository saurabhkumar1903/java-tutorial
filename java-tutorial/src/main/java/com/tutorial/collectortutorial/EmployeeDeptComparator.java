package com.tutorial.collectortutorial;

import java.util.Comparator;

public class EmployeeDeptComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getDepartment().compareTo(e2.getDepartment()) > 1)
			return 1;
		else if (e1.getDepartment().compareTo(e2.getDepartment()) < 1)
			return -1;
		else
			return 0;
	}

}

class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSalary() < o2.getSalary())
			return -1;
		else if (o1.getSalary() < o2.getSalary())
			return 1;
		else
			return 0;
	}

}
