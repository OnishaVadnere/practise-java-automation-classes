package AssignmentOOPSConcept;
//Method Overloading
//Create a class Calculator with overloaded methods add():
//add(int a, int b)
//add(double a, double b)
//Call both methods inside the main method and print results.

class Calculator{
	
	
	int add (int a, int b) {
		return a+b;
		}


    double add(double a, double b) {
    	
    	return a+b;
    }
}
public class MethodOverloading {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.add(20, 5));
		
		System.out.println(obj.add(10, 50));
		

	}

}
