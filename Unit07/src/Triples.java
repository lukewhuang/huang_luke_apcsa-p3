//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i=1; i<=a; i++)
		{
			if (a % i == 0 && b % i == 0 && c % i == 0)
			{
				max = i;
			}
		}
		return max;
	}

	public String toString()
	{
		String output="";

		for (int sideOne = 1; sideOne < number; sideOne++)
		{
			for (int sideTwo = 1; sideTwo < number ; sideTwo++)
			{
				for (int sideThree = 1; sideThree < number; sideThree++)
				{
					if ((sideOne + sideTwo) % 2 == 1 && sideThree % 2 == 1 
							&& Math.abs(Math.pow(sideOne,2) + Math.pow(sideTwo,2) 
							- Math.pow(sideThree,2)) <= 0.1 
							&& greatestCommonFactor(sideOne, sideTwo, sideThree) == 1) 
					{
						output += sideOne + " " + sideTwo + " " + sideThree + "\n";
					}
				}
			}
		}
		
		return output +"\n";
	}
}