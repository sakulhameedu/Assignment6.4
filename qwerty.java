
public class qwerty extends Exception {  //Exception Handeling 
	String s1;
	int age;

	// constuctor
	qwerty(String s) {

		s1 = s;
	}
	// method to pritn string and return negative age exception

	public String toString() {
		return ("negative age exeption " + s1);

	}

	// creating a method for validating age
	public void ageLImit(int age) {
		// try block
		try {
			if (age > 0) {

				System.out.println("\n");

				throw new qwerty("\n your entered age is " + age);

			}

			else
			// throw exception when age is less than 0
			{

				throw new qwerty("\nyou have entered age in negative  " + age);
			} 

		}
		// catching excepton
		catch (qwerty ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		// object of qwerty class
		qwerty obj = new qwerty("Age");
		obj.ageLImit(-1);
		obj.ageLImit(5);
		obj.ageLImit(789);
	}
}

---------------------------------
Sample Output:
negative age exeption 
you have entered age in negative  -1


negative age exeption 
 your entered age is 5


negative age exeption 
 your entered age is 789
