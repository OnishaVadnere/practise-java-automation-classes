package AssignmentOOPSConcept;
//Static Concepts
//Create a class University with:
//static variable country = "India"
//instance variable universityName
//Print values using different objects to show static effect.


class University{
	
	static String country ="India";
	String universityName;
	
	University(String u){
		
		universityName=u;
	}
	
	  void display(String universityName) {
		
		System.out.println("Country Name is"+country+" "+"universityName is"+" "+universityName);
	
	}
}


public class StaticConcept {

	public static void main(String[] args) {
		
		University obj = new University(null);
		obj.display("indo");
		
		University obj2 = new University("raigad");
		obj.display("raigad");
		
		
			
		
		
	}

}
