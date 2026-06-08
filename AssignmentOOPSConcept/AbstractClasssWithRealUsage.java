package AssignmentOOPSConcept;
//Abstract Class + Real Usage
//Create an abstract class Employee with:
//abstract method: calculateSalary()
//concrete method: employeeDetails()
//Subclass FullTimeEmployee and PartTimeEmployee implementing salary 
//calculation logic differently

abstract class empl{
	 abstract void calculateSalary();
	 
	 void employeeDetails() {
		 
		 System.out.println("employee details are printed");
	 }
}

class FullTimeEmployee extends empl{

	@Override
	void calculateSalary() {
		System.out.println("salary its been credited");
		
	}
	
	void msg() {
		System.out.println("hi");
	}
	
}

class PartTimeEmployee extends empl{

	@Override
	void calculateSalary() {
		System.out.println("salary is not been credited");
		
	}
	void show(){
		System.out.println("hjhjkhj");
	}
	
}


public class AbstractClasssWithRealUsage {

	public static void main(String[] args) {
		
		FullTimeEmployee f = new FullTimeEmployee();
		f.calculateSalary();
		f.employeeDetails();
		f.msg();
		
		PartTimeEmployee p = new PartTimeEmployee();
		p.calculateSalary();
		p.employeeDetails();
		
	}

}
