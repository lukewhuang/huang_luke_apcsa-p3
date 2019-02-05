//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare a = new WordsCompare();
		
		a.setWords("abe", "ape");
		a.compare();
		System.out.println(a.toString());
		a.setWords("ape", "abe");
		a.compare();
		System.out.println(a.toString());
		

	}
}