package JavaSessions;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void printDuplicateCharacters(String str) {
		if(str==null) {
			System.out.println("Null String");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("Null String");
			return;
		}
		if(str.length()==1) {
			System.out.println("single character");
			return;
		}
		
		char words[] = str.toCharArray();
		
		
		
	}

}
