package ExceptionHandling;

public class ThrowKeywordConcept {
	
	public void getData() {
		String data = null;
		if(data==null) {
			System.out.println("data is null...........");
		
			try {
			throw new Exception("data is not found exception");
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowKeywordConcept th = new ThrowKeywordConcept();
		th.getClass();

	}

}
