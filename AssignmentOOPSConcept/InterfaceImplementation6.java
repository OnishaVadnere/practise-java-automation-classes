package AssignmentOOPSConcept;
//Interface Implementation
//Create an interface Payment with a method makePayment().
//Create two classes UPI and CreditCard implementing this interface and define their own payment messages.
//Call the method through interface reference.



interface payment{
	void makePayment();
	
}


class UPI implements payment{

	
	public void makePayment() {
		System.out.println("UPI payment");
	}
	
	
	
}

class CreditCard implements payment{

	
	public void makePayment() {
		
		System.out.println("Credit card payment");
	}
	
	
}

public class InterfaceImplementation6 {

	public static void main(String[] args) {
		 
	payment ref = new UPI();
	ref.makePayment();
	
	payment ref1 = new CreditCard();
	ref1.makePayment();
	

	}

}
