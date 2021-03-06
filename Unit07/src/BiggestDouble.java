//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;
	
	
	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double firstLargest = 0.0;
		double secondLargest = 0.0;
		
		if (two > one) {
			firstLargest = two;
		}
		else if (one > two) {
			firstLargest = one;
		}
		
		if (three > four) {
			secondLargest = three;
		}
		else if (four > three) {
			secondLargest = four;
		}
		
		if (firstLargest > secondLargest) {
			return firstLargest;
		}
		else 
			return secondLargest;
	}

	public String toString()
	{
	   return "biggest = " + getBiggest();
	}
}