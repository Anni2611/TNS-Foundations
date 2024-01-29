package com.tsnif.dayfour;
// demo on is a association
public class Employee {
 
	private String employeeName;
	private int employeeId;
	private String department;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(String employeeName, int employeeId, String department) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", department=" + department
				+ "]";
	}
	
	
}
