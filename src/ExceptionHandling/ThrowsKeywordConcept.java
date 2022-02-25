package ExceptionHandling;

public class ThrowsKeywordConcept {

	public void m1() throws ArithmeticException {
m2();
	}

	public void m2() throws ArithmeticException {
m3();
	}

	public void m3() throws ArithmeticException {
  int i=9/0;
	}
	public static void main(String[] args) {
		ThrowsKeywordConcept th = new ThrowsKeywordConcept();
		try{
			th.m1();
		}
		catch(ArithmeticException a) {
			System.out.println("ArithmeticException Occurs");
			a.printStackTrace();
		}
		}
		
	}


