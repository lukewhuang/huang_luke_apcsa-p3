//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a > b) {
			return a - b;
		}
		else if (b > a) {
			return b - a;
		}
		else if (a == b) {
			return a * b;
		}
		else
			return 0.0;
	}
}