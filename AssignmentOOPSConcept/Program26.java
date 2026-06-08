package AssignmentOOPSConcept;
//  WAP in Java to create a class named school 
//create name, address,strength as their instance variables 
//Create two constructor one with two variables and one with all the three variables 
//Create a method that will display all the three parameters 
//create two object of this class and call the respective methods 

class school11{
	
	String name;
	String address;
	int strength;
	
	
	school11(String n, String a,int s){
		name=n;
		address=a;
		strength=s;
		
	}
	school11(String n1, String a1){
		name=n1;
		address=a1;	
	}

	void display() {
		
	System.out.println(name+" "+address);
		
	}
	
	
}



public class Program26 {

	public static void main(String[] args) {
		
		
		school11 obj = new school11("rr", "hggfgf");
		obj.display();
		
		
		
		

	}

}
