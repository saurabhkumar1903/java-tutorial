package collectortutorial;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		final Employee john = new Employee("E123", "John Nhoj", 200.99, "IT");
		final Employee south = new Employee("E223", "South Htuos", 299.99, "Sales");
		final Employee reet = new Employee("E133", "Reet Teer", 300.99, "IT");
		final Employee prateema = new Employee("E143", "Prateema Rai", 300.99, "Benefits");
		final Employee yogen = new Employee("E323", "Yogen Rai", 200.99, "Sales");
		final Employee xyz = new Employee("E324", "Yogen Ray", 200.99, "major");
		final List<Employee> employees = Arrays.asList(john, south, reet, prateema, yogen);

		final List<Employee> result = employees.stream().collect(Collectors.toCollection(LinkedList::new));
		result.forEach(System.out::println);
		System.out.println(result.getClass());

		// map to print employee group by department
		final Map<String, String> result2 = employees.stream().collect(
				Collectors.toMap(emp -> emp.getDepartment(), emp -> emp.getEmpId(), (e1, e2) -> e1 + "," + e2));
		System.out.println(result2);

		// Map to print salary spent in a department group by department

		final Map<String, Double> mapOfSalary = employees.stream()
				.collect(Collectors.toMap(emp -> emp.getDepartment(), emp -> emp.getSalary(), (d1, d2) -> d1 + d2));
		System.out.println(mapOfSalary);

		// collect(joining())
		//String joinedDept = null;
		final Map<String, String> dept = employees.stream()
				.collect(Collectors.toMap(e -> "dept", emp -> emp.getDepartment(), (d1, d2) -> d1 + "," + d2));
		System.out.println(dept.get("dept"));
		employees.stream().map(emp -> emp.getDepartment()).collect(Collectors.toCollection(TreeSet::new));

		// summarizing double
		final DoubleSummaryStatistics resultOfSummary = employees.stream()
				.collect(Collectors.summarizingDouble(emp -> emp.getSalary()));
		System.out.println(resultOfSummary);

		// Collectors.maxBy()/minBy()
		final Optional<Employee> e = employees.stream().collect(Collectors.minBy(new EmployeeComparator()));
		e.ifPresent(System.out::println);

		// Collectors.groupingBy()
		final Map<Integer, Set<String>> empDeptLength = employees.stream().map(emp -> emp.getDepartment())
				.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(empDeptLength);
		
		final Map<String,Set<Employee>> map=employees.stream().collect(Collectors.groupingBy(emp->emp.getDepartment(),Collectors.toSet()));
		System.out.println(map);
	
		/*.collect(Collectors.groupingBy(makercheckerData -> new MakerCheckerDTO(makercheckerData.getAuthority(),
		makercheckerData.getAuthorityTypeId(), makercheckerData.getVisibility(),
		makercheckerData.getOrgId(), makercheckerData.getCreatedBy(), makercheckerData.getCreationTs()),
		Collectors.groupingBy(makercheckerData -> makercheckerData.getGroup())))
		//
		 * 
		 */
		System.out.println(sumStream(Arrays.asList(1,2,3,4,5)));
		
	}
	
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).reduce(1, (a,b)->a+b);
	}

}
