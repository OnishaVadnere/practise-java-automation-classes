package AssignmentOOPSConcept;
//Constructor Chaining
//Create a class Mall with:
//Default constructor printing "Welcome to the Mall"
//Parameterized constructor calling default constructor using this()
//Demonstrate constructor chaining in main.

class Mall{
	
	Mall(){
		System.out.println("Welcome to the Mall");
	}
	
	Mall(String name){
		this();
		System.out.println("mall name is "+name);
		
		
	}
}


public class ConstructorChaining {

	public static void main(String[] args) {
	
		Mall obj = new Mall("phoenix");
		

	}

}
