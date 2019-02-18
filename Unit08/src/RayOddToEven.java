//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd =0;
		int even = 0;
		int oddDistance = 0;
		int evenDistance = 0;
		
		for (int i=0; i < ray.length-1 ; i++) {
			if (ray[i]%2 != 0) {
				oddDistance = i;
				odd = ray[i];
				break;
			}
		}
		for (int i = oddDistance ; i<ray.length; i++) {
			if (ray[i]%2 == 0)
			{
				evenDistance = i;
				even = ray[i];
				break;
			}
		}
		
		if (evenDistance > oddDistance) 
			return (evenDistance - oddDistance);
		else
			return (-1);
	}
}