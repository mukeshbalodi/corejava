package Classandobject;

public class Carmain {
	public static void main(String[]args) {
		Car ce= new Car ();
		
		ce.run();
		ce.brakes();
		ce.acclerator();
		System.out.println(" price= " +ce.price);
		System.out.println(" colour " +ce.colour);
		
		System.out.println(" ");
		
		Car cf = new Car (" new car 1");
		
		cf.run();
		cf.brakes();
		cf.acclerator();
		
		System.out.println("price="+cf.price);
		System.out.println(" colour="+cf.colour);
		
		
	}

}
