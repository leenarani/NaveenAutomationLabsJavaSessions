package ExceptionHandling;

public class FinallyInterviewConcept {
	
	public static int getMarks(String name) {
		int marks=0;
		System.out.println("getting marks for :"+ name);
		if(name.equals("Ram")) {
			try {
			marks=90/2;
			System.exit(1);
			return marks;
			}
			catch(ArithmeticException e) {
				System.out.println("AE is coming");
				return -2;
				
			}
			
			finally {
				System.out.println("finally block executed");
				return -3;
			}
		}
		
		else if(name.equals("Niki")){
			marks=95;
			
		}
		else if(name.equals("sri")) {
			marks =85;
			
		}
		else {
			System.out.println("Student not found");
			return -1;
		}
		
		return marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m= getMarks("Ram");
		System.out.println(m);
		
		

	}

}
