package exceptionDemo;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner Sc= new Scanner (System.in);
		System.out.println("Num=");
		int Num= Sc.nextInt();
		System.out.println("Num1=");
		int Num1= Sc.nextInt();
		try {
			int div= Num/Num1;
			System.out.println("Division="+div);
		}  catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();}
		finally {Sc.close();
	
			
		}
		System.out.println("The Compilation is continue.....");
		
		
			
		

	}

}
