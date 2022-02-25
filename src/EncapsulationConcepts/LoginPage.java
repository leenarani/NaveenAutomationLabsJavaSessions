package EncapsulationConcepts;

public class LoginPage {

	private String userName;
	private String password;
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
		
	}
	
	
	public String getPassword() {
		return password;
		
	}
	
	public void setUserName(String UserName) {
		
		this.userName = userName;
		
	}
	public void setPassword(String password) {
		this.password = password;
		
		
	}
	
	public void doLogin(String username, String password) {
		System.out.println("Enter username :"+ username);
		System.out.println("Enter password :"+ password);
		System.out.println("click on login button");
		System.out.println("Login is done.....");
		
		
		
	}
	
	public void doLogin() {
		System.out.println("Enter username :"+ this.userName);
		System.out.println("Enter password :"+ this.password);
		System.out.println("click on login button");
		System.out.println("Login is done.....");
		}
	

}
