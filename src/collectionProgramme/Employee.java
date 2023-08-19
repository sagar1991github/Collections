package collectionProgramme;

public class Employee {

	private int salary;
	private String name;
	private String department;
	
	
	public Employee() {
		
	}
	public Employee (int salary,String name,String department) {
		super();
		this.salary=salary;
		this.name=name;
		this.department=department;
		
	}	
	public int getsalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment() {
		this.department=department;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", department=" + department + "]";
	}
	
}