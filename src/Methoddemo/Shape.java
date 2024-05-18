package Methoddemo;
import java.util.Scanner;
public class Shape {
	public static void rectangle() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("length=");
		int length=Sc.nextInt();
		System.out.println("Breadth=");
		int Breadth=Sc.nextInt();
		int area= length*Breadth;
		System.out.println("The area of rectangle=" +area);
		
	}
	public static void square()
	
	{
		Scanner Sc = new Scanner (System.in);
		System.out.println("side=");
		int side= Sc.nextInt();
		int area= side*side;
		System.out.println("area=" +area);
		
		}
	public static void main(String[]args)
	{
		square ();
		rectangle();
	
		
		
	}


}

