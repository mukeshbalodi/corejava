package Classandobject;

public class Car {

	String colour = "black";
	int price= 400000;
	
	public Car() {
		System.out.println("model= S002 ");
		
	}
	public Car (String model ) {
		System.out.println("Model " +model);
	}
	public void run () {
		System.out.println("car can run at 120 kmph");
	}
	public void brakes() {
		System.out.println("car has 5 brakes");
	}
	public void acclerator() {
		System.out.println("car has acclerator");
	}

}
