package EncapsulationConcepts;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage u1 = new LoginPage("Naveenauto","test@123");
		System.out.println(u1.getUserName());
		System.out.println(u1.getPassword());
		LoginPage u2 = new LoginPage("Shabeer","Shabeer@123");
		System.out.println(u2.getUserName());
		System.out.println(u2.getPassword());
		u2.doLogin(u2.getUserName(),u2.getPassword());
		u2.setPassword("abc@123");
		System.out.println(u2.getUserName());
		System.out.println(u2.getPassword());
		LoginPage u3 = new LoginPage("naveenauto","test123");
		u3.doLogin();
		Browser br = new Browser();
		br.launchBrowser();
		
		
		
		

	}
	

}
