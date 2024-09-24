package com.edubridge.myapp1.model;

public class Employee {
	
	private int employee_Id;
	private String employee_Name;
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public double getEmployee_Salary() {
		return employee_Salary;
	}
	public void setEmployee_Salary(double employee_Salary) {
		this.employee_Salary = employee_Salary;
	}
	private double employee_Salary;
}
	