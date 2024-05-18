package exceptionDemo;

public class main{

	public static void main(String[] args) throws Exception {

		try {
			Vote.voting();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Vote.voting();
		
		Vote.voting();
	}

}