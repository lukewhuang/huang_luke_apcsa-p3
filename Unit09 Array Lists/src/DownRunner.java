import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{	
		ArrayList<Integer> test;
		test = new ArrayList<Integer>();
		
		test.add(-99);
		test.add(1); test.add(2); test.add(3); test.add(4); test.add(5); test.add(6); test.add(7); test.add(8);
		test.add(9); test.add(10); test.add(12345);
		
		System.out.println(ListDown.go(test));
		
	}
}