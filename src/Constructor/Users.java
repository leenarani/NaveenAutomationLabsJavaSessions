package Constructor;

public class Users {
	String name;
	int userID;
	boolean isPrime;
	String city;
	
	public Users(String name,int userID) {
		this.name= name;
		this.userID=userID;
		}
	
	public Users(String name) {
		this.name =name;
	}
	
	public Users(String name,int userID,boolean isPrime,String city) {
		this.name=name;
		this.userID =userID;
		this.isPrime =isPrime;
		this.city =city;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Users u1 = new Users("Tom", 100);
	System.out.println(u1.name);
	System.out.println(u1.userID);
	System.out.println(u1.isPrime);
	System.out.println(u1.city);
	Users u2 = new Users("Naveen");
	Users u3 = new Users("Nikki",200,true,"bangalore");
	System.out.println(u3.name+" "+u3.userID+" "+u3.isPrime+" "+u3.city);
	
	

	}

}
