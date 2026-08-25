package HomeWork;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {

	// Init Data
	private String Name;
	private double Salary;
	

	// Setter & Getter
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	

	
	// Override ToString
	
	@Override
	public String toString() {
		return "| Name = " + Name + " , Salary = " + Salary + "| " ;
	}

	public Employee(String Name , double Salary) {
		this.Name = Name;
		this.Salary = Salary;
	}
}
