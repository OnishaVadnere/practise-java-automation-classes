package AssignmentOOPSConcept;

//WAP in Java 
//Create a class named school ,create name as their instance variables 
//Create a default constructor of this class which will have a print statement to display the name of school 
//Create a method inside the class which will display a message as "This School is based out of Kolkata"
//Create a object under main method and call the constructor and the method 

class school{
	String Name="ABC";
	
	school(){
		
		System.out.println("School name is "+Name);
	}
	
	void msg() {
		System.out.println("This School is based out of Kolkata");
	}
	
}



public class Program25 {

	public static void main(String[] args) {
		school obj = new school();
		obj.msg();
		

	}

}
