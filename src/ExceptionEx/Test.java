package ExceptionEx;

public class Test {

	public static void validate(int age) throws InvalidAge {
		if(age<18) {
			throw new InvalidAge("Not Valid");
		}
		else {
			System.out.println("Eligible for Voting");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Test.validate(18);
		}
		catch(InvalidAge a) {
			System.out.println(a.getMessage());
		}
	}

}
