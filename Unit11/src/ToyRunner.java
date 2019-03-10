//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sorry = new Toy("sorry", 1);
		Toy gijoe = new Toy("gi joe", 5);
		
		System.out.println(sorry.toString());
		System.out.println(gijoe.toString());
	}
}