package com.empArray;

public class EmployeeCreation {

	private static int random=1001;
	
	public Employee createEmployee(String name,double salary,double exp,String designation,String compname)
	{
		Employee e=new Employee(random++,name,salary,exp,designation,compname);
		return e;
	}
}
