package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Setting Rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increasing Rate");
		
	}
	public void setTerm(int term){
		System.out.println("Setting the term to: " + term + " years");
	}
	public void setAmmortSchedule(){
		System.out.println("Ammortization schedule");
	}
}
