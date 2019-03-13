//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int size;

	//add a constructor
	
	public Skeleton()
	{
		setInfo("", 0);
	}
	public Skeleton(String str, int num)
	{
		setInfo(str, num);
	}

	public void setInfo(String str, int num)
	{
		name = str;
		size = num;
	}
	//add code to implement the Monster interface
	public int getHowBig()
	{
		return size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isBigger(Monster other)
	{
		return (size > other.getHowBig());
	}
	
	public boolean isSmaller(Monster other)
	{
		return (size < other.getHowBig());
	}
	
	public boolean namesTheSame (Monster other)
	{
		return (name.equals(other.getName()));
	}
	
	//add a toString
	
	public String toString()
	{
		return name + " " + size;
	}
}