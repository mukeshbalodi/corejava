package Day4;

public class Nested_For_Loop {

	public static void main(String[] args) {
	for (int i=1;i<=6;i++){
	{for (int j=1;j<=i;j++)
{System.out.print("*");}
	}
System.out.println();
}
}
}


//Result
// *
// * *
// * * *
// * * * *