package oop;

public class AccountApp {
	public static void main(String args[]){
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		//Polymorphism, changes where we are pointing, creating a variable based on IRate that will point at loan account
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
	}
}
