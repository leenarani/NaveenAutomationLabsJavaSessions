package JavaSessions;

public class CarType {
 
	String name;
	int price;
	String color;
	static int wheels=4;
	
	static void start() {
		System.out.println("car----- start");
	}
	public void stop() {
		System.out.println("car------ stop");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarType c1= new CarType();
		c1.name= "BMW";
		c1.price = 70;
		c1.color ="Black";
		
		
		CarType c2= new CarType();
		c2.name= "Audi";
		c2.price = 60;
		c2.color ="Red";
		
		
		CarType c3= new CarType();
		c3.name= "Honda";
		c3.price = 20;
		c3.color ="Black";
		//access static variable via className
		System.out.println(CarType.wheels);
		c1.stop();
		// via class name access static member
		CarType.start();

	}

}
