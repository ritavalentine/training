package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("12345679", 1000.50);
		BankAccount acc2 = new BankAccount("789456123", 1500);
		BankAccount acc3 = new BankAccount("412365879", 2500);
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}


class BankAccount implements IInterest{
	//Properties of bank accounts
	private String accountNumber;        //combo of id plus a random 2 digit number plus the first 2 digits of ssn
	private static final String routingNumber = "00564221";
	private String name;
	private String SSN;
	private double balance;
	private static int id = 1000;        //internal id
	
	//Constructors
	public BankAccount(String SSN, double initDeposit){
		this.SSN = SSN;
		id++;
		setAccountNumber();
		balance = initDeposit;
		
	}
	private void setAccountNumber(){
		int random = (int)(Math.random() * 100);
		accountNumber = id + "" + random + "" + SSN.substring(0,2);
		System.out.println("Your account number: " + accountNumber);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void payBill(double amount){
		balance -= amount;
		System.out.println("Paying bill for amount: $" + amount);
		showBalance();
	}
	public void makeDeposit(double amount){
		balance+=amount;
		System.out.println("Making deposit for amount of: $" + amount);
		showBalance();
	}
	public void showBalance(){
		System.out.println("Balance: " + balance);
	}
	@Override
	public void accrue() {
		balance *= (1 + rate/100);
		showBalance();	
	}
	@Override
	public String toString(){
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
	}
	
}
