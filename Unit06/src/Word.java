//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = " ";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return (word.charAt(0));
	}

	public char getLastChar()
	{
		return (word.charAt(word.length() - 1));
	}

	public String getBackWards()
	{
		String back="";
		for(int x = word.length()-1; x >= 0; x--) {
			back += word.charAt(x);
		}
		return back;
	}

 	public String toString()
 	{
 		return (getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word);
	}
}