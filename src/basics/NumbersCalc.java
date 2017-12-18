package basics;

public class NumbersCalc {
	public static void main (String[] args){
		System.out.println("Program is starting...");
		printName();
		int a = 10;
		int b = 20;
		addNumbers(a,b);
		int product = multiplyNumbers(a,b);
		System.out.println("The product of numbers: " + a + " and " + b + " is " + multiplyNumbers(a,b));
	}
	static void printName(){
		System.out.println("My name is Rita");
	}
	
	static void addNumbers(int a, int b){
		//this function will add two numbers
		int sum = a + b;
		System.out.println("The sum of numbers: " + a + " and " + b + " is " + sum);
	}
	
	static int multiplyNumbers(int a, int b){
		int product = a * b;
		addNumbers(product,a);
		return product;
	}
	/*
	printName()
	
	addNumbers()
	
	multiplyNumbers()
	*/
}
