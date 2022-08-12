package ExceptionEx;

public class ThrowsEx {
	public int divide(int x, int y) throws ArithmeticException {
		return x/y;
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		ThrowsEx t=new ThrowsEx();
		System.out.println(t.divide(3, 0));
	}

}
