package AssignmentOOPSConcept;

//WAP in Java
//Create a class named Employee with private instance variables empId, empName, and salary.
//Provide public getters and setters for all variables.
//Create a method displayDetails() to print employee details.
//Create an object in the main method and assign values using setters then display them.


class Employee{
	
	private int empId;
	private String empname;
	private double salary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 void displayDetails() {
		
		System.out.println("Employee details are" +empId+ " "+empname+" "+salary);
	}
	
	
}




public class EncapsulationGetterSetter {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setEmpId(7);
		obj.setEmpname("vaibhav");
		obj.setSalary(30000);
		
		obj.displayDetails();

	}

}
