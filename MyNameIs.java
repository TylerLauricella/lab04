import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * A simple application to test use of String, Math, DecimalFormat and NumberFormat classes.
 *
 * @author CS121 instructors, Mr. Erickson
 * @author Tyler Lauricella
 */
public class MyNameIs
{
	/**
	 * @param args (unused)
	 */
	
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
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
		System.out.println("\nYou'll find me under " + lastName + " " + firstName + ".");
		System.out.println("\nMy name badge " + firstName.charAt(0) + " " + lastName + ".");
		
		System.out.println(n2+ "%"+ " of " + n1 + " is " + df2.format(n1 * n2));
		System.out.println(n1+ " raised to the power of " + n2 + " is " + df2.format(Math.pow(n1, n2)));
		


	}
}