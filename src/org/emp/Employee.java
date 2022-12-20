package org.emp;

public class Employee {
	
	private void empId(int id) {
		System.out.println("int "+id );
	}
	private void empId(float id) {
		System.out.println("float"+ id);
	}
	private void empId(long id) {
		System.out.println("long"+ id);
	}
	private void empId(double id) {
		System.out.println("double"+id);
	}
	
	public static void main(String[] args) {
		Employee a = new Employee();
		a.empId(1);
		a.empId(24.655f);
		a.empId(9852655l);
		a.empId(899.856525);
		
	}

}
