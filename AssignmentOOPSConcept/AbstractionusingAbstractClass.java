package AssignmentOOPSConcept;
//Create an abstract class Animal with an abstract method sound().
//Create two subclasses Dog and Cat and provide implementation for sound() method.
//Create objects and call sound() for each.

abstract class animal{
	
	  void sound() {
		 System.out.println("hello");
	 }
}

class dog extends animal{
	
	void sound() {
		super.sound();
		System.out.println("hii");
	}
}

class cat extends  animal{
	
	void sound() {
		super.sound();
		System.out.println("oni");
	}
}





public class AbstractionusingAbstractClass {

	public static void main(String[] args) {
		

		dog obj = new dog();
		obj.sound();
		
		cat obj1 = new cat();
		obj1.sound();
	}

}
