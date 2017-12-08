package com.springboot.bean;

public class Employee {
	
	private int empId;
	private String employeeName;
	private String employeeProject;
	
	
	public Employee(int empID,String empName,String empProject){
		this.empId=empID;
		this.employeeName=empName;
		this.employeeProject = empProject;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeProject() {
		return employeeProject;
	}
	public void setEmployeeProject(String employeeProject) {
		this.employeeProject = employeeProject;
	}

}
