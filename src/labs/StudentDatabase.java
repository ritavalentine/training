package labs;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Rita Valentine", "123456789");
		Student student2 = new Student("Jim Jones", "987456321");
		Student student3 = new Student("Jason Beck", "147852369");
		Student student4 = new Student("Lacey Montana", "369852147");
		student1.setCity("Los Angeles");
		student1.setState("California");
		student1.setPhone("1231234567");
		student2.setCity("Los Angeles");
		student2.setState("California");
		student2.setPhone("1231234567");
		student3.setCity("Los Angeles");
		student3.setState("California");
		student3.setPhone("1231234567");
		student4.setCity("Los Angeles");
		student4.setState("California");
		student4.setPhone("7894561236");
		//student1.enroll();
		//student1.pay();
		//student1.showCourses();
		//student1.checkBalance();
		student1.enroll("Math 151");
		student1.enroll("English 101");
		student1.showCourses();
		student1.checkBalance();
		student1.pay(350);
		student1.checkBalance();
	}

}

class Student{
	private String name;
	private String SSN;
	private String emailId;
	private static int ID = 0;
	private String phone;
	private String city;
	private String state;
	private String userId;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	
	public Student(String name, String SSN){
		ID++;
		this.SSN=SSN;
		this.name = name;
		System.out.println("New Student Name: " + name);
		setEmailId();
		setUserId();

		
	}
	private void setUserId(){
		int max = 9000;
		int min = 1000;
		int random = (int)((Math.random() * (max - min)));
		random += min;
		userId = ID + "" + random + "" + SSN.substring(5);
		System.out.println("New UserID: " + userId);
	}
	private void setEmailId(){
		emailId = name.replaceAll(" ", ".");
		System.out.println("Your new email id is: " + emailId);
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void checkBalance(){
		System.out.println("Balance: " + balance);
	}
	public void enroll(String course){
		this.courses += "\n" + course;
		balance += costOfCourse;
	}
	public void pay(int amount){
		balance -= amount;
		System.out.println("Payment: " + amount + ". Amount remaining: " + balance);
	}
	public void showCourses(){
		System.out.println("You are enrolled in: " + courses);
	}
	@Override
	public String toString(){
		return "[Name: " + name + "]\n[Email Id: " + emailId + "]\n[User Id: " + userId + "]\n[City and State: " + city + ", " + state + "]";
	}
	
	
}
