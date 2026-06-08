package AssignmentOOPSConcept;
//Interface with Multiple Implementations
//Create an interface Transport with method booking().
//Implement it in Bus and Flight classes.
//Call using interface reference.

interface Transport{
	
	void booking();
	
}

class Bus implements Transport{

	@Override
	public void booking() {
		System.out.println("Welcome to the bus booking");
		
	}
		
} 
class flight implements Transport{

	@Override
	public void booking() {
		System.out.println("welcome to the flight booking");
		
	}
	
}


public class InterfaceWithMultipleImplementation {

	public static void main(String[] args) {
		Transport ref = new Bus();
		ref.booking();
		
		Transport ref1 = new flight();
		ref1.booking();
		

	}

}
