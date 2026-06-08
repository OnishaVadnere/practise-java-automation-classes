package AssignmentOOPSConcept;
// Polymorphism (Runtime + Upcasting)
//Create a class Camera with a method capture().
//Create a subclass DSLCamera that overrides the method.
//Use parent reference to call child object method (dynamic polymorphism).

class Camera{
	void capture() {
		System.out.println("camera is ready to capture");
	}
	
}

class DSLCamera extends Camera{
	
	void capture() {
		System.out.println("dclr cam ");
	}
	
}
public class PolymorphismRuntimeandUpcasting {

	public static void main(String[] args) {
		
		Camera ref = new DSLCamera();
		ref.capture();
		
		
		
	}

}
