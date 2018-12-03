package nxy;

public class Employee extends Person {

	private double salary;
	public Employee() {
		super();
		this.salary = 0.0f;
	}
	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String getDescript() {
		return "I am an Employee";
	}
}
