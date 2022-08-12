package ExceptionEx;

public class ThrowEx {
	public static void divide(int x, int y) {
		System.out.println(x/y);
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowEx.divide(3, 0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
