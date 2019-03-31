//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (Math.pow(10, count) < number)
			count++;
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int num = getNumDigits(number);
		int[] sorted = new int[num];
		for (int i=0; i<num; i++)
		{
			sorted[i] = (number/(int)Math.pow(10, i) % 10);
		}
		for (int k=1; k<num; k++)
		{
			int temp = sorted[k];
			int check = k;
		
			while (check>0 && sorted[check-1] > temp)
			{
				sorted[check] = sorted[check-1];
				check--;
			}
			sorted[check] = temp;
		}
		
		return sorted;
	}
}