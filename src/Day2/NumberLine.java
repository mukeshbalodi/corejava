package Day2;

import java.util.Scanner;
public class NumberLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Num=");
		int num = sc.nextInt();
		
		if (num>0) {
			System.out.println("Positive");
		}
		else if (num<0) {
			System.out.println("Positive");	
		}
		else {System.out.println("Zero");	
		sc.close();	
		}
	}

}
