package Constructor;

public class EcomApp {
	
	public EcomApp login() {
		System.out.println("login to app");
		//here this return the currect class object
		return this;
	}
	
public EcomApp login(String un,String pwd) {
		System.out.println("login to app:"+un+":"+pwd);
		return this;
	}

public EcomApp search(String productName) {
	System.out.println("Search Product");
	return this;
}


public EcomApp search(String productName,int price) {
	System.out.println("Search Product:"+ productName+ ":"+price);
	return this;
	
}

public EcomApp clickOnProduct(String productName) {
System.out.println("clickOnProduct:"+productName); 
return this;
	
} 

public EcomApp addToCart(String productName) {
	System.out.println("addToCart:--> product"+productName); 
	return this;
}

public EcomApp doPayment(String cc,int cvv) {
	System.out.println("doPayment"+cc+":"+cvv);
	return this;
}

public EcomApp doPayment(String cc,int cvv,int otp) {
	System.out.println("doPayment"+cc+":"+cvv+":"+otp);
	return this;
}


public EcomApp doPayment(String cc) {
	System.out.println("doPayment"+cc);
	return this;
}
	
public EcomApp generateOrder() {
	System.out.println("Order id id"+12345);
	return this;
}
public EcomApp sendOrderViaEmail() {
	System.out.println("sendOrderViaEmail");
	return this;
	
}

public EcomApp logOut() {
	System.out.println("logOut");
	return this;
}

}
