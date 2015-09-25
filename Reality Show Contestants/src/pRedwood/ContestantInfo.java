package pRedwood;

//import java.util.Scanner;
/**
 * 
 * @author 343171898
 *
 */
public class ContestantInfo {
	private String first, last, strName, strNum, unit, city, prov, postCode, phone;
	private int dob, mob, yob;
	public ContestantInfo() {
		
	}

//	public static void main(String[] args) {
//		System.out.print("Please fill in the following fields below.");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("First Name:");
//		String first = scan.nextLine();
//		System.out.println("Last Name: ");
//		String last = scan.nextLine();
//		System.out.println("Street name: ");
//		String strName = scan.nextLine();
//		System.out.println("Street number: ");
//		String strNum = scan.nextLine();
//		System.out.println("Address unit: ");
//		String unit = scan.nextLine();	
//		System.out.println("City: ");
//		String city = scan.nextLine();
//		System.out.println("Province(ex. ON): ");
//		String prov = scan.nextLine();
//		System.out.println("Postal code (No spaces): ");
//		String postCode = scan.nextLine();
//		System.out.println("Phone number (No spaces or dashes): ");
//		String phone = scan.nextLine();
//		System.out.println("Day of Birth(dd): ");
//		String dob = scan.nextLine();
//		System.out.println("Month of Birth(mm): ");
//		String mob = scan.nextLine();
//		System.out.println("Year of Birth(yyyy): ");
//		String yob = scan.nextLine();
//
//	}
/**
 * 	
 * @param first
 */
	public void setFirst(String first) {
		String firstName = first.substring(0, 1).toUpperCase() + first.substring(1);
		this.first = firstName;
	}
/**
 * 	
 * @return
 */
	public String getFirst() {
	
		return this.first;
	}
/**
 * 	
 * @param last
 */
	public void setLast(String last) {
		String lastName = last.substring(0, 1).toUpperCase() + last.substring(1);
		this.last = lastName;
	}
/**
 * 	
 * @return
 */
	public  String getLast(){
		return this.last;
	}
/**
 * 	
 * @param strName
 */
	public void setStrName(String strName) {
		String streetName = strName.substring(0, 1).toUpperCase() + strName.substring(1);
		this.strName = streetName;
	}
/**
 * 
 * @return
 */
	public  String getStrName(){
		return this.strName;
	}
/**
 * 
 * @param strNum
 */
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
/**
 * 
 * @return
 */
	public  String getStrNum(){
		return this.strNum;
	}
/**
 * 
 * @param unit
 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
/**
 * 
 * @return
 */
	public  String getUnit(){
		return this.unit;
	}

/**
 * 
 * @param city
 */
	public void setCity(String city) {
		String City = city.substring(0, 1).toUpperCase() + city.substring(1);
		this.city = City;
	}
/**
 * 
 * @return
 */
	public  String getCity(){
		return this.city;
	}
/**
 * 
 * @param prov
 */
	public void setProv(String prov) {
		this.prov = prov;
	}
/**
 * 
 * @return
 */
	public  String getProv(){
		return this.prov;
	}
/**
 * 
 * @param postCode
 * @throws InvalidInput
 */
	public void setPostCode(String postCode) throws InvalidInput {
		if (postCode.length()>6){
			throw new InvalidInput("Postal code must be only 6 characters. Please try again.");
		}
		
		else if (postCode.length()<6){
			throw new InvalidInput("Postal code entered is too short.Please try again.");
		}
		this.postCode = postCode;	
	}
/**
 * 
 * @return
 */
	public  String getPostCode(){
		return this.postCode;
	}
/**
 * 
 * @param phone
 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
/**
 * 
 * @param i 
 * @return
 */
	public  String getPhone(){
		return this.phone;
	}
/**
 * 
 * @param dob
 */
	public void setDOB(int dob) throws InvalidInput {
		
		this.dob = dob;
	}
/**
 * 
 * @return
 */
	public  int getDOB(){
		return this.dob;
	}
/**
 * 
 * @param mob
 */
	public void setMOB(int mob) {
		this.mob = mob;
	}
/**
 * 
 * @return
 */
	public  int getMOB(){
		return this.mob;
	}
/**
 * 
 * @param yob
 */
	public void setYOB(int yob) {
		this.yob = yob;
	}
/**
 * 
 * @return
 */
	public  int getYOB(){
		return this.yob;
	}
}
