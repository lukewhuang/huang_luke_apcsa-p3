//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid test = new Grid(7, 7, new String[] {"a", "b", "c", "d", "e", "f", "g"});
		System.out.println(test);
		System.out.println(test.findMax( new String[] {"a", "b", "c", "d", "e", "f", "g"}) + " occurs the most.");
		
		Grid test2 = new Grid(4, 4, new String[] {"a", "b", "c", "d"});
		System.out.println(test2);
		System.out.println(test2.findMax( new String[] {"a", "b", "c", "d"}) + " occurs the most.");
	}
}