package AssignmentOOPSConcept;
//Method Overloading (Bank Scenario)
//Create a class LoanCalculator with two overloaded methods:
//calculateLoan(int amount)
//calculateLoan(int amount, double interestRate)
//Print loan details accordingly. Call both methods from main.

class LoanCalculator{
	
	
	int calculateLoan(int amount) {
		return amount;	
		
	}
	
	double calculateLoan(int amount, double interestRate) {
		return interestRate+amount;
		
	}
}

public class MethodOverloadingoops {

	public static void main(String[] args) {
		
		LoanCalculator obj = new LoanCalculator();
		System.out.println(obj.calculateLoan(100));
		System.out.println(obj.calculateLoan(20, 25));

	}

}
