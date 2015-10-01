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
	 * Makes ContestantAge objects
	 */
	public ContestantAge() {
		
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		boolean flag = false;
		
		System.out.println("Please fill in the following fields below.");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		ContestantInfo contestant1 = new ContestantInfo();	
		
		do {
			flag = false;
			try {
			
				System.out.println("Day of Birth (dd): ");
				String day = scan.nextLine();
				int dob = Integer.parseInt(day);
		
				try {
					contestant1.setDOB(dob);
				
					} catch (InvalidInput iie) {
						flag = true;
						iie.printStackTrace();
					}
		
				} catch (InvalidInput iie) {
					flag = true;
				} catch (NumberFormatException nfe){
					System.out.println("That is not a number. Please re-enter day of birth.");
				}
			} while (flag);
/**
 * 
 */
		do {
			flag = false;
			try {
				System.out.println("Month of Birth (mm): ");
				String month = scan.nextLine();
				int mob = Integer.parseInt(month);
			
					try {
						contestant1.setMOB(mob);
					} catch (InvalidInput iie) {
						flag = true;
						iie.printStackTrace();
					}
				
			
				} catch (InvalidInput iie) {
					flag = true;
				} catch (NumberFormatException nfe){
				System.out.println("That is not a number. Please re-enter month of birth.");
				}
			} while (flag);
		
		do {
			flag = false;
			try {
				System.out.println("Year of Birth (yyyy): ");
				String year = scan.nextLine();
				int yob = Integer.parseInt(year);
			
					try {	
						contestant1.setYOB(yob);
					} catch (InvalidInput iie) {
						flag = true;
						iie.printStackTrace();
					}
		
				} catch (InvalidInput iie) {	
					flag = true;
				} catch (NumberFormatException nfe){
					System.out.println("That is not a number. Please re-enter year of birth.");
				}
			} while (flag);
		
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
		
		
	    System.out.println("Skill Testing Questions!");
		System.out.println("Whats is 6 + 2 * 8?: ");
	    String ans1 = scan.nextLine();
	    
	    System.out.println("Some swords are sharp. All swords are rusty. "
	    		+ "Some rusty things are sharp. True or false?: ");
	    
	    String a2 = scan.nextLine();
	    boolean ans2 = Boolean.parseBoolean(a2);
	    if (ans2 = true){
	    	String	answer2 = ("correct");}
	    else{ 
	    	String answer2 = ("incorrect");}
	    
	    System.out.println("Some doctors are fools. Some fools are rich."
	    		+ "Some doctors are rich. True or false?: ");
	    String a3 = scan.nextLine();
	    boolean ans3 = Boolean.parseBoolean(a3);
	    if (ans2 = false){
	    	String	answer3 = ("correct");}
	    else{ 
	    	String answer3 = ("incorrect");}
	}

}
