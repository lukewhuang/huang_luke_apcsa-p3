//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int strlen = str.length() - 1;
		
		for (int x=0; x< strlen ; x++) {
			if (str.charAt(x) == str.charAt(x+1)) {
				count++;
			}
		}
		return count;
	}
}