//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover one = new LetterRemover("I am Sam I am", 'a');
		System.out.println(one.toString());
		
		
		
		LetterRemover two = new LetterRemover("qwertyqwertyqwerty" , 'a');
		System.out.println(two.toString());
	}
}