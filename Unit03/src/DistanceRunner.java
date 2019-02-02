//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Distance dist = new Distance();
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter X1 :: ");
		int p1 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		int p2 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		int p3 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		int p4 = keyboard.nextInt();
		
		dist.setCoordinates(p1, p2, p3 ,p4);
		dist.calcDistance();
		dist.print();
		
		keyboard.close();
		}
}