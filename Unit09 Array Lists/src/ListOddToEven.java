//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOdd;
		int firstEven;
		int oddIndex = 0;
		int evenIndex = 0;
		int counter = -1;
		
		for (int i=0; i<ray.size(); i++) {
			if (ray.get(i) % 2 != 0)
			{
				firstOdd = ray.get(i);
				oddIndex = i;
				break;
			}
		}
		
		for (int j= oddIndex; j<ray.size(); j++) {
			if (ray.get(j) % 2 == 0)
			{
				firstEven = ray.get(j);
				evenIndex = j;
				counter++;
				break;
			}
		}
		
		if (counter != -1)
		{
			return (evenIndex - oddIndex);
		}
		else
			return counter;
	}
}