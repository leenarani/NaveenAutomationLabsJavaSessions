package ExceptionHandling;

public class TryCatchConcept {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			TryCatchConcept obj = new TryCatchConcept();
			obj = null;
			obj.name = "Name";
		} catch (NullPointerException n) {
			System.out.println("NullPointerException thrown");
			n.printStackTrace();

		}

		try {
			// int i=9/4;
			int k[] = new int[2];
			k[4] = 10;
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occured");
			e.printStackTrace();

		}

		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundException occured");
			a.printStackTrace();

		}

//		catch(Throwable e) {
//			System.out.println("Some exception is thrown");
//			e.printStackTrace();
//			
//		}
		System.out.println("Bye");

	}

}
