package homework;

class Employee { 
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSalary(salary);
		
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public boolean setFirstName(String firstName) {
		if (firstName.equals("")) {
			this.firstName = "[Empty]";
			//return true;
		} else {
			this.firstName = firstName;
			return true;
		}
		return false;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public boolean setLastName(String lastName) {
		if (lastName == "") {
			this.lastName = "[Empty]";
			//return true;
		} else {
			this.lastName = lastName;
			return true;
		}
		return false;
	}
	public double getSalary() {
		return this.salary;
	}
	
	public boolean setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
			return true;
		}
		//this.salary = 0;
		return false;
	}
	
	public boolean equals(Employee others) {
		return this.firstName == others.firstName && this.lastName == others.lastName
				&& this.salary == others.salary;
	}
	
	public String toString() {
		return "Person's firstname : " + this.firstName +", lastname is :" 
					+ this.lastName+ ", salary is "
					+ this.salary;
	}
}



public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("","Lee", -3000);
		Employee e2 = new Employee("Marry", "Smith", 3200);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
	}
}
