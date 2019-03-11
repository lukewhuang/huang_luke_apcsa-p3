//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int numerator = 0;
	int denominator = 0;
	
	//write two constructors
	public Rational()
	{
		setRational(0,0);
	}
	
	public Rational(int x, int y)
	{
		setRational(x,y);
	}
	//write a setRational method
	public void setRational(int x, int y)
	{
		setNumerator(x);
		setDenominator(y);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int num)
	{
		numerator = num;
	}
	
	public void setDenominator(int den)
	{
		denominator = den;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		setNumerator(numerator*other.getDenominator() + other.getNumerator() * denominator);
		setDenominator(denominator * other.getDenominator());

		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numerator, denominator);
		setNumerator(numerator/gcd);
		setDenominator(denominator/gcd);

	}

	private int gcd(int numOne, int numTwo)
	{
		int temp = 1;
		for (int i=1; i<=numOne; i++)
		{
			if (numOne % i == 0 && numTwo % i == 0)
				temp = i;
		}

		return temp;
	}

	public Object clone ()
	{
		return new Rational(numerator, denominator);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public boolean equals( Rational obj)
	{
		obj.reduce();
		
		if (numerator*getDenominator() - obj.getNumerator() * denominator == 0)
			return true;
		return false;
	}

	public int compareTo(Rational other)
	{
		other.reduce();
		int temp = numerator * other.getDenominator() - other.getNumerator() * denominator;
		if (temp > 0)
			return 1;
		else if (temp < 0)
			return -1;
		else
			return 0;
	}


	//write  toString() method
	
	public String toString()
	{
		return numerator + "/" + denominator;
	}
	
}