package collectortutorial;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

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
