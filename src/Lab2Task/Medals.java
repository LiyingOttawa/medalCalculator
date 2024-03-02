/**
 * File name: Medals.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 2
 * Date: 2023-09-24
 * Professor: Sandra Iroakazi
 * Purpose: The program class to print a table of medals counts for 8 countries
 */
package Lab2Task;

/**
 * This program prints a table with 8 countries as vertical Axis and 3 metal as
 * horizontal Axis and fill the count value based on given 2d array
 * 
 * @author Liying Guo
 * @version 1.0
 * @since 2023-09-24
 */
public class Medals {
	/**
	 * main method to do the following: given a 2d array represent the count of 3
	 * different metal for 8 different countries with 1 main loop with 1 inner loop
	 * to go through every element of the 2d array, print table with vertical Axis
	 * and horizontal Axis and the value of the element in the 2d array which
	 * represent the count of the country for specific metal. While looping through,
	 * add up some count for print total purpose
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// the int constant specify the amount of countries to list in table
		final int COUNTRIES = 8;
		// the int constant specify the number of type metal to list in table
		final int MEDALS = 3;

		// String array reference type variable declaration and initialization
		String[] countries = { "Canada", "Italy", "Germany", "Japan", "Kazakhstan", "Russia", "South Korea",
				"United States" };
		// 2D int array reference type variable declaration and initialization
		int[][] counts = { { 0, 3, 0 }, { 0, 0, 1 }, { 0, 0, 1 }, { 1, 0, 0 }, { 0, 0, 1 }, { 3, 1, 1 }, { 0, 1, 0 },
				{ 1, 0, 1 } };
		// totals[0] keep the total of gold
		// totals[1] keep the total of silver
		// totals[2] keep the total of Bronze
		int[] metalTotals = new int[3];

		System.out.println("        Country    Gold  Silver  Bronze   Total");

		// Print countries, counts, and row totals
		for (int i = 0; i < COUNTRIES; i++) {
			// Process the ith row
			// TO DO: Use printf() to print country name as a field of 15 bytes as a String
			// value:
			System.out.printf("%15s", countries[i]);

			int total = 0;

			// Print each row element and update the row total
			for (int j = 0; j < MEDALS; j++) {
				System.out.printf("%8d", counts[i][j]);
				// adding up the count of the specific metal
				metalTotals[j] += counts[i][j];

				// To DO: calculate the total for each row
				total = total + counts[i][j];
			}

			// Display the row total and print a new line
			// To Do: use printf() to print total for each row as a field of size 8 and
			// numeric data type. Include newline after printing each value
			System.out.printf("%8d\n", total);

		}

		// Extra - To DO: define an array of size 3 to hold the total for each column.
		// Modify the above code to keep total for each medal type, and then use a for
		// loop to print total line below
		System.out.printf("%15s", "Total");
		// Print out each total of different metal in one row
		for (int total : metalTotals) {
			System.out.printf("%8d", total);
		}
	}
}
