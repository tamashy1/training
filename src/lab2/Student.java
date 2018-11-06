package lab2;

public class Student {
	
	private static int staticID = 1000;
	private String emailId;
	private String name;
	private String phone;
	private String city;
	private String state;
	private String ssn;
	private String userID;
	private double balance;
	private String[] courses = new String[6];
	

	Student(String name,String ssn)
	{
		System.out.println("Student entry created :");
		emailId = name + "@gmail.com";
		System.out.println(emailId);
		this.name = name;
		this.ssn = ssn;
		setUserId(name,ssn);
		staticID++;
	}
	private void setUserId(String name,String ssn) {
		
		int random = (int) (Math.random()*10000);
		userID = staticID + "" + random + ssn.substring(5, 9);
	  
	}
	public void enroll()
	{
		
	}
	public void checkBalance()
	{
		System.out.println("Balance: " + balance);
	}
	@Override
	public String toString()
	{
		return "[Name " + name + " ]\n[userID: " + userID + "]\n";  
	}
	public void showCourses()
	{
		
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
	
	
}
