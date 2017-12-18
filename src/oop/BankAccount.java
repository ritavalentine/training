package oop;

public class BankAccount implements IRate {
	//Variables
	String accountNumber;
	private static final String routingNumber = "0123456";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructors - unique methods, used to define or set up or initialize properties of an object 
	//constructors are implicitly called upon instantiation
	//Same name as class
	//no return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading, call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW " + accountType +" ACCOUNT CREATED");
	}
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW " + accountType +" ACCOUNT CREATED");
		System.out.println("Initial deposit of: " + initDeposit);
		String Msg = null;
		if(initDeposit < 1000){
			 Msg = "ERROR: Minimum desposit is $1,000";
			System.out.println(Msg);
		}else{
			 Msg = "Thanks for your initial deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	//Getters/setters
	//Allow the user to define the name
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//Interface methods
	
	public void setRate(){
		System.out.println("Setting Rate");
	}
	public void increaseRate(){
		System.out.println("Increasing Rate");
	}
	
	
	
	//Methods
	void deposit(double amount){
		balance += amount;
		showActivity("DEPOSIT");
	}
	void withdraw(double amount){
		balance -= amount;
		showActivity("WITHDRAW");
	}
	private void showActivity(String activity){
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	void checkBalance(){
		System.out.println("Balance: $" + balance);
	}
	void getStatus(){
		
	}
	@Override
	public String toString(){
		return "[ NAME: " + name + ", ACCOUNT#: " + accountNumber + ". ROUTING #:" + routingNumber + " Balance: $" + balance + "]";
	}
	
}
