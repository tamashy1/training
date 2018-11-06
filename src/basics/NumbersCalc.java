package basics;

public class NumbersCalc {
	public static void main(String[] Args){
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA,numB);
		System.out.println("The product of a and b is: " + multiplyNumbers(numA,numB));
	}
	
	
	static void printName() {
		System.out.println("My name is Tim");
	}
	static void addNumbers(int numberA,int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int x, int y){
		int product = x * y;
		addNumbers(product + 50,product);
		return product;
	}
	
}
