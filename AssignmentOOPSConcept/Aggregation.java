package AssignmentOOPSConcept;
//Aggregation (Has-A Relationship)
//Create a class Engine with a method engineInfo().
//Create a class Car that has-a Engine object and uses it to show engine details.
//Show aggregation in main method.

class Engine{
	
	void engineInfo() {
		System.out.println("Engine info is there");
		
	}
	
}

class car extends Engine{
	
	 Engine e = new Engine(); // has-a relationship

	    void show() {
	        e.engineInfo();
	}
}

public class Aggregation {

	public static void main(String[] args) {
		car obj = new car();
		
		obj.show();

	}

}
