package oop;

public class BankAccount implements IRate {

		String accountNumber;
		String routingNumber;
		int balance;
		//static makes it so the value belongs to the class not the object instance
		//final makes it a constant 
		private String name;
		private String ssn;
		private String accountType;
	// Constructors : unique methods
		//1.They are used to define /setup / initialize properties of an object
		//2. Constructors are IMPLICITLY called upon instatiation
		//3. the same name as the class itself
		//4. Constructors have NO return type
		BankAccount(){
			System.out.println("New account created");
		}
	// Overloading: call same method name with different arguments
		BankAccount(String accountType){
			System.out.println("NEW ACCOUNT: " + accountType);
	
		}
		BankAccount(String accountType,int balance){
			System.out.println("NEW ACCOUNT: " + accountType);
			System.out.println("Balance is: " + balance);
	
		}
		//getters and setters
	//Allow the user to define the name
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
	//Interface methods
		public void setRate() {
			System.out.println("Setting Rate");
		}
		public void increaseRate() {
			System.out.println("Increasing Rate!");
		}
	public String getSsn() {
			return ssn;
		}
	public void setSsn(String ssn) {
			this.ssn = ssn;
		}
	// Define methods( functions)	
	void deposit() {
		//variables only valid within the block they are defined
		
	}
	void withdraw() {
		
	}
	void checkBalance() {
		
	}
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name +". " +accountNumber + " ]";
	}
}
