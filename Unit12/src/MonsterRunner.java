//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		String name1;
		int size1;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		name1 = keyboard.next(); 
		
		System.out.print("Enter 1st monster's size : ");
		size1 = keyboard.nextInt();
		
		//instantiate monster one
		
		Skeleton first = new Skeleton(name1, size1);
		
		//ask for name and size
		
		System.out.print("Enter 2nd monster's name : ");
		name1 = keyboard.next();

		System.out.print("Enter 2nd monster's size : ");
		size1 = keyboard.nextInt();
		
		//instantiate monster two
		
		Skeleton second = new Skeleton(name1, size1);
		
		
		System.out.println("Monster 1 -" + first);
		System.out.println("Monster 2 - " + second);
		
		
		if (first.isBigger(second))
			System.out.println("Monster one is bigger than Monster two.");
		else if (first.isSmaller((second)))
			System.out.println("Monster one is smaller than Monster two.");
		
		if (first.namesTheSame(second))
			System.out.println("Monster one has the same name as Monster two.");
		else 
			System.out.println("Monster one does not have the same name as Monster two.");
		
	}
}