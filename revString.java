/*
Kyle Goodwin
Assignment 18.12
09/07/2017
COMSC-076
Estrada
*/

import java.util.Scanner;

public class revString
{
	public static void main(String[] args) //main method
	{

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter phrase to be reversed: ");
		String value = keyboard.nextLine();

		reverseDisplay(value);
	}

	public static void reverseDisplay(String value) //original recursive
	{
		reverseDisplay(value, value.length() - 1);
	}

	public static void reverseDisplay(String value, int high) //helper method
	{
		if(high < 0) //base case, if the charAt position is less than the 0 position of the string, then println and end of program
		{
			System.out.println();
		}
		else //repeating method
		{
			System.out.print(value.charAt(high));
			high--;
			reverseDisplay(value, high);
		}
	}
}