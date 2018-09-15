import java.util.Scanner;

/**
 * A simple application to test use of String, Math, DecimalFormat and NumberFormat classes.
 *
 * @author CS121 instructors (starter code)
 * @author Your name
 */
public class MyNameIs
{
	/**
	 * @param args (unused)
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("First name: ");
		String firstName = keyboard.nextLine();

		System.out.print("Last name: ");
		String lastName = keyboard.nextLine();

		System.out.print("Enter a number: ");
		double n1 = keyboard.nextDouble();

		System.out.print("Enter another number (between 0 and 1): ");
		double n2 = keyboard.nextDouble();

		System.out.println("\nHi, my name is " + firstName + " " + lastName + ".");

		// TODO: Finish the program according to the lab specifications.

	}
}