package model.entities;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", salary);
	}

	@Override
	public int compareTo(Employee other) {
		//return name.compareTo(other.getName());
		return - salary.compareTo(other.getSalary()); //<---- Maior salario
	}
}
