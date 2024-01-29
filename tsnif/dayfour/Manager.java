package com.tsnif.dayfour;

public class Manager extends Employee {
    
	private int teamSize;

	public Manager(String employeeName, int employeeId, String department, int teamSize) {
		super(employeeName, employeeId, department);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getTeamSize()=" + getTeamSize() + ", getEmployeeName()="
				+ getEmployeeName() + ", getEmployeeId()=" + getEmployeeId() + ", getDepartment()=" + getDepartment()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
