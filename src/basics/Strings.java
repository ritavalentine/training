package basics;

public class Strings {
	public static void main(String[] args){
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "Lord of the Rings";
		
		if(bookTitle.contains(wordChoice)){
			System.out.println("The book contains: " + wordChoice);
		}
		
		String browser = "chrome";
		if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Rita";
		String lastName = "Valentine";
		String ssn = "012345678";
		
		String firstInitial = firstName.substring(0, 1);
		String lastInitial = lastName.substring(0, 1);
		String lastFour = ssn.substring(5);
		
		System.out.println(firstInitial + " " + lastInitial + " " + lastFour);
	}
}
