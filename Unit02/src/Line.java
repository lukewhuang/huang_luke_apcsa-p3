//© A+ Computer Science  -  www.apluscompsci.com
//Name - Luke Huang
//Date - 01 February 2019
//Class - APCSA Period 3 Mauro 
//Lab  - 

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double ydifference = y2 - y1;
		double xdifference = x2 - x1;
		
		return (ydifference / xdifference);
	}

}