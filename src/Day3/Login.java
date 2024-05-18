package Day3;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		
Scanner Sc= new Scanner(System.in);
System.out.println("Username=");
String username = Sc.next();
System.out.println("pin=");
int pin = Sc.nextInt();

if (username.equals("shivam")&& pin== 1234) 
{
	System.out.println("welcome to home page");
	}
else if (username.equals("suyash")&& pin==1634)
{
	System.out.println("welcome to home page");
}
else if (username.equals("nupur")&& pin==1634)
{
	System.out.println("welcome to home page");
}
else if (username.equals("rupesh")&& pin==7890)
{
	System.out.println("welcome to home page");
}
else if (username.equals("saurabh")&& pin==7890)
{
	System.out.println("welcome to home page");
}
else {
	System.err.println("invalid credentials");
	}
Sc.close();
	}
	
}
