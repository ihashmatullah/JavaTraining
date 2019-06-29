package labs;

public class StudentDatabase {
	
	public static void main(String[] args) {
		StudentData student1 = new StudentData("Ahmad", "123456789", 1000.50);
		StudentData student2 = new StudentData("Mahmood", "987654321", 2000);
		
		student1.setPhone(2101234567);
		System.out.println(student1.getPhone());
		student1.setAddress("San Antonio", "TX");
		System.out.println(student1.getAddress());
		student1.pay(100);
		student1.showCourses();
		student1.enroll();
		System.out.println(student1.toString());
		
	}
}

class StudentData {
	// Properties of Student
	private String name;
	private String SSN;
	private static int iD = 1000;
	private String userID; // iD + random 4-digit number + first last 4 of SSN
	private String emailID;
	private int phone;
	private String city;
	private String state;
	private double balance;
	private String[ ] courses = new String[] {"Biology", "Chemistry", "Math", "Physics", "History"};
	
	// Constructor
	public StudentData(String name, String SSN, double initDeposit) {
		this.SSN = SSN;
		this.name = name;
		balance = initDeposit;
		iD++;
		setUserID();
		setEmailId();
	}
	
	private void setUserID() {
		int random = (int) (Math.random() * 9000 + 1000);
		userID = iD + "" + random + SSN.substring(SSN.length() - 4);
		System.out.println("Your User ID: " + userID);
	}
	private void setEmailId() {
		String emailUnderScore = "@company.com";
		emailID = name.toLowerCase() + emailUnderScore;
		
		System.out.println("Your Email ID: " + emailID);
	}
	
	//setters and getters for phone
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getPhone() {
		return phone;
	}
	
	//setter and getters for Address
	public void setAddress(String city, String state) {
		this.city = city;
		this.state = state;
	}
	public String getAddress() {
		return city + ", " + state;
	}
	
	public void enroll() {
		System.out.println("You have been enrolled.");
	}
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		checkBalance();
	}
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	public void showCourses() {
		for(int i = 0; i < courses.length; i++) {
			System.out.println( i + ". "+ courses[i]);
		}
	}
	public String toString() {
		return "[Name: " + name + " ]\n[User ID: " + userID + "]\n" +
				"[Email ID: " + emailID + "]\n" + "[Phone: " + phone + "]\n" +
				"[City: " + city + "]\n" + "[State: " + state + "]\n" +
				"[Balance: " + balance + "]\n";
	}
}