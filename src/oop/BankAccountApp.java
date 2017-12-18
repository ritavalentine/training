package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating new bank account >> think instantiate an object
		BankAccount acc1 = new BankAccount();
		//Wrong old way to do things. 
		//acc1.name = "Roger Hugh";
		acc1.setName("Roger Hugh");
		System.out.println(acc1.getName());
		acc1.balance = 10000;
		//acc1.accountNumber = "01112122";
		acc1.setSsn("0111121");
		System.out.println(acc1.getSsn());
		acc1.deposit(1500);
	
		
		BankAccount acc2 = new BankAccount("Checking Account");
		BankAccount acc3 = new BankAccount("Saving Account", 1000);
		/*
		acc3.accountNumber = "0123456789";
		acc3.checkBalance();
		System.out.println(acc1.toString());
		
		
		
		//Inheritance demo
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}

}

