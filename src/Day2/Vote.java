package Day2;

import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Age=");
		int age = sc.nextInt();
		
		if (age>18) {
			System.out.println("You can Vote");
		}
		
		else {System.out.println("You can not vote");	
		sc.close();	
		}
	}

}

