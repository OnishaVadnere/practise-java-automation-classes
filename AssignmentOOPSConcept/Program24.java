package AssignmentOOPSConcept;
//Create a Class named Shape with length as instance variable  , 
//create three methods as square , rectangle , circle 
//and find out their respective areas 
//Create a object in main method and call these different methods
//with the instance of object 


class Shape{
	
	int length=5;
	
	int  square(int a,int b) {
		
		return a*b;
	} 
	
	int rectangle(int w) {
		
		return length* w;
		
	}
	
	double circle(double r) {
		
		return 3.14*r*r;
	}
	
}


public class Program24 {

	public static void main(String[] args) {
		
		Shape obj = new Shape();
		
		System.out.println(obj.square(10, 10));
		
		System.out.println(obj.circle(5));
		
		System.out.println(obj.rectangle(4));

	}

}
