package Day3;

import java.util.Scanner;
public class ConditionDemo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("arithmetic operator =");
	String opr = sc.next();
	
	System.out.println("Num1 = ");
	int Num1= sc.nextInt();
	
	System.out.println("Num2 = ");
	int Num2= sc.nextInt();
	
	switch (opr) {
	case "+":
		System.out.println("sum=");
		System.out.println(Num1+Num2);
		break;
	case "-":
		System.out.println("sub=");
		System.out.println(Num1-Num2);
		break;
	case "*":
		System.out.println("mul=");
		System.out.println(Num1*Num2);
		break;
	case "/":
		System.out.println(Num1/Num2);
		break;
	case "%":
		System.out.println("");
		System.out.println("mod=");
		System.out.println(Num1%Num2);
		break;
	default:
		System.err.println("invalid operator");
	sc.close();
	
	
		
	}
	}

}
