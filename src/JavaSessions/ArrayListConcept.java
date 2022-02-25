package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		ar.add("tom");
		ar.add('m');
		ar.add(300);
		System.out.println(ar.size());
		ArrayList ar1 = new ArrayList(20);
		ArrayList ar2 = new ArrayList(5);
		ar2.add(100);
		ar2.add(100);
		ar2.add(null);
		System.out.println(ar2.get(1));
		System.out.println(ar2.get(2));
		ar2.add(3,200);
		System.out.println(ar2.get(3));
		
		ArrayList prod = new ArrayList();
		prod.add('A');
		prod.add('B');
		prod.add('C');
		prod.add('D');
		prod.add('E');
		System.out.println(prod);
		

	}

}
