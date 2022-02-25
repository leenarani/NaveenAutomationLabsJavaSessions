package ExceptionHandling;

public class FinallyBlockConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('A');
		try {
			int i=9/0;
		
		}
//		catch(ArithmeticException e) {
//			System.out.println("AE is occuring");
//			e.printStackTrace();
//		}
//		
		finally{
			System.out.println("finally block");
			
		}

	}

}
