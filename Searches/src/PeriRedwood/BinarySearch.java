/**
 * 
 */
package PeriRedwood;

import java.util.Scanner;

/**
 * @author 343171898
 *
 */
public class BinarySearch {
	int[] a = {1,3,4,6,7,8,9,14,15,16,17,20,25,26,28,30,38,39,40,};
	/**
	 * 
	 */
	public BinarySearch() {
	}
/**
 * 
 * @param args
 */
	public static void main(String[] args){
		
	}
/**
 * 
 * @param x
 * @param a
 * @return
 */
	public static int binarySearch(int x, int[] a){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a target: ");
		String  tar = scan.nextLine();
		int target = Integer.parseInt(tar);
		int beginIndex = 0;
		int endIndex = a.length -1;
		boolean flag = (false);
		do{
			int midIndex = (beginIndex + endIndex)/2;
			if (a[midIndex]<target){
				beginIndex = midIndex + 1;	
				flag = false;
			}
			
			if (a[midIndex]>target){
				endIndex = midIndex - 1;
				flag = false;
			}
			if (a[midIndex]==target){
				flag = true;
				int position = (midIndex);
//				System.out.print("Target " + target + "found at" + a[midIndex] + ".");
				return (position);
			}
		  }while (flag);
		return(-1);
	}

}
