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

	
/** 
 * @param mob
 */
	public void setMOB(int mob) throws InvalidInput {
		if (mob>= 1 || mob<=12){
			String validMonth = ("valid");}
		else{ 
			System.out.println("That is not a valid month of birth.");}
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
 * @param dob
 */
	public void setDOB(int dob) throws InvalidInput {
		
		if (dob>= 1 || dob<=31){
			String validDay = ("valid");}
		else{ 
			System.out.println("That is not a valid day of birth for this month.");}
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
 * @param yob
 */
	public void setYOB(int yob) throws InvalidInput {
		if (dob>= 1 || dob<=2015){
			String validYear = ("valid");}
		else{ 
			System.out.println("That is not a valid year of birth.");}
		this.yob = yob;
	}
/**
 * 
 * @return
 */
	public int getYOB(){
		return this.yob;
	}
/**
 * 	
 * @param first
 */
	public void setFirst(String first) {
		String firstName = first.substring(0, 1).toUpperCase() + first.substring(1, first.length());
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
		String lastName = last.substring(0, 1).toUpperCase() + last.substring(1, last.length());
		this.first = lastName;
	}
/**
 * 	
 * @return
 */
	public String getLast() {
	
		return this.first;
	}
/**
 * 	
 * @param strName
 */
	public void setStrName(String strName) {
		String streetName = strName.substring(0, 1).toUpperCase() + strName.substring(1, strName.length());
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
		String City = city.substring(0, 1).toUpperCase() + city.substring(1, city.length());
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
			throw new InvalidInput("Postal code entered is too long. It must be 6 characters. Please try again.");
		}
		
		else if (postCode.length()<6){
			throw new InvalidInput("Postal code entered is too short. It must be 6 characters. Please try again.");
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
 * @return
 */
	public String toString() {
	String orderedCIValues = (dob + " " + mob + " " + yob + " " + first + " " + last + " " + strName
				+ " " + strNum + " " + unit + " " + city + " " + prov + " " + postCode + " " + phone);
		return orderedCIValues;
	}
}
