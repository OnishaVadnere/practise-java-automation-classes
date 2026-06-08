package AssignmentOOPSConcept;
//Create a class Bank with a final variable IFSC and final method showIFSC().
//Try creating a subclass HDFCBank and attempt overriding the final method (should show compile-time restriction).
//Create a main method to demonstrate usage



class Bank {


 final String IFSC = "HDFC0001234";

 final void showIFSC() {
     System.out.println("IFSC Code: " + IFSC);
 }
}


class HDFCBank extends Bank {

 

 //void showIFSC() {
    /// System.out.println("New IFSC Code");
 //}
 //
}

//Main class
public class Main {
 public static void main(String[] args) {

     // Create object of subclass
     HDFCBank bank = new HDFCBank();

     // Call final method
     bank.showIFSC();

     // Access final variable
     System.out.println("Bank IFSC: " + bank.IFSC);
 }
}