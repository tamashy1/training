package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		//Instatiating an object
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "Joe@testemail.com";
		person1.phone = "3123231312";
		
		//abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7897894564";
		//Action, activity, behavior;
		System.out.println(name + " is walking");
		walking(name);
	}
	//enhance with functions
	static void walking(String name) {
		System.out.println(name + " is walking");
	}
//What about binding attributes and properties together
}
