package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	void sleep(){
		System.out.println(name + " is sleeping");
	}
	void eat(){
		System.out.println(name + " is eating");
	}
}


public class Demo {
	public static void main(String[] args){
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "email@domain.com";
		person1.phone = "1234567890";
		person1.walk();
		person1.sleep();
		person1.eat();
		
				//adjectives
		/*String name = "Joe";
		String email = "email@domain.com";
		String phone = "1234567890";
		
		//behaviors
		//System.out.println(name + " is walking");
		walking(name);
	}
	
	static void walking(String name){
		System.out.println(name + " is walking");
	}*/
	
	}
}


