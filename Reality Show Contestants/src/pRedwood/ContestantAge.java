/**
 * 
 */
package pRedwood;

import java.util.Scanner;
/**
 * @author Peri Redwood
 *
 */

public class ContestantAge {

	/**
	 * 
	 */
	public ContestantAge() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Please fill in the following fields below.");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Day of Birth(dd): ");
		String dob = scan.nextLine();
		int day = Integer.parseInt(dob);
		
		System.out.println("Month of Birth(mm): ");
		String mob = scan.nextLine();
		int month = Integer.parseInt(mob);
		
		System.out.println("Year of Birth(yyyy): ");
		String yob = scan.nextLine();
		int year = Integer.parseInt(yob);
		
		ContestantInfo contestant1 = new ContestantInfo();
		contestant1.setDOB(day);
		contestant1.setMOB(month);
		contestant1.setYOB(year);
	}

}
