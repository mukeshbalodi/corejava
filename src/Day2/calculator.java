package Day2;

import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a=");
		int a = sc.nextInt();		
		
		System.out.println("b=");
		int b= sc.nextInt();
		int sum= a+b;
		System.out.println("sum=" + sum);
		
		
		int sub= a-b ;
		System.out.println("subtraction=" +sub);
		
		int mult = a*b;
		System.out.println("Multiplication=" +mult);
		
		float div= a/b ;
		System.out.println("division=" +div);
sc.close();
	}

}
