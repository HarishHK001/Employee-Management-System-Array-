package com.empArray;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("----------------------");
		
		
		EmployeeCreation ec=new EmployeeCreation();
		Employee e1=ec.createEmployee("Ramesh", 50000.0, 3, "SSE", "Jspiders");
		Employee e2=ec.createEmployee("Sures", 25000.0, 2, "SE", "Jspiders");
		Employee e3=ec.createEmployee("Ramesh", 30000.0, 2.5, "SE", "Jspiders");
		Employee e4=ec.createEmployee("Ramesh", 40000.0, 3, "SSE", "Jspiders");
		Employee e5=ec.createEmployee("Ramesh", 20000.0, 1, "ASE", "Jspiders");
		
		//Create employee database of capacity 10
		EmployeeDB eDB=new EmployeeDB(10);
		
		
		//Storing  employee in database
		eDB.addEmployee(e1);
		eDB.addEmployee(e2);
		eDB.addEmployee(e3);
		eDB.addEmployee(e4);
		eDB.addEmployee(e5);
		
		System.out.println("\nTotal Employee :"+eDB.getEmployeeCount());
		
		eDB.viewFullDatabase();
		
		System.out.println();
		
		Employee e=eDB.searchEmployee(1005);
		System.out.println(e.getId()+" "+e.getName());
		
		eDB.updateSalary(1003, 5000.0);
		
		eDB.viewFullDatabase();
		
		eDB.viewFullDatabase();
		
		System.out.println("Total Employee "+eDB.getEmployeeCount());
		
		
		System.out.println("----------------");
	}

}
