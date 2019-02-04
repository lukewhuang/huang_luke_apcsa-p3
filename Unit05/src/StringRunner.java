//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word :: ");
		String value = keyboard.next();
	
		
		StringOddOrEven check = new StringOddOrEven(value);
		
		System.out.println(check.toString() );
	}
}