package EncapsulationConcepts;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setName("Tom");
		e1.setAge(23);
		e1.setSalary(12.33);
		e1.setInfo("Ravi", 24, 23.44);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getInfo());

	}

}
