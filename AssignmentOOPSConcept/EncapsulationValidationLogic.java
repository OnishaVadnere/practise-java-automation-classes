package AssignmentOOPSConcept;
//Create a class Account with private variables accountHolderName and balance.
//Provide setters and getters, where:

//setBalance() should not accept negative values (print a warning).
//Create an object and update values through setters only.

class Account{
	
	private String accountHolderName;
	private double balance;
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	 public void setBalance(double bal) {
	        if (bal < 0) {
	            System.out.println("Warning: Balance cannot be negative!");
	        } else {
	            balance = bal;
	        }
	    }
	  public double getBalance() {
	        return balance;
	    }
	
		
	}
	


public class EncapsulationValidationLogic {

	public static void main(String[] args) {
		
Account obj = new Account();
obj.setAccountHolderName("charlie");
System.out.println(obj.getAccountHolderName());

obj.setBalance(-10);
System.out.println(obj.getBalance());

	}

}
