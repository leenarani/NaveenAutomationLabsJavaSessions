package Constructor;

public class Employee {
	
	String name;
	int age;
	String empID;
	String dept;
	
	
	public Employee(){
		System.out.println("Default const.....");
	}
	

	public Employee(int i){
		System.out.println("1 param const.....");
	}
	

	public Employee(int i, String j){
		System.out.println("2 param const.....");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(20,"test");
		Employee e3 = new Employee();
		
		

	}

}
