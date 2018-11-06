package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instatiate an object
		//With encapsulation : public API methods
		//Encapsulation hides data
		BankAccount acc1 = new BankAccount();
		acc1.setName("Roger Hue");
		acc1.setSsn("2313123");
		System.out.println("SSN: " + acc1.getSsn());
		System.out.println(acc1.getName());
		acc1.setRate();
		acc1.increaseRate();
		// polymorphism through overriding
		System.out.println(acc1.toString());
		//polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
	}

}
