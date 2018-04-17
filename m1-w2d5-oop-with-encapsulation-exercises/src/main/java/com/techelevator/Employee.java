package com.techelevator;

public class Employee {
private int employeeId;
private String firstName;
private String lastName;
private String fullName;
private String department;
private double annualSalary;
public int getEmployeeId() {
	return employeeId;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getFirstName() {
	return firstName;
}
public String getFullName() {
	this.fullName = this.lastName + ", " + this.firstName;
	return this.fullName;
}
public double getAnnualSalary() {
	return annualSalary;
}

public void raiseSalary(double percent) {
	this.annualSalary *= (1 + percent / 100);
}

public Employee(int employeeId, String firstName, String lastName, double salary){
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.annualSalary = salary;

}









}
