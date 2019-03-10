//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String str = "y";
		
		while (str.equals("y") || str.contentEquals("Y"))
		{
			System.out.print("Enter a word : :");
			String temp = keyboard.next();
			
			TriangleWord.printTriangle(temp);
			
			System.out.print("Do you want ot enter more sample input?");
			str = keyboard.next();
			
			System.out.print("\n");
		}
	}
}