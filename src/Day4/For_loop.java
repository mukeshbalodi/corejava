package Day4;
import java.util.Scanner;
public class For_loop {

	public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	System.out.println("Num=");
	int Num= Sc.nextInt();
	int sum=0;
	for (int i=1;i<=Num;i++)
		sum=sum+i;
	System.out.println("sum = " +sum);	
Sc.close();
	}

}
