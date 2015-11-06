/**
 * 
 */
package pRedwood;


import java.util.Scanner;
/**
 * @author Peri Redwood
 *
 */



public class ContestantInput {
	/**
	 * Makes ContestantAge objects
	 */
	public ContestantInput() {
		
	}

	/**
	 * @param args
	 */
	static boolean ageOf = false;
	
	public static void main(String[] args) {
		boolean flag = false;

/**
 * 
 */
	do{
		flag = false;
		System.out.println("Please fill in the following fields below.");
		System.out.println("All contestants must be 18 years of age or older by November 15th, 2015.");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		ContestantInfo contestant1 = new ContestantInfo();	
/**
 * 		
 */
		do {
			flag = false;
			try {
			
				System.out.println("Day of Birth (dd): ");
				String day = scan.nextLine();
				int dob = Integer.parseInt(day);
				contestant1.setDOB(dob);
				
				}catch (InvalidInput iie) {
					flag = true;
					iie.printStackTrace();
						
				}catch (NumberFormatException nfe){
					flag = true;
					System.out.println("That is not a number. Please re-enter day of birth.");
				}
			} while (flag & ageOf);
/**
 * 
 */
		do {
			flag = false;
			try {
				System.out.println("Month of Birth (mm): ");
				String month = scan.nextLine();
				int mob = Integer.parseInt(month);
			
				contestant1.setMOB(mob);
				
				}catch (InvalidInput iie) {
					flag = true;
					iie.printStackTrace();
					
				}catch (NumberFormatException nfe){
					flag = true;
				System.out.println("That is not a number. Please re-enter month of birth.");
				}
			} while (flag & ageOf);
		
/**
 * 		
 */
		do {
			flag = false;
			try {
				System.out.println("Year of Birth (yyyy): ");
				String year = scan.nextLine();
				int yob = Integer.parseInt(year);
				contestant1.setYOB(yob);
				
				}catch (InvalidInput iie) {
					flag = true;
					iie.printStackTrace();
					
				}catch (NumberFormatException nfe){
					flag = true;
					System.out.println("That is not a number. Please re-enter year of birth.");
				}
			} while (flag & ageOf);
		
		
		System.out.println("First Name:");
		String first = scan.nextLine();
		
		System.out.println("Last Name: ");
		String last = scan.nextLine();
		
		System.out.println("Street name: ");
		String strName = scan.nextLine();
		
		System.out.println("Street number: ");
		String strNum = scan.nextLine();
		
		System.out.println("Address unit: ");
		String unit = scan.nextLine();	
		
		System.out.println("City: ");
		String city = scan.nextLine();
		
		System.out.println("Province(ex. ON): ");
		String prov = scan.nextLine();
		
		System.out.println("Postal code (No spaces): ");
		String postCode = scan.nextLine();
		
		System.out.println("Phone number (No spaces or dashes): ");
		String phone = scan.nextLine();
/**
 * 
 */
		do {
			flag = false;
			try {
				System.out.println("Skill Testing Questions!");
				System.out.println("Whats is 6 + 2 * 8?: ");
				String a1 = scan.nextLine();
				int ans1 = Integer.parseInt(a1);
				
				if (ans1 == 22){
					System.out.println("correct");
				}
				else {
					System.out.print("incorrect");
					flag = true;
				}
				}catch (NumberFormatException nfe){
					flag = true;
				System.out.println("That is not a number. Please re-enter your answer.");
				}
			
			} while (flag);
/**
 * 
 */
		do {
			flag = false;
			System.out.println("Some swords are sharp. All swords are rusty. "
					+ "Some rusty things are sharp. True or false?: ");
			String ans2 = scan.nextLine();
			
			if (ans2 == "True"){
				System.out.println("correct");}
			
			else{ 
				System.out.print("incorrect");
				flag = true;}
			} while (flag);
/**
 * 
 */
		do {
			flag = false;	
			System.out.println("Some doctors are fools. Some fools are rich."
					+ "Some doctors are rich. True or false?: ");
			String ans3 = scan.nextLine();
			if (ans3 == "False"){
				System.out.println("correct");}
			else{ 
				System.out.print("incorrect");
				flag = true;}
			} while (flag);
		

		System.out.println("Is all the information correct?(Y/N): ");
		String allInfo = scan.nextLine();
		
		System.out.println("Would you like to enter another contestant?(Y/N): ");
		String anotherContestant = scan.nextLine();
		
	 }while(flag & ageOf);
	}
/**
 * 	Will check to see if contestant is at least 18 years of age by the deadline of November 15, 2015.
 * @return
 */
	public boolean findAge() {
		ContestantInfo contestant1 = new ContestantInfo();
		
		int bornDay = contestant1.getDOB();
		int bornMonth = contestant1.getMOB();
		int bornYear = contestant1.getYOB();
		int qualYr = (bornYear - 1997);
		
		if (bornYear > 1997){
			System.out.println("You are to young to enter the contest. Please enter again in"+ qualYr + "years.");
			ageOf = true;
		}
		
		else{
			ageOf = false;
		}
		
		if (bornMonth> 11 & bornYear > 1997){
			System.out.println("You are to young to enter the contest. Please enter again in"+ qualYr + "years.");
			ageOf = true;
		}
		
		else {
			ageOf = false;
		}
		
		if (bornDay >15 & bornMonth> 11 & bornYear > 1997){
			System.out.println("You are to young to enter the contest. Please enter again in"+ qualYr + "years.");
			ageOf = true;
		}
		
		else {
			ageOf= true;
		}
	 return ageOf;
	}
	
}
