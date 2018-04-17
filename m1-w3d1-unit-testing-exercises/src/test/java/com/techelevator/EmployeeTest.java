package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	/*
	 * Give an employee a raise
	 * Check Employees information
	 * Check Employees Salary
	 * */
	
	private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;
	private Employee emp;
	@Before
	public void setup() {
		emp = new Employee(123123, "James", "Earl", 40000.00);
	}
	@Test
	public void try_to_retrieve_employees_first_name() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("Employees first name was not set properly", "James", emp.FirstName());
	}
	@Test
	public void try_to_retrieve_employees_last_name() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("Employees last name was not set properly", "Earl", emp.LastName());
	}
	@Test
	public void try_to_retrieve_employees_department() {
		//Arrange
		emp.setDepartment("Sales");
		//Act
		//Assert
		Assert.assertEquals("Employees department was not set properly", "Sales", emp.getDepartment());
	}
	
	@Test
	public void try_to_retrieve_customers_full_name() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("The employees full name was not returned properly", "Earl, James", emp.FullName());
	}
	
	@Test
	public void try_to_retrieve_employees_emp_id() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("The employees ID was not returned properly", 123123, emp.getEmployeeId());
	}
	@Test
	public void try_to_retrieve_employees_salary() {
		//Arrange
		//Act
		//Assert
		Assert.assertTrue("Employees salary was not set properly", 40000.00 == emp.getAnnualSalary());
	}
	@Test
	public void try_to_give_employee_raise() {
		//Arrange
		//Act
		emp.RaiseSalary(10);
		//Assert
		Assert.assertTrue("Employees salary was not set properly", 44000.00 == emp.getAnnualSalary());
	}
	@Test
	public void try_to_reduce_employee_salary() {
		//Arrange
		//Act
		emp.RaiseSalary(-10);
		//Assert
		Assert.assertFalse("Should not be able to reduce an employee's salary", 36000.00 == emp.getAnnualSalary());
	}
	
}
