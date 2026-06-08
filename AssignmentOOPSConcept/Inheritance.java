package AssignmentOOPSConcept;
//Create three classes:
//Device â†’ method start()

//Mobile extends Device â†’ method calling()

//SmartPhone extends Mobile â†’ method internet()
//Create object of SmartPhone and call all methods.


class Deviceâ{
	
	void start() {
		System.out.println("hi");
	}
		
}
class mobile extends Deviceâ{
	void internet() {
		System.out.println("hiiiiiiii");
	}
	
}
class smarttphone extends mobile{
	
	void display(){
		System.out.println("jhjhg");
	}
}




public class Inheritance {

	public static void main(String[] args) {
		
		smarttphone obj = new smarttphone();
	obj.internet();
		obj.start();
		obj.display();
	}

}
