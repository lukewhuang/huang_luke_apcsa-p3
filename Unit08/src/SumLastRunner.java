//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{		
		int [] array = new int[] {-99,1,2,3,4,5,6,7,8,9,10,5};
		
		System.out.println(RaySumLast.go(array));
		
		int [] array2 = new int[] {10,9,8,7,6,5,4,3,2,1,-99};
		
		System.out.println(RaySumLast.go(array2));
	}
}