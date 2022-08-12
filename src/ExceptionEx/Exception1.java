package ExceptionEx;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=10/0;
			System.out.println(x);
		}
		catch(ArithmeticException e) {
			System.out.println("Failed");
		}
		finally {
			System.out.println("I always execute");
		}
		
		try {
			int a[]= {1, 2, 3, 4, 5};
			System.out.println(a[7]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//We can use finally without catch block
		try {
			int x=10;
			System.out.println(x);
		}
		finally {
			System.out.println("I always execute");
		}
	}

}
