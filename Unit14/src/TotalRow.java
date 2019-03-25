//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> sums = new ArrayList<Integer>();
    	
    	for(int[] gettingBinmauro : m)
    	{
    		int counter = 0;
    		for (int luk : gettingBinmauro)
    			counter += luk;
    		sums.add(counter);
    	}
    	
		return sums;
    }
}
