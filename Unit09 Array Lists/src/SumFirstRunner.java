import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{	
		
		ArrayList<Integer> rayOne;
		rayOne = new ArrayList<Integer>();
		
		rayOne.add(-99);
		rayOne.add(1); rayOne.add(2); rayOne.add(3); rayOne.add(4); rayOne.add(5); rayOne.add(6); rayOne.add(7); rayOne.add(8);
		rayOne.add(9); rayOne.add(10); rayOne.add(5);
		
		System.out.println(ListSumFirst.go(rayOne));
	}
}