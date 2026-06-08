package AssignmentOOPSConcept;
//Hierarchical Inheritance
//Create a class Course with a method courseInfo().
//Create subclasses Science, Commerce, and Arts each with their own method.
//Create objects of each and call methods to show hierarchy.

class Course{
	
	void courseInfo() {
		System.out.println("course info ");
	}
}

class Science extends Course{
	
	void info() {
		System.out.println("Science course");
	}
}
class Commerce extends Course{
	
	void info() {
		System.out.println("Commerce course");
	}
}
class arts extends Course{
	
	void info() {
		System.out.println("Arts course");
	}
}



public class HierachicalInheritance {

	public static void main(String[] args) {
		
		arts obj= new arts();
		obj.courseInfo();
		obj.info();

		
		Commerce obj1= new Commerce();
		obj1.courseInfo();
		obj1.info();
		
		Science s = new Science();
		s.courseInfo();
		s.info();
		
		
		Course c = new Course();
		c.courseInfo();
		
		
		
		
	}

}
