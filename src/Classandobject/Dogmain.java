package Classandobject;

public class Dogmain {

	public static void main(String[] args) {
		
		Dog dd= new Dog();
		dd.bark();
		dd.eat();
		dd.sleep();
		System.out.println(dd.tail);
		System.out.println(dd.colour);
		System.out.println(dd.eyes);
		
		System.out.println(" ");
		Dog de=new Dog("German shefard");
		de.bark();
		de.eat();
		de.sleep();
		
		System.out.println(de.tail);
		System.out.println(de.colour);
		System.out.println(de.eyes);
		
		System.out.println(" ");
		
		Dog df=new Dog("Pug");
		df.bark();
		df.eat();
		df.sleep();
		
		System.out.println("The dog has tail=" +df.tail);
		System.out.println(" The dog colour is " +df.colour);
		System.out.println(" The dog has eyes="+df.eyes);
		
	}

}
