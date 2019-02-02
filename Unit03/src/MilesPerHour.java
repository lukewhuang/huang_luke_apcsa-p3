//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		
	}

	public void calcMPH()
	{
		double minhr = minutes / 60;
		mph = distance / (hours + minhr ); 
	}

	public void print()
	{
		System.out.println( distance + " in " + hours + " hour(s) and " + minutes + " minutes = " + mph + " MPH." );
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}