package Constructor;

public class Shopping {

	public static void main(String[] args) {
		EcomApp e1 = new EcomApp();
		//use case 1
		e1.login("naveen@gamail.com","test123")
		.search("iMac")
		.addToCart("iMac")
		.doPayment("123 122 222 222",212)
		.generateOrder()
		.sendOrderViaEmail()
		.logOut();
		
		//use case 2
		e1.login()
		.search("nike shoes")
		.logOut();
		
		//use case 3
		e1.login("admin","admin123")
		.logOut();
		
		//use case 4
		e1.login("tom@gmail.com","tom123")
		.search("macbook pro")
		.addToCart("mackbook pro")
		.search("ipad")
		.addToCart("macbook pro")
		.search("apple pencil")
		.doPayment("naveen@hdfc")
		.generateOrder()
		.sendOrderViaEmail()
		.logOut();
		
	}

	
}
