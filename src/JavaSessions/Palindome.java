package JavaSessions;

public class Palindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =123;
		int rev =0;
		int temp =num;
		while(temp!=0) {
			rev = rev*10+temp%10;
			temp=temp/10;
			
			
		}
		
		if(num==rev) {
			System.out.println("num is palindome");
			
		}
		
		else {
			System.out.println("Num is not pallindrome");
		}

	}

}
