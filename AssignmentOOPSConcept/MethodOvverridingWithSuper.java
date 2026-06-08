package AssignmentOOPSConcept;
//Method Overriding with super
//Create a base class Hospital with a method emergencyService().
//Create a subclass CityHospital that overrides the method and calls parent method using super.emergencyService().
//Demonstrate overriding in main.

class Hospital{
	
	void emergencyService() {
		System.out.println("emergency service is available");
	}
	
}

class CityHospital extends Hospital{
	
	void emergencyService() {
		super.emergencyService();
		System.out.println("Service is available");
	}
	
}

public class MethodOvverridingWithSuper {

	public static void main(String[] args) {
		
		CityHospital obj = new CityHospital();
		obj.emergencyService();

	}

}
