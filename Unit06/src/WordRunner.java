//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word one = new Word ("Hello");
		System.out.println(one.toString());
		
		Word two = new Word("World");
		System.out.println(two.toString());
		
		Word three = new Word ("JukeBox");
		System.out.println(three.toString());
	}
}