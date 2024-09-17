package Java_Programs.Day4;

public class InvalidAgeExceptionCalled {

	 public static  void  validateAge(int age) throws InvalidAgeException {
			if( age<18) {
				throw new InvalidAgeException("Invalid Age");
			}
			else {
				System.out.println("Valid Age");
			}
		}
	

	public static void main(String[] args) {
	try {
		validateAge(17);
	}
	catch(InvalidAgeException e) {
		System.out.println("caught the exception");
		System.out.println("EXCEPTION OCCURED :" + e.getMessage());
	}
	System.out.println("Rest of the code");	
			

	}

}
