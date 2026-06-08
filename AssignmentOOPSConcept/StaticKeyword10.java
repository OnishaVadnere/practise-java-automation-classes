package AssignmentOOPSConcept;
//Create a class Student having static variable collegeName and instance variables name and rollNo.
//Write a method to print both static and instance data.
//Create multiple objects to show static value remains constant.
class Stu11{
	
	static String collegeName= "SST";
	String Name;
	int rollno;
	
	  Stu11(String n,int r){
		  Name=n;
		  rollno=r;
		  
	  }
	  
	  void display() {
		  System.out.println("name is "+Name+"  "+"roll no is"+rollno+" "+collegeName);
	  }
	}
	





public class StaticKeyword10 {

	public static void main(String[] args) {
		
		Stu11 obj = new Stu11("rani", 10);
		Stu11 obj2= new Stu11("radha", 20);
		obj.display();
		obj2.display();
		
		

	}

}
