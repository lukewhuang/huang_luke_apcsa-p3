//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;
	double largest = 0.0;
	
	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
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
		
		if (two > one) {
			two = largest;
		}
		else if (one < two) {
			one = largest;
		}
		
		if (one == largest) {
			if (one < three) {
				three = largest;
			}
			else if (one < four) {
				four = largest;
			}
		}
		
		if (two == largest) {
			if (two < four) {
				four = largest;
			}
			else if (two < three) {
				three = largest;
			}
			
		}
		
		if (three == largest) {
			if (four > three) {
				four = largest;
			}
		}
		
// not working
		return largest;
	}

	public String toString()
	{
	   return " ";
	}
}