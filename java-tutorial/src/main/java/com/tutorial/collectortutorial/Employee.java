package com.tutorial.collectortutorial;

class Employee {
	private String empId;
	private String name;
	private Double salary;
	private String department;

	public Employee(String empId, String name, Double salary, String department) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	System.out.println("hash code called");
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals called");
		boolean k;
		if(this.hashCode()==obj.hashCode())
			k= true;
		else 
			k= false;
		if (this == obj)
			k= true;
		if (obj == null)
			k= false;
		if (getClass() != obj.getClass())
			k= false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				k= false;
		} else if (!department.equals(other.department))
			k= false;
		if (empId == null) {
			if (other.empId != null)
				k= false;
		} else if (!empId.equals(other.empId))
			k= false;
		if (name == null) {
			if (other.name != null)
				k= false;
		} else if (!name.equals(other.name))
			k= false;
		if (salary == null) {
			if (other.salary != null)
				k= false;
		} else if (!salary.equals(other.salary))
			k= false;
		k= true;
		return k;
	}
	
	public static void main(String[] args) {
//		
//		if(new Employee("1", "raj", 100d, "d1")==(new Employee("1", "raj", 100d, "d1"))  )
//			System.out.println("true");
//		else
//			System.out.println("false");
		
			//System.out.println(new Employee("1", "raj", 100d, "d1").hashCode());
			//System.out.println(new Employee("1", "raj", 100d, "d1").hashCode());
		
		String s="x";
		Employee emp=new Employee();
		
		//s=s.intern();
		Object obj=new Object();
		Object obj2=new Object();
		
		System.out.println(obj.equals(obj2));
		System.out.println(obj==obj2);
		
		
		String s1= "x";
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
	}
	
	
}