package pRedwood;
/**
 * This program prompts user to enter first and last name, 
 * and displays a greeting message
 * @author 343171898
 *
 */
import java.util.Scanner;
public class Greetings2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String first = scan.nextLine();
		System.out.println("Enter your last name: ");
		String last = scan.nextLine();
		System.out.println("Hello " + first + " " + last + "!");
		System.out.println("Welcome to Java!");
		

	}

}
