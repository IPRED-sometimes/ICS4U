/**
 * 
 */
package pRedwood;

/**
 * Takes a ContestantInformation object and outputs the information formated.
 * @author Peri Redwood
 *
 */
public class Label {
	private ContestantInfo ci1;
	private String output;
	private String output1;
	private String output2;
	private String output3;
	/**
	 * States names of constructors.
	 */
	public Label(ContestantInfo ci) {
		this.ci1= ci;
		formatName();
		formatAdress();
		formatNumber();
	}
/**
 * Formats contestants full name.
 */
	private void formatName(){
		output1 = (ci1.getLast() + ", " + ci1.getFirst());	
	}
/**
 * Formats the address of contestant.
 */
	private void formatAdress(){
		output2 = ( ci1.getStrNum()+ " " + ci1.getUnit()+ " " + ci1.getStrName());
	}
/**
 * Formats the phone number of contestant.
 */
	private void formatNumber(){
		output3 = ("(" + ci1.getPhone().charAt(0) + ci1.getPhone().charAt(1) + ci1.getPhone().charAt(2) + ") " + ci1.getPhone().charAt(3) + ci1.getPhone().charAt(4)
				+ ci1.getPhone().charAt(5) + "-" + ci1.getPhone().charAt(6) + ci1.getPhone().charAt(7) + ci1.getPhone().charAt(8) + ci1.getPhone().charAt(9));
	}
/**
 * 
 * @return
 */
	public String toString() {
		output = (output1+ "/n" + output2 +"/n" + output3);
		return output;
	}
}
