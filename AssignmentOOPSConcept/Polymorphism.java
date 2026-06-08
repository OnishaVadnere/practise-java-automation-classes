package AssignmentOOPSConcept;
//(Dynamic Binding)
//Create a parent class Shape with a method area().
//Create subclasses Rectangle and Circle and override the area() method.
//Create a reference of Shape and assign objects of both subclasses one by one, calling area() each time.

class shape{
	
	
	void area() {
		System.out.println(" area is going to be found");
	}
}


class Rectangle extends shape{
	
	void area () {
		System.out.println("rect is found");
	}
}

class Circle extends shape{
	
	void area () {
		System.out.println("circle is found");
	}
}




public class Polymorphism {

	public static void main(String[] args) {
		 shape ref = new Circle();
		 ref.area();
		 
		 
		 shape ref1 = new Rectangle();
		 ref1.area();
		 
		 

	}

}
