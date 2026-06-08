package AssignmentOOPSConcept;

//Use of super keyword
//Create a class Person with a constructor that prints "Person Created".
//Create a subclass Student that calls the parent constructor using super() and prints "Student Created".
//Create an object and observe the order of execution.


class person{
	
	person(){
		System.out.println("Person Created");
	}
}
class Student extends person{
	
	Student(){
		super();
	System.out.println("student created");
	}
}




public class UseOfSuperKeyword7 {

	public static void main(String[] args) {
		
		Student obj = new Student();
		

	}

}
