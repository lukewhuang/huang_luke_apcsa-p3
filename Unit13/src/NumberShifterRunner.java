//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] testOne = NumberShifter.makeLucky7Array(20);
		NumberShifter.shiftEm(testOne);
		System.out.println(Arrays.toString(testOne));
		
		int[] testTwo = NumberShifter.makeLucky7Array(20);
		NumberShifter.shiftEm(testTwo);
		System.out.println(Arrays.toString(testTwo));
	}
}



