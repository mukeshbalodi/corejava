package Classandobject;

public class Dog {
	int tail=1;
	String colour="black";
	int eyes=2;
	
	public  Dog() {
		System.out.println("Normal Dog");
		}
	
	public Dog(String breed) /// every time we create a new dog method we have to give the breed of the dog 
	{
		System.out.println("The dog breed is =" +breed);
		
	
}
	public void bark () {
		System.out.println("The dog can bark");
	}
	
	
	public void eat() {
		System.out.println("The dog can eat");
	}
	
	public void sleep () {
		System.out.println("The dog can sleep");
	
	}
}

