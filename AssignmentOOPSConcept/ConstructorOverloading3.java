package AssignmentOOPSConcept;
//Create a class Product having instance variables productId, productName, and price.
//Implement:
//A default constructor that prints "Product Created".
//A parameterized constructor that initializes the product details.
//Write a method displayProduct() to print product details.
//Create both types of objects in the main method.


class CO{
	
	int productId;
	String productName;
	int price;
	
	CO(){
		System.out.println("Product Created");
		
	}
	
	CO(int pid, String pname, int p){
		 productId=pid;
		  productName=pname;
		 price=p;
	}
	
	
	void displayProduct(int productId, String productName, int price ) {
		
		System.out.println(productId+" "+productName+" "+price);
	}
	
}


public class ConstructorOverloading3 {

	public static void main(String[] args) {
	
		CO obj =  new CO();
		obj.displayProduct(1,"hbb",3225);

	}

}
