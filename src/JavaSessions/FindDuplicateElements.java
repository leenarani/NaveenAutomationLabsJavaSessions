package JavaSessions;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String infra[] = {"Amazon","GCP","AZURE","Amazon","ALI BABA","SauceLabs","AZURE","GCP"};
		for(int i=0;i<infra.length;i++) {
			for(int j=i+1;j<infra.length;j++) {
				 if(infra[i].equals(infra[j])) {
					 System.out.println(infra[i]);
					 
				 }
				
				
			}
			
		}

	}

}
