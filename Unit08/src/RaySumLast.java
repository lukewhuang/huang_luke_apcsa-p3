//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public RaySumLast() {
		go(new int[] {0} );
	}
	
	public RaySumLast(int[] array) {
		go(array);
	}

	public static int go(int[] ray)
	{
		int total = 0;
		int none = 0;
		
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] > ray [ray.length-1]){
				total += ray[i];
				none++;
			}
		}
		if (none == 0)
			return -1;
		else	
			return total;
	}
}